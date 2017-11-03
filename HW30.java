/*
 * 2017/11/01 �ĤK�P�@�~-���1
 * HW30.java
 */
import java.io.*;
public class HW30{
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
		int side = 0, a = 0, b = 0, c = 0;
		char ans = 'y';
		do{
			side++;
			System.out.println("�п�J�� "+side+" �Ӽƭ�: ");
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
			System.out.print("�аݬO�_����"+(side+1)+"�Ӽƭȭn��J?(y/n)�G");
			ans = buf.readLine().charAt(0);
		}while(ans == 'y');
		//�ھڿ�J�X����h��Method��
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