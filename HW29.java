import java.io.*;
public class HW29{
	public static double input_score() throws IOException{
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		int flag=0;
		double ans;
		do{
			System.out.print("��J�`����������: ");
			ans = Double.parseDouble(buf.readLine());
			flag = 1;
			if(ans<0||ans>100){
				System.out.println("��J�榡���~�A�Э��s��J�C");
				flag = 0;
			}
		}while(flag!=1);
		return ans;
	}
	public static int input_data(String[] name, double[] score) throws IOException{
		int i;
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("��J�ǥͪ��H��: ");
		int num = Integer.parseInt(buf.readLine()), count=0;
		char ans = 0;
		for(i=0; i<num;){
			System.out.print("��J�ǥͦW��: ");
			name[i] = buf.readLine();
			score[i] = input_score();
			count++;
			if(++i<num){
				System.out.print("�O�_�~���J���Z(Y/N): ");
				ans = buf.readLine().charAt(0);
				if(ans == 'N')
					break;
			}
		}
		return count;
	}
	public static void show_all(String[] name, double[] score, int n) throws IOException{
		int i,failed=0;
		for(i=0; i<n; i++){
			if(score[i]<60)
				failed++;
		}
		System.out.println("�ή�H��: " + (n-failed) + ", ���ή�H��: " + failed);
	}
	public static void show_high(String[] name, double[] score, int n) throws IOException{
		int i,high=0;
		for(i=0; i<n; i++){
			if(score[i]>score[high])
				high = i;
		}
		System.out.println("�̰����y��: "+(high+1)+"\t�m�W: "+name[high]);
	}
	public static void show_low(String[] name, double[] score, int n) throws IOException{
		int i,low=0;
		for(i=0; i<n; i++){
			if(score[i]<score[low])
				low = i;
		}
		System.out.println("�̧C���y��: "+(low+1)+"\t�m�W: "+name[low]);
	}
	public static void show_failed(String[] name, double[] score, int n) throws IOException{
		int i;
		for(i=0; i<n; i++){
			if(score[i]<60)
				System.out.println("�y��: "+(i+1)+"\t�m�W: "+name[i]);
		}	
	}
	public static void edit(String[] name, double[] score, int n) throws IOException{
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�ק�y��: ");
		int id = Integer.parseInt(buf.readLine())-1;
		while((id<0) || (id>=n)){
			System.out.println("�L���y���I");
			System.out.print("�ק�y��: ");
			id = Integer.parseInt(buf.readLine())-1;
		}
		System.out.print("�ק� "+(id+1)+" "+name[id]+" ���`����: ");
		score[id]=Double.parseDouble(buf.readLine());
	}
	public static void show(String[] name, double[] score, int n) throws IOException{
		int i;
		System.out.println("�ǥͦW��\t�y��\t�`����");
		for(i=0; i<n; i++){
			System.out.println(name[i]+"\t\t"+(i+1)+"\t"+score[i]);
		}
	}
	public static void show_group(String[] name, double[] score, int n) throws IOException{
		int i,g[]=new int[5];
		String g_name[] = {"0~59: ", "60~69: ", "70~79: ", "80~89: ", "90~100: "};
		for(i=0; i<n; i++){
			if(score[i]<60)
				g[0]++;
			else if((score[i]>=60)&&(score[i]<70))
				g[1]++;
			else if((score[i]>=70)&&(score[i]<80))
				g[2]++;
			else if((score[i]>=80)&&(score[i]<90))
				g[3]++;
			else if(score[i]>=90)
				g[4]++;
		}
		for(i=0; i<5; i++){
			if(g[i]!=0)
				System.out.println(g_name[i]+": "+g[i]);
		}
	}
	public static void run(String[] name, double[] score, int n) throws IOException{
		int ch;
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		do{
			System.out.println("");
			System.out.println("(1 ��ܤή�H�ƩM���ή�H��\n(2 ��̰ܳ����y���Ωm�W\n(3 ��̧ܳC���y���Ωm�W\n(4 �C�X�U�ӲնZ���H��\n(5 �C�X���ή檺�ǥͮy���Ωm�W\n(6 �ק�ǥͦ��Z\n(7 ���}");
			System.out.print("�п�ܳB�z�覡: ");
			ch = Integer.parseInt(buf.readLine());
			switch(ch){
				case 1:
					show_all(name, score, n);
					break;
				case 2:
					show_high(name, score, n);
					break;
				case 3:
					show_low(name, score, n);
					break;
				case 4:
					show_group(name, score, n);
					break;
				case 5:
					show_failed(name, score, n);
					break;
				case 6:
					edit(name, score, n);
					show(name, score, n);
					break;
				case 7:
					System.out.println("�����{��!");
					break;
				default:
					System.out.println("�L���\��!");
					break;
			}
		}while(ch!=7);
	}
	public static void main(String[] argv) throws IOException{
		String name[] = new String[99];
		double score[] = new double[99];
		int n = input_data(name, score);
		show(name, score, n);
		run(name, score, n);
	}
}