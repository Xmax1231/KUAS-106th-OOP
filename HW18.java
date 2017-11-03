import java.io.*;
public class app{
	public static void main(String[] args)throws  IOException{
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		int mode, total, inin, temp;
		total = 0;
		do{
			System.out.print("請選擇功能（1.提款、2.存款、3.查詢餘額、4.離開）：");
			mode = Integer.parseInt(buf.readLine());
			switch(mode){
				case 1:
					System.out.print("請輸入提款金額：");
					inin = Integer.parseInt(buf.readLine());
					if(inin > total)
						System.out.println("金額不足，目前餘額：" + total);
					else{
						total -= inin;
						System.out.println("提款成功，目前餘額：" + total);
					}
					break;
				case 2:
					System.out.print("請輸入存款金額：");
					inin = Integer.parseInt(buf.readLine());
					temp = total + inin;
					if (temp < 0 )
						System.out.println("存款失敗，總值超過資料型態上限，目前剩餘：" + total);
					else{	
						total = temp;
						System.out.println("存款成功，目前餘額：" + total);
					}
					break;
				case 3:
					System.out.println("目前餘額：" + total);
					break;
				case 4:
					System.out.println("感謝您的使用，歡迎下次的光臨。");
					break;
				default:
					System.out.println("輸入錯誤，沒有此功能，請重新輸入。");
					break;
			}
		}while(mode != 4);
	}
}