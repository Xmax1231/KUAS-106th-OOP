import java.io.*;
public class HW21{
	public static void main(String[] args) throws IOException{
		int i, InIn;
		int code[] = {153, 198, 211, 286, 384, 426, 999};
		String position[] = {"A��", "C��", "E��", "F��", "G��", "H��", "Z��"};
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		char ans = 0;
		System.out.print("�ӫ~�s���G");
		for(i=0; i<(code.length-1); i++){
			System.out.print(code[i] + ", ");
		}
		System.out.print(code[i] + "\n");
		do{
			System.out.print("�п�J�n�d�ߦ�m���ӫ~�s���G");
			InIn = Integer.parseInt(buf.readLine());
			for(i=0; i<code.length; i++){
				if(InIn == code[i]){
					System.out.println("�ӫ~��m�b" + position[i]);
					break;
				}
			}
			if(i == code.length)
				System.out.println("�d�L���s��");
			System.out.print("�аݬO�_�~��d��?(Y/N)�G");
			ans = buf.readLine().charAt(0);
		}while(ans == 'Y');
		System.out.println("�{������");
		}
}