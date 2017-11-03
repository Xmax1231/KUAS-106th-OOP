import java.io.*;
public class app1 {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int year;
		System.out.print("請輸入西元年份：");
		year = Integer.parseInt(buf.readLine());
		if((year % 4 == 0) & ((year % 100 != 0) | (year % 400 == 0))){
			System.out.print("西元" + year);
			System.out.print("年是閏年");
		}else{
			System.out.print("西元" + year);
			System.out.print("年不是閏年");
		}
	}
}