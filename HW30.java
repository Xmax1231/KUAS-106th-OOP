/*
 * 2017/11/01 第八周作業-實習1
 * HW30.java
 */
import java.io.*;
public class HW30{
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
		int side = 0, a = 0, b = 0, c = 0;
		char ans = 'y';
		do{
			side++;
			System.out.println("請輸入第 "+side+" 個數值: ");
			switch(side){
				case 1:
					a = Integer.parseInt(buf.readLine());
					break;
				case 2:
					b = Integer.parseInt(buf.readLine());
					break;
				case 3:
					c = Integer.parseInt(buf.readLine());
					break;
			}
			if(side==3)break;
			System.out.print("請問是否有第"+(side+1)+"個數值要輸入?(y/n)：");
			ans = buf.readLine().charAt(0);
		}while(ans == 'y');
		//根據輸入幾個邊去給Method值
		switch(side){
			case 1:
				calArea(a);
				break;
			case 2:
				calArea(a,b);
				break;
			case 3:
				calArea(a,b,c);
				break;
		}
	}
}