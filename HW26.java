import java.io.*;
public class HW26{
	public static int fac(int n){
		if(n==1)
			return 5;
		else if(n==2)
			return 6;
		else
			return fac(n-1)+fac(n-2);
	}
	public static void main(String[] argv) throws IOException{
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("請輸入變形費氏數列的第幾項： ");		
		int n = Integer.parseInt(buf.readLine());
		System.out.println("第"+n+"項費氏數列的值為： "+fac(n));
	}
}