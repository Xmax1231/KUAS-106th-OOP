import java.io.*;
public class app{
	public static void main(String[] args)throws  IOException{
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		int mode, total, inin, temp;
		total = 0;
		do{
			System.out.print("�п�ܥ\��]1.���ڡB2.�s�ڡB3.�d�߾l�B�B4.���}�^�G");
			mode = Integer.parseInt(buf.readLine());
			switch(mode){
				case 1:
					System.out.print("�п�J���ڪ��B�G");
					inin = Integer.parseInt(buf.readLine());
					if(inin > total)
						System.out.println("���B�����A�ثe�l�B�G" + total);
					else{
						total -= inin;
						System.out.println("���ڦ��\�A�ثe�l�B�G" + total);
					}
					break;
				case 2:
					System.out.print("�п�J�s�ڪ��B�G");
					inin = Integer.parseInt(buf.readLine());
					temp = total + inin;
					if (temp < 0 )
						System.out.println("�s�ڥ��ѡA�`�ȶW�L��ƫ��A�W���A�ثe�Ѿl�G" + total);
					else{	
						total = temp;
						System.out.println("�s�ڦ��\�A�ثe�l�B�G" + total);
					}
					break;
				case 3:
					System.out.println("�ثe�l�B�G" + total);
					break;
				case 4:
					System.out.println("�P�±z���ϥΡA�w��U�������{�C");
					break;
				default:
					System.out.println("��J���~�A�S�����\��A�Э��s��J�C");
					break;
			}
		}while(mode != 4);
	}
}