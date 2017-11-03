import java.io.*;
public class app{
	public static void main(String[] args)throws  IOException{
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		char status;
		int r, flag;
		flag = 0;
		do{
			do{
				r = (int)( Math.random() * 60 ) + 1;
				switch(r){
					case 3:	
					case 31:	
					case 35:	
					case 46:	
					case 47:	
					case 57:	
						flag = 1;
						break;
					default:
						flag = 0;
						break;
				}
			}while(flag == 1);
			System.out.println("點到的號碼為：" + r);
			System.out.print("是否繼續點名（Y/N）：");
			status = buf.readLine().charAt(0);
		}while(status == 'Y');
	}
}