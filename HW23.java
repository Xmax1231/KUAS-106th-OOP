import java.io.*;
public class HW23{
	public static void main(String[] argv) throws IOException{
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		int num, i, ch;
		int g[] = new int[5];
		String gg[] = {"0~59","60~69","70~79","80~89","90~100"};
		char ans = 0;

		System.out.print("請輸入學生的人數:");
		num = Integer.parseInt(buf.readLine());
		int usually[] = new int[num];
		int mid[] = new int[num];
		int fin[] = new int[num];
		double end[] = new double[num];
		int usually_max, usually_min, mid_max, mid_min, fin_max, fin_min, end_max, end_min;
		usually_max = usually_min = mid_max = mid_min = fin_max = fin_min = end_max = end_min = -1;

		for(i=0; i<num; i++){
			System.out.print("請輸入學生" + (i+1) + "的平時成績:");
			usually[i] = Integer.parseInt(buf.readLine());
			if(usually_max == -1 || usually[usually_max] < usually[i])usually_max = i;
			if(usually_min == -1 || usually[usually_max] > usually[i])usually_min = i;
			System.out.print("請輸入學生" + (i+1) + "的期中成績:");
			mid[i] = Integer.parseInt(buf.readLine());
			if(mid_max == -1 || mid[mid_max] < mid[i])mid_max = i;
			if(mid_min == -1 || mid[mid_max] > mid[i])mid_min = i;
			System.out.print("請輸入學生" + (i+1) + "的期末成績:");
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
			System.out.print("請輸入你要的功能(1. 顯示每個學生的全部成績、2. 列出學期成績不及格的同學及分數、3. 顯示各個分數的組距的人數、4. 查詢某一個學生的成績、5. 讓使用者選擇要列出哪一種成績的最高及最低分):");
			ch = Integer.parseInt(buf.readLine());
			switch(ch){
				case 1:
					System.out.println("學生\t平時\t期中\t期末\t學期");
					for(i=0; i<num; i++){
						System.out.println((i+1)+"\t"+usually[i]+"\t"+mid[i]+"\t"+fin[i]+"\t"+end[i]);
					}
					break;
				case 2:
					System.out.println("學生\t學期");
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
					System.out.print("請輸入你要的學生:");
					choice = Integer.parseInt(buf.readLine())-1;
					System.out.println((choice+1)+"\t"+usually[choice]+"\t"+mid[choice]+"\t"+fin[choice]+"\t"+end[choice]);
					break;
				case 5:
					System.out.print("請選擇列出哪一種成績的最高及最低分:(a：平時成績、b：期中成績、c：期末成績、d：學期成績)");
					choice1 = buf.readLine().charAt(0);
					switch(choice1){
						case 'a':
							System.out.println("平時成績最高分：" + usually[usually_max] + ", 最低分：" + usually[usually_min]);
							break;
						case 'b':
							System.out.println("期中成績最高分：" + mid[mid_max] + ", 最低分：" + mid[mid_min]);
							break;
						case 'c':
							System.out.println("期末成績最高分：" + fin[fin_max] + ", 最低分：" + fin[fin_min]);
							break;
						case 'd':
							System.out.println("學期成績最高分：" + end[end_max] + ", 最低分：" + end[end_min]);
							break;
						default:
							System.out.println("無此功能！");
							break;
					}
					break;
				default:
					System.out.println("無此功能！");
					break;
			}
			System.out.print("是否繼續操作(Y/N):");
			ans = buf.readLine().charAt(0);
		}while(ans == 'Y');
		System.out.println("結束程式");
	}
}