import java.io.*;
import java.util.Date;
public class HW34{
	public static void main(String[] argv) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String[] account = new String[5];
		account[0] = "Kuas_123456";
		account[1] = "Admin_123456";
		String[] password = new String[5];
		String password_again = "";
		String[] Email = new String[5];
		int count = 2, i, j;
		boolean e_flag, n_flag, o_flag;
		//-------------------------------------

		System.out.print("�п�J�b��(�Ĥ@�Ӧr���j�g�^��B�B����8-12�Ӧr)�G");
		account[count] = buf.readLine();
		i = 0;
		while(i<5){
			e_flag = n_flag = o_flag = false;
			if(i==count)i++;
			for(j=0; j<account[count].length(); j++){
				if(account[count].charAt(j)>='0'&&account[count].charAt(j)<='9'){
					n_flag = true;
				}else if(account[count].charAt(j)>='A'&&account[count].charAt(j)<='Z'){
					e_flag = true;
				}else if(account[count].charAt(j)>='a'&&account[count].charAt(j)<='z'){
					e_flag = true;
				}else{
					o_flag = true;
				}
			}
			if(account[count].equals(account[i])){
				System.out.println("�w�g�����b���F�I");
				System.out.print("�п�J�b��(�Ĥ@�Ӧr���j�g�^��B�B����8-12�Ӧr)�G");
				account[count] = buf.readLine();
				i = 0;
			}else if(account[count].length()<8||account[count].length()>12||account[count].charAt(0)>='a'||e_flag==false||n_flag==false||o_flag==false){
				System.out.println("���~�榡�I");
				System.out.print("�п�J�b��(�Ĥ@�Ӧr���j�g�^��B�B����8-12�Ӧr)�G");
				account[count] = buf.readLine();
				i = 0;
			}else
				i++;
		}
		//-------------------------------------	
		System.out.print("�п�J�K�X(����P�b���V�P�B�B����8-12�Ӧr)�G");
		password[count] = buf.readLine();
		for(;;){	
			e_flag = n_flag = o_flag = false;
			for(j=0; j<password[count].length(); j++){
				if(password[count].charAt(j)>='0'&&password[count].charAt(j)<='9'){
					n_flag = true;
				}else if(password[count].charAt(j)>='A'&&password[count].charAt(j)<='Z'){
					e_flag = true;
				}else if(password[count].charAt(j)>='a'&&password[count].charAt(j)<='z'){
					e_flag = true;
				}else{
					o_flag = true;
				}
			}
			if(password[count].equals(account[count])){
				System.out.println("����P�b���ۦP�I");
				System.out.print("�п�J�K�X(����P�b���V�P�B�B����8-12�Ӧr)�G");
				password[count] = buf.readLine();
			}else if(password[count].length()<8||password[count].length()>12||password[count].charAt(0)>='a'||e_flag==false||n_flag==false||o_flag==false){
				System.out.println("���~�榡�I");
				System.out.print("�п�J�K�X(����P�b���V�P�B�B����8-12�Ӧr)�G");
				password[count] = buf.readLine();
			}else{
				System.out.print("�ЦA����J�K�X�G");
				password_again = buf.readLine();
				if(password[count].equals(password_again)){break;}else{
					System.out.println("�K�X���~�I");
					System.out.print("�п�J�K�X(����P�b���V�P�B�B����8-12�Ӧr)�G");
					password[count] = buf.readLine();
				}
			}
		}
		//-------------------------------------	.
		System.out.print("�п�J�H�c�G");
		Email[count] = buf.readLine();
		do{
			if(Email[count].split("@").length==2&&Email[count].charAt(0)!='@'&&Email[count].charAt(Email[count].length()-1)!='@'){
				break;
			}
			System.out.println("�榡���~�I");
			System.out.print("�п�J�H�c�G");
			Email[count] = buf.readLine();
		}while(true);
		Date dt = new Date();
		System.out.println(account[count]+" �A�n�A�w��Ӧ� "+Email[count].split("@")[1]+" ���A�A�A�����U�ɶ��O "+(dt.getYear()+1900)+"/"+dt.getMonth()+"/"+dt.getDate()+" "+dt.getHours()+":"+dt.getMinutes()+":"+dt.getSeconds());
	}
}