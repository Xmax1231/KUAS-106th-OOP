import java.io.*;
public class app1 {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int score;

		System.out.print("�п�J TOEIC�G");
		score = Integer.parseInt(buf.readLine());

		if(score % 5 != 0 | (score > 990 | score < 10)){
			System.out.print("��J�榡���~�C");
		}else if(score >=10 & score <= 215){
			System.out.print("�ҷ��C��G���");
		}else if(score >=220 & score <= 465){
			System.out.print("�ҷ��C��G�Ħ�");
		}else if(score >=470 & score <= 725){
			System.out.print("�ҷ��C��G���");
		}else if(score >=730 & score <= 855){
			System.out.print("�ҷ��C��G�Ŧ�");
		}else if(score >=860 & score <= 990){
			System.out.print("�ҷ��C��G����");
		}
	}
}