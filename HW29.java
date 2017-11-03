import java.io.*;
public class HW29{
	public static double input_score() throws IOException{
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		int flag=0;
		double ans;
		do{
			System.out.print("輸入總平均的分數: ");
			ans = Double.parseDouble(buf.readLine());
			flag = 1;
			if(ans<0||ans>100){
				System.out.println("輸入格式錯誤，請重新輸入。");
				flag = 0;
			}
		}while(flag!=1);
		return ans;
	}
	public static int input_data(String[] name, double[] score) throws IOException{
		int i;
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("輸入學生的人數: ");
		int num = Integer.parseInt(buf.readLine()), count=0;
		char ans = 0;
		for(i=0; i<num;){
			System.out.print("輸入學生名稱: ");
			name[i] = buf.readLine();
			score[i] = input_score();
			count++;
			if(++i<num){
				System.out.print("是否繼續輸入成績(Y/N): ");
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
		System.out.println("及格人數: " + (n-failed) + ", 不及格人數: " + failed);
	}
	public static void show_high(String[] name, double[] score, int n) throws IOException{
		int i,high=0;
		for(i=0; i<n; i++){
			if(score[i]>score[high])
				high = i;
		}
		System.out.println("最高分座號: "+(high+1)+"\t姓名: "+name[high]);
	}
	public static void show_low(String[] name, double[] score, int n) throws IOException{
		int i,low=0;
		for(i=0; i<n; i++){
			if(score[i]<score[low])
				low = i;
		}
		System.out.println("最低分座號: "+(low+1)+"\t姓名: "+name[low]);
	}
	public static void show_failed(String[] name, double[] score, int n) throws IOException{
		int i;
		for(i=0; i<n; i++){
			if(score[i]<60)
				System.out.println("座號: "+(i+1)+"\t姓名: "+name[i]);
		}	
	}
	public static void edit(String[] name, double[] score, int n) throws IOException{
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("修改座號: ");
		int id = Integer.parseInt(buf.readLine())-1;
		while((id<0) || (id>=n)){
			System.out.println("無此座號！");
			System.out.print("修改座號: ");
			id = Integer.parseInt(buf.readLine())-1;
		}
		System.out.print("修改 "+(id+1)+" "+name[id]+" 的總平均: ");
		score[id]=Double.parseDouble(buf.readLine());
	}
	public static void show(String[] name, double[] score, int n) throws IOException{
		int i;
		System.out.println("學生名稱\t座號\t總平均");
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
			System.out.println("(1 顯示及格人數和不及格人數\n(2 顯示最高分座號及姓名\n(3 顯示最低分座號及姓名\n(4 列出各個組距的人數\n(5 列出不及格的學生座號及姓名\n(6 修改學生成績\n(7 離開");
			System.out.print("請選擇處理方式: ");
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
					System.out.println("結束程式!");
					break;
				default:
					System.out.println("無此功能!");
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