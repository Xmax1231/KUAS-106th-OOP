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
		System.out.println("��έ��n(r=2.5)�G " + circle(2.5));
		System.out.println("����έ��n(x=3)�G " + square(3));
		System.out.println("�x�έ��n(x=4, y=8)�G " + rectangle(4,8));
		System.out.println("��έ��n(x1=5, x2=6, y=2)�G " + trapezium(5,6,2));
	}
}