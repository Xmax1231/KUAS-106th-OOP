import java.io.*;
public class app1 {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int mooncake, price, cash;

		//input--- 
		System.out.print("��������G");
		mooncake = Integer.parseInt(buf.readLine());
		System.out.print("�п�J���ʶR�����ƶq�G");
		price = Integer.parseInt(buf.readLine());
		System.out.print("�п�J�I�ڪ��B�G");
		cash = Integer.parseInt(buf.readLine());
		
		//output--- 
		if(mooncake * price > cash){
			System.out.print("�I�ڪ��B����");
		}else{
			System.out.print("��I���B�G" + cash);
			System.out.print("�A���I���B�G" + mooncake * price);
			System.out.print("�A��s�G" + (cash - mooncake * price));
		}
	}
}