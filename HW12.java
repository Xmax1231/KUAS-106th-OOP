import java.io.*;
public class app1 {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int attack, damage;
		double buff;
		System.out.print("��J�����ƭȡG");
		attack = Integer.parseInt(buf.readLine());
		System.out.print("��J�W�q�ȡG");
		buff = Double.parseDouble(buf.readLine());
		System.out.println("");
		
		damage = (int)(attack * buff);
		System.out.println("�W�q�y���ˮ`�ȡG" + damage);
		if(damage == 2147483647 & (attack != 1 | buff != 1)){
			System.out.println("�W�q�B�⵲�G�G�uoverflow�v");
		}else if(damage == 0 & (attack != 1 | buff != 1)){
			System.out.println("�W�q�B�⵲�G�G�uunderflow�v");			
		}else{
			System.out.println("�W�q�B�⵲�G�G�u���`�v");
		}
	}
}