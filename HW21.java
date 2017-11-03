import java.io.*;
public class HW21{
	public static void main(String[] args) throws IOException{
		int i, InIn;
		int code[] = {153, 198, 211, 286, 384, 426, 999};
		String position[] = {"A區", "C區", "E區", "F區", "G區", "H區", "Z區"};
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		char ans = 0;
		System.out.print("商品編號：");
		for(i=0; i<(code.length-1); i++){
			System.out.print(code[i] + ", ");
		}
		System.out.print(code[i] + "\n");
		do{
			System.out.print("請輸入要查詢位置的商品編號：");
			InIn = Integer.parseInt(buf.readLine());
			for(i=0; i<code.length; i++){
				if(InIn == code[i]){
					System.out.println("商品位置在" + position[i]);
					break;
				}
			}
			if(i == code.length)
				System.out.println("查無此編號");
			System.out.print("請問是否繼續查詢?(Y/N)：");
			ans = buf.readLine().charAt(0);
		}while(ans == 'Y');
		System.out.println("程式結束");
		}
}