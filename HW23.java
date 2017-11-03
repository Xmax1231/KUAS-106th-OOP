import java.io.*;
public class HW23{
	public static void main(String[] argv) throws IOException{
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		int num, i, ch;
		int g[] = new int[5];
		String gg[] = {"0~59","60~69","70~79","80~89","90~100"};
		char ans = 0;

		System.out.print("�п�J�ǥͪ��H��:");
		num = Integer.parseInt(buf.readLine());
		int usually[] = new int[num];
		int mid[] = new int[num];
		int fin[] = new int[num];
		double end[] = new double[num];
		int usually_max, usually_min, mid_max, mid_min, fin_max, fin_min, end_max, end_min;
		usually_max = usually_min = mid_max = mid_min = fin_max = fin_min = end_max = end_min = -1;

		for(i=0; i<num; i++){
			System.out.print("�п�J�ǥ�" + (i+1) + "�����ɦ��Z:");
			usually[i] = Integer.parseInt(buf.readLine());
			if(usually_max == -1 || usually[usually_max] < usually[i])usually_max = i;
			if(usually_min == -1 || usually[usually_max] > usually[i])usually_min = i;
			System.out.print("�п�J�ǥ�" + (i+1) + "���������Z:");
			mid[i] = Integer.parseInt(buf.readLine());
			if(mid_max == -1 || mid[mid_max] < mid[i])mid_max = i;
			if(mid_min == -1 || mid[mid_max] > mid[i])mid_min = i;
			System.out.print("�п�J�ǥ�" + (i+1) + "���������Z:");
			fin[i] = Integer.parseInt(buf.readLine());
			if(fin_max == -1 || fin[fin_max] < fin[i])fin_max = i;
			if(fin_min == -1 || fin[fin_max] > fin[i])fin_min = i;
			end[i] = (usually[i]*0.3) + (mid[i]*0.35) + (fin[i]*0.35);
			if(end_max == -1 || end[end_max] < end[i])end_max = i;
			if(end_min == -1 || end[end_max] > end[i])end_min = i;
			if(end[i]>=0 && end[i]<=59)
				g[0] += 1;
			else if(end[i]>59 && end[i]<=69)
				g[1] += 1;
			else if(end[i]>69 && end[i]<=79)
				g[2] += 1;
			else if(end[i]>79 && end[i]<=89)
				g[3] += 1;
			else if(end[i]>89 && end[i]<=100)
				g[4] += 1;
		}

		int choice;
		char choice1;
		do{
			System.out.print("�п�J�A�n���\��(1. ��ܨC�Ӿǥͪ��������Z�B2. �C�X�Ǵ����Z���ή檺�P�ǤΤ��ơB3. ��ܦU�Ӥ��ƪ��նZ���H�ơB4. �d�߬Y�@�Ӿǥͪ����Z�B5. ���ϥΪ̿�ܭn�C�X���@�ئ��Z���̰��γ̧C��):");
			ch = Integer.parseInt(buf.readLine());
			switch(ch){
				case 1:
					System.out.println("�ǥ�\t����\t����\t����\t�Ǵ�");
					for(i=0; i<num; i++){
						System.out.println((i+1)+"\t"+usually[i]+"\t"+mid[i]+"\t"+fin[i]+"\t"+end[i]);
					}
					break;
				case 2:
					System.out.println("�ǥ�\t�Ǵ�");
					for(i=0; i<num; i++){
						if(end[i]<60)
							System.out.println(num+"\t"+end[i]);
					}
					break;
				case 3:
					for(i=0; i<g.length; i++){
						if(g[i]>0)
							System.out.println(gg[i]+"\t"+g[i]);
					}
					break;
				case 4:
					System.out.print("�п�J�A�n���ǥ�:");
					choice = Integer.parseInt(buf.readLine())-1;
					System.out.println((choice+1)+"\t"+usually[choice]+"\t"+mid[choice]+"\t"+fin[choice]+"\t"+end[choice]);
					break;
				case 5:
					System.out.print("�п�ܦC�X���@�ئ��Z���̰��γ̧C��:(a�G���ɦ��Z�Bb�G�������Z�Bc�G�������Z�Bd�G�Ǵ����Z)");
					choice1 = buf.readLine().charAt(0);
					switch(choice1){
						case 'a':
							System.out.println("���ɦ��Z�̰����G" + usually[usually_max] + ", �̧C���G" + usually[usually_min]);
							break;
						case 'b':
							System.out.println("�������Z�̰����G" + mid[mid_max] + ", �̧C���G" + mid[mid_min]);
							break;
						case 'c':
							System.out.println("�������Z�̰����G" + fin[fin_max] + ", �̧C���G" + fin[fin_min]);
							break;
						case 'd':
							System.out.println("�Ǵ����Z�̰����G" + end[end_max] + ", �̧C���G" + end[end_min]);
							break;
						default:
							System.out.println("�L���\��I");
							break;
					}
					break;
				default:
					System.out.println("�L���\��I");
					break;
			}
			System.out.print("�O�_�~��ާ@(Y/N):");
			ans = buf.readLine().charAt(0);
		}while(ans == 'Y');
		System.out.println("�����{��");
	}
}