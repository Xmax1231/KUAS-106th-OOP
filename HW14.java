import java.io.*;
public class app{
	public static void main(String[] args)throws  IOException{
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		int min, max, base;
		System.out.print("�п�J�d�򪺳̤p�ơG");
		min = Integer.parseInt(buf.readLine());
		System.out.print("�п�J�d�򪺳̤j�ơG");
		max = Integer.parseInt(buf.readLine());
		System.out.print("�п�J�n�M�䪺���ƪ���ȡG");
		base = Integer.parseInt(buf.readLine());

		int n;
		System.out.print(base + " �����Ƭ��G");
		for(n = min ;n <= max ; n++){
			if((n % base)==0){
				System.out.print(n + " ");
			}
		}
	}
}