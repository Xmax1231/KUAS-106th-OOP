import java.io.*;
public class HW22{
	public static int Rand(int start, int end){
		return (int)( Math.random() * (end-start) ) + start;
	}
	public static void main(String[] argv) throws IOException{
		int r,i,now,flag;
		i = flag = now = 0;
		int ans[] = new int[6];
		ans[now++] = Rand(1,49);
		while(now<6){
			do{
				flag = 1;
				r = Rand(1,49);
				if(r!=ans[0] && r!=ans[1] && r!=ans[2] && r!=ans[3] && r!=ans[4] && r!=ans[5]){
					ans[now++]=r;
					flag = 0;
				}
			}while(flag == 1);
		}
		System.out.print("樂透號碼為：");
		for(i=0; i<6-1; i++){
			System.out.print(ans[i] + "、");
		}
		System.out.print(ans[i]);
	}
}