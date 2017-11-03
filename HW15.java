import java.io.*;
public class app{
	public static void main(String[] args)throws  IOException{
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		int mouth, date;
		System.out.print("請輸入月份：");
		mouth = Integer.parseInt(buf.readLine());
		System.out.print("請輸入日期：");
		date = Integer.parseInt(buf.readLine());

		switch(mouth){
			case 1:
				if(date > 31 || date < 1)
					System.out.print("請輸入正確的日期");
				else if(date < 21)
					System.out.print("您的星座為：摩羯座");
				else
					System.out.print("您的星座為：水瓶座");
				break;
			case 2:
				if(date > 28 || date < 1)
					System.out.print("請輸入正確的日期");
				else if(date < 21)
					System.out.print("您的星座為：水瓶座");
				else
					System.out.print("您的星座為：雙魚座");
				break;
			case 3:
				if(date > 31 || date < 1)
					System.out.print("請輸入正確的日期");
				else if(date < 21)
					System.out.print("您的星座為：雙魚座");
				else
					System.out.print("您的星座為：牡羊座");
				break;
			case 4:
				if(date > 30 || date < 1)
					System.out.print("請輸入正確的日期");
				else if(date < 21)
					System.out.print("您的星座為：牡羊座");
				else
					System.out.print("您的星座為：金牛座");
				break;
			case 5:
				if(date > 31 || date < 1)
					System.out.print("請輸入正確的日期");
				else if(date < 21)
					System.out.print("您的星座為：金牛座");
				else
					System.out.print("您的星座為：雙子座");
				break;
			case 6:
				if(date > 30 || date < 1)
					System.out.print("請輸入正確的日期");
				else if(date < 21)
					System.out.print("您的星座為：雙子座");
				else
					System.out.print("您的星座為：巨蟹座");
				break;
			case 7:
				if(date > 31 || date < 1)
					System.out.print("請輸入正確的日期");
				else if(date < 21)
					System.out.print("您的星座為：巨蟹座");
				else
					System.out.print("您的星座為：獅子座");
				break;
			case 8:
				if(date > 31 || date < 1)
					System.out.print("請輸入正確的日期");
				else if(date < 21)
					System.out.print("您的星座為：獅子座");
				else
					System.out.print("您的星座為：處女座");
				break;
			case 9:
				if(date > 30 || date < 1)
					System.out.print("請輸入正確的日期");
				else if(date < 21)
					System.out.print("您的星座為：處女座");
				else
					System.out.print("您的星座為：天秤座");
				break;
			case 10:
				if(date > 31 || date < 1)
					System.out.print("請輸入正確的日期");
				else if(date < 21)
					System.out.print("您的星座為：天秤座");
				else
					System.out.print("您的星座為：天蠍座");
				break;
			case 11:
				if(date > 30 || date < 1)
					System.out.print("請輸入正確的日期");
				else if(date < 21)
					System.out.print("您的星座為：天蠍座");
				else
					System.out.print("您的星座為：射手座");
				break;
			case 12:
				if(date > 31 || date < 1)
					System.out.print("請輸入正確的日期");
				else if(date < 21)
					System.out.print("您的星座為：射手座");
				else
					System.out.print("您的星座為：魔羯座");
				break;
			default:	
				System.out.print("請輸入正確的日期");
				break;
		}
	}
}