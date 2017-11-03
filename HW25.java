import java.io.*;
public class HW25{
	public static double circle(double r){
		return r*r*3.14;
	}
	public static double square(int x){
		return x*x;
	}
	public static double rectangle(int x, int y){
		return x*y;
	}
	public static double trapezium(int x1, int x2, int y){
		return (x1+x2)*y/2;
	}
	public static void main(String[] argv) throws IOException{
		System.out.println("圓形面積(r=2.5)： " + circle(2.5));
		System.out.println("正方形面積(x=3)： " + square(3));
		System.out.println("矩形面積(x=4, y=8)： " + rectangle(4,8));
		System.out.println("梯形面積(x1=5, x2=6, y=2)： " + trapezium(5,6,2));
	}
}