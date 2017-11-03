/*
 * 2017/11/01 �ĤK�P�@�~-���2
 * HW31.java
 */
import java.io.*;
public class HW31{
	static void calArea(int r){
		System.out.println("�o�O�@�Ӷ�ΡA���n���G" + (r*r*3.14));
	}
	static void calArea(int x, int y){
		System.out.println("�o�O�@�ӯx�ΡA���n���G" + (x*y));
	}
	static void calArea(int a, int b, int c){
		int max = Math.max(Math.max(a,b),c);
		int min = Math.min(Math.min(a,b),c);
		int mid = a+b+c-max-min;
		if(Math.pow(max,2) == (Math.pow(min,2)+Math.pow(mid,2))){
			System.out.println("�o�O�@�Ӫ����T���ΡA���n���G"+(min*mid/2));
		}else{
			System.out.println("�ܩ�p�z��J�����O�����T�ΡA�ڵL�k���A�p�⭱�n�C");
		}
	}
	public static void main(String[] args)throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�п�J�ƭȡG");
		String inp[] = buf.readLine().split(",");
		// System.out.println(inp.length);
		switch(inp.length){
			case 1:
				calArea(Integer.parseInt(inp[0]));
				break;
			case 2:
				calArea(Integer.parseInt(inp[0]),Integer.parseInt(inp[1]));
				break;
			case 3:
				calArea(Integer.parseInt(inp[0]),Integer.parseInt(inp[1]),Integer.parseInt(inp[2]));
				break;
			default:
				System.out.println("�ȥu���J�ܤ֤@�өM�T�ӥH������");
				break;
		}
	}
}