import java.io.*;
public class app{
	public static void main(String[] args)throws  IOException{
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		int x;
		do{
			System.out.print("��J���t���šG");
			x = Integer.parseInt(buf.readLine());
		}while((x < 8) || (x > 17));
		if((x>=8) && (x<=11))
			System.out.print("���t����" + x + "���G���׻䭷");
		else if((x>=12) && (x<=15))
			System.out.print("���t����" + x + "���G���׻䭷");
		else if((x>=16) && (x<=17))
			System.out.print("���t����" + x + "���G�j�P�䭷");
	}
}