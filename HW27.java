import java.io.*;
public class HW27{
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
		int num = Integer.parseInt(buf.readLine());
		for(i=0; i<num; i++){
			System.out.print("輸入學生名稱: ");
			name[i] = buf.readLine();
			score[i] = input_score();
		}
		return num;
	}
	public static void show(String[] name, double[] score, int n) throws IOException{
		int i;
		System.out.println("學生名稱\t總平均");
		for(i=0; i<n; i++){
			System.out.println(name[i]+"\t\t"+score[i]);
		}
	}
	public static void main(String[] argv) throws IOException{
		String name[] = new String[99];
		double score[] = new double[99];
		int n = input_data(name, score);
		show(name, score, n);
	}
}