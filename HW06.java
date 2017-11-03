import java.io.*;
public class app1 {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String name,sex,being;
		int year;

		//input--- 
		System.out.print("請輸入你的姓名：");
		name = buf.readLine();
		System.out.print("請輸入你的性別：");
		sex = buf.readLine();
		System.out.print("請輸入你的西元出生年份：");
		year = Integer.parseInt(buf.readLine());
		System.out.print("請輸入你的出生地：");
		being = buf.readLine();
		
		//output--- 
		System.out.println("姓名：" + name);
		System.out.println("性別：" + sex);
		System.out.println("西元出生年份：" + year);
		System.out.println("出生地：" + being);
	}
}