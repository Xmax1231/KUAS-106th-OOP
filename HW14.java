import java.io.*;
public class app{
	public static void main(String[] args)throws  IOException{
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		int min, max, base;
		System.out.print("請輸入範圍的最小數：");
		min = Integer.parseInt(buf.readLine());
		System.out.print("請輸入範圍的最大數：");
		max = Integer.parseInt(buf.readLine());
		System.out.print("請輸入要尋找的倍數的基值：");
		base = Integer.parseInt(buf.readLine());

		int n;
		System.out.print(base + " 的倍數為：");
		for(n = min ;n <= max ; n++){
			if((n % base)==0){
				System.out.print(n + " ");
			}
		}
	}
}