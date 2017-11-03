import java.io.*;
public class app1 {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int score;

		System.out.print("請輸入 TOEIC：");
		score = Integer.parseInt(buf.readLine());

		if(score % 5 != 0 | (score > 990 | score < 10)){
			System.out.print("輸入格式錯誤。");
		}else if(score >=10 & score <= 215){
			System.out.print("證照顏色：橘色");
		}else if(score >=220 & score <= 465){
			System.out.print("證照顏色：棕色");
		}else if(score >=470 & score <= 725){
			System.out.print("證照顏色：綠色");
		}else if(score >=730 & score <= 855){
			System.out.print("證照顏色：藍色");
		}else if(score >=860 & score <= 990){
			System.out.print("證照顏色：金色");
		}
	}
}