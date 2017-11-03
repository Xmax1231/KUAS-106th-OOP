/*
 * 2017/11/01 第八周作業-實習4
 * HW33.java
 * 火鍋 便當 雞排 拉麵 肉羹 丹丹漢堡 滷味
 * 130 75 80 110 55 93 100
 */
import java.io.*;
import java.util.Date;
public class HW33{
	public static int Rand(int start, int end){
		return (int)( Math.random() * (end-start+1) ) + start;
	}
	public static void _sort(String[] menu, String[] money){
		int dx, ddx;
		String me_temp, mo_temp;
		for(dx=0;dx<money.length-1;dx++){
			for(ddx=dx+1;ddx<money.length;ddx++){
				if(Integer.parseInt(money[dx])>Integer.parseInt(money[ddx])){
					me_temp = menu[ddx]; mo_temp = money[ddx];
					money[ddx] = money[dx]; menu[ddx] = menu[dx];
					money[dx] = mo_temp; menu[dx] = me_temp;
				}
			}
		}
	}
	public static void main(String[] args)throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("請輸入菜單：");
		String menu[] = buf.readLine().split(" ");
		System.out.print("請輸入價錢：");
		String money[] = buf.readLine().split(" ");
		// ----------------------------------------------------
		// 亂數算出一週的食物index
		boolean flag = true;
		int week[] = new int[7], i, r, n=0;
		do{
			do{
				flag = true;
				r = Rand(1,7);
				for(i=0; i<7; i++){
					if(week[i]==r){
						flag = true;
						break;
					}else if(i==6){
						week[n++] = r;
						flag = false;
					}
				}
			}while(flag);
		}while(n<7);
		// ----------------------------------------------------
		_sort(menu, money);
		// ----------------------------------------------------
		int choice = 87;
		Date dt = new Date();
		int today = dt.getDay();
		if(today==0)
			today = 6;
		else
			today -= 1;
		// 調整為星期一為0 ~ 星期日為6
		do{
			System.out.print("請選擇功能(1.當天要吃什麼 2.價格排序 3.列出一周菜單 4.離開程式)：");
			choice = Integer.parseInt(buf.readLine());
			switch(choice){
				case 1:
					System.out.println("今天星期"+(today+1)+"，我要吃"+menu[week[today]-1]+"，價格"+money[week[today]-1]+"元");
					break;
				case 2:
					for(i=0; i<6; i++){
						System.out.print(menu[i]+money[i]+"元、");
					}					
					System.out.print(menu[6]+money[6]+"元\n");
					break;
				case 3:
					for(i=0; i<7; i++){
						System.out.println("今天星期"+(i+1)+"，我要吃"+menu[week[i]-1]+"，價格"+money[week[i]-1]+"元");
					}
					break;
				case 4:
					System.out.println("程式結束");
					break;
				default:
					System.out.println("請輸入 1~4 的數字鍵！");
					break;
			}
		}while(choice != 4);
	}
}