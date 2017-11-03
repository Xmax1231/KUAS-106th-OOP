import java.io.*;
public class app1 {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int sec,s,m,h,d;

		System.out.print("請輸入秒數：");
		sec = Integer.parseInt(buf.readLine());

		d = sec / 86400;
		sec -= d * 86400;
		h = sec / 3600;
		sec -= h * 3600;
		m = sec / 60;
		sec -= m * 60;

		System.out.print("共經過了：");
		if(d > 0)
			System.out.print(d + " 天 ");
		if(h > 0)
			System.out.print(h + " 小時 ");
		if(m > 0)
			System.out.print(m + " 分鐘 ");
		if(sec > 0)
			System.out.print(sec + " 秒");
	}
}