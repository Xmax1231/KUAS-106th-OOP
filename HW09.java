import java.io.*;
public class app1 {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int year;
		System.out.print("�п�J�褸�~���G");
		year = Integer.parseInt(buf.readLine());
		if((year % 4 == 0) & ((year % 100 != 0) | (year % 400 == 0))){
			System.out.print("�褸" + year);
			System.out.print("�~�O�|�~");
		}else{
			System.out.print("�褸" + year);
			System.out.print("�~���O�|�~");
		}
	}
}