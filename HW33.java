/*
 * 2017/11/01 �ĤK�P�@�~-���4
 * HW33.java
 * ���� �K�� ���� ���� ��ü �����~�� ����
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
		System.out.print("�п�J���G");
		String menu[] = buf.readLine().split(" ");
		System.out.print("�п�J�����G");
		String money[] = buf.readLine().split(" ");
		// ----------------------------------------------------
		// �üƺ�X�@�g������index
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
		// �վ㬰�P���@��0 ~ �P���鬰6
		do{
			System.out.print("�п�ܥ\��(1.��ѭn�Y���� 2.����Ƨ� 3.�C�X�@�P��� 4.���}�{��)�G");
			choice = Integer.parseInt(buf.readLine());
			switch(choice){
				case 1:
					System.out.println("���ѬP��"+(today+1)+"�A�ڭn�Y"+menu[week[today]-1]+"�A����"+money[week[today]-1]+"��");
					break;
				case 2:
					for(i=0; i<6; i++){
						System.out.print(menu[i]+money[i]+"���B");
					}					
					System.out.print(menu[6]+money[6]+"��\n");
					break;
				case 3:
					for(i=0; i<7; i++){
						System.out.println("���ѬP��"+(i+1)+"�A�ڭn�Y"+menu[week[i]-1]+"�A����"+money[week[i]-1]+"��");
					}
					break;
				case 4:
					System.out.println("�{������");
					break;
				default:
					System.out.println("�п�J 1~4 ���Ʀr��I");
					break;
			}
		}while(choice != 4);
	}
}