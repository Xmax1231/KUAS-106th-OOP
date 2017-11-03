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
		System.out.print("請輸入學生人數：");
		int num = Integer.parseInt(buf.readLine());
		int score[] = new int[num];
		// start
		System.out.println("-----------------------------");
		System.out.println("開始輸入學生成績");
		for(i=0; i<num; i++){
			System.out.print("請輸入第" + (i+1) + "位學生成績：");
			score[i] = Integer.parseInt(buf.readLine());
			if(score[i]<60)
				failed++;
			if(high == -1 || high < score[i])
				high = score[i];
			if(low == -1 || low > score[i])
				low = score[i];
		}
		// ouput
		System.out.println("成績統計結果如下：");
		System.out.println("共有" + num + "位學生，" + failed + "人不及格，" + (num - failed) + "人及格，最高分為" + high + " ，最低分為" + low);
	}
}