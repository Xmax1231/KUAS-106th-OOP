import java.io.*;
public class app1 {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int sec,s,m,h,d;

		System.out.print("�п�J��ơG");
		sec = Integer.parseInt(buf.readLine());

		d = sec / 86400;
		sec -= d * 86400;
		h = sec / 3600;
		sec -= h * 3600;
		m = sec / 60;
		sec -= m * 60;

		System.out.print("�@�g�L�F�G");
		if(d > 0)
			System.out.print(d + " �� ");
		if(h > 0)
			System.out.print(h + " �p�� ");
		if(m > 0)
			System.out.print(m + " ���� ");
		if(sec > 0)
			System.out.print(sec + " ��");
	}
}