/*
 * 2017/11/01 第八周作業-實習2
 * HW31.java
 */
import java.io.*;
public class HW31{
	static void calArea(int r){
		System.out.println("這是一個圓形，面積為：" + (r*r*3.14));
	}
	static void calArea(int x, int y){
		System.out.println("這是一個矩形，面積為：" + (x*y));
	}
	static void calArea(int a, int b, int c){
		int max = Math.max(Math.max(a,b),c);
		int min = Math.min(Math.min(a,b),c);
		int mid = a+b+c-max-min;
		if(Math.pow(max,2) == (Math.pow(min,2)+Math.pow(mid,2))){
			System.out.println("這是一個直角三角形，面積為："+(min*mid/2));
		}else{
			System.out.println("很抱歉您輸入的不是直角三形，我無法幫你計算面積。");
		}
	}
	public static void main(String[] args)throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("請輸入數值：");
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
				System.out.println("僅只能輸入至少一個和三個以內的值");
				break;
		}
	}
}