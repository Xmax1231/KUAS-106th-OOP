import java.io.*;
public class app1 {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String name,sex,being;
		int year;

		//input--- 
		System.out.print("�п�J�A���m�W�G");
		name = buf.readLine();
		System.out.print("�п�J�A���ʧO�G");
		sex = buf.readLine();
		System.out.print("�п�J�A���褸�X�ͦ~���G");
		year = Integer.parseInt(buf.readLine());
		System.out.print("�п�J�A���X�ͦa�G");
		being = buf.readLine();
		
		//output--- 
		System.out.println("�m�W�G" + name);
		System.out.println("�ʧO�G" + sex);
		System.out.println("�褸�X�ͦ~���G" + year);
		System.out.println("�X�ͦa�G" + being);
	}
}