import java.io.*;
public class HW20{
	public static void main(String[] argv)throws IOException{
		BufferedReader buf;
		String str;
		int i,failed,high,low;
		// init
		failed = 0;
		high = low = -1;
		buf = new BufferedReader(new InputStreamReader(System.in));
		// input num
		System.out.print("�п�J�ǥͤH�ơG");
		int num = Integer.parseInt(buf.readLine());
		int score[] = new int[num];
		// start
		System.out.println("-----------------------------");
		System.out.println("�}�l��J�ǥͦ��Z");
		for(i=0; i<num; i++){
			System.out.print("�п�J��" + (i+1) + "��ǥͦ��Z�G");
			score[i] = Integer.parseInt(buf.readLine());
			if(score[i]<60)
				failed++;
			if(high == -1 || high < score[i])
				high = score[i];
			if(low == -1 || low > score[i])
				low = score[i];
		}
		// ouput
		System.out.println("���Z�έp���G�p�U�G");
		System.out.println("�@��" + num + "��ǥ͡A" + failed + "�H���ή�A" + (num - failed) + "�H�ή�A�̰�����" + high + " �A�̧C����" + low);
	}
}