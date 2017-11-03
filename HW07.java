import java.io.*;
public class app1 {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int mooncake, price, cash;

		//input--- 
		System.out.print("月餅單價為：");
		mooncake = Integer.parseInt(buf.readLine());
		System.out.print("請輸入欲購買的月餅數量：");
		price = Integer.parseInt(buf.readLine());
		System.out.print("請輸入付款金額：");
		cash = Integer.parseInt(buf.readLine());
		
		//output--- 
		if(mooncake * price > cash){
			System.out.print("付款金額不足");
		}else{
			System.out.print("實付金額：" + cash);
			System.out.print("，應付金額：" + mooncake * price);
			System.out.print("，找零：" + (cash - mooncake * price));
		}
	}
}