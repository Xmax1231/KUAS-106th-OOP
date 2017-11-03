import java.io.*;
public class app1 {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int attack, damage;
		double buff;
		System.out.print("輸入攻擊數值：");
		attack = Integer.parseInt(buf.readLine());
		System.out.print("輸入增益值：");
		buff = Double.parseDouble(buf.readLine());
		System.out.println("");
		
		damage = (int)(attack * buff);
		System.out.println("增益造成傷害值：" + damage);
		if(damage == 2147483647 & (attack != 1 | buff != 1)){
			System.out.println("增益運算結果：「overflow」");
		}else if(damage == 0 & (attack != 1 | buff != 1)){
			System.out.println("增益運算結果：「underflow」");			
		}else{
			System.out.println("增益運算結果：「正常」");
		}
	}
}