import java.io.*;
public class HW24{
	public static int Rand(int start, int end){
		return (int)( Math.random() * (end-start+1) ) + start;
	}
	public static void main(String[] argv) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int ans = 0;
		int card[][] = new int[4][13];
		//如果抽過就設為1，未抽過為0
		String name[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		int color, number, flag;
		double player_point[] = new double[52], computer_point[] = new double[52], player_sum = 0, computer_sum = 0;
		int player_count = 0, computer_count = 0;
		boolean game_falg = true;
		System.out.println("------------------");
		System.out.println("");
		do{
			do{
				flag = 1;
				color = Rand(0,3);
				number = Rand(0,12);
				if(card[color][number]==0){
					card[color][number] = 1;
					flag = 0;
					if(number > 9){
						player_point[player_count++] = 0.5;
						player_sum += 0.5;
					}else{
						player_point[player_count++] = number+1;
						player_sum += number+1;
					}
					switch(color){
						case 0:
							System.out.println("抽到:梅花"+name[number]+" ,你的點數:"+player_sum);
							break;
						case 1:
							System.out.println("抽到:愛心"+name[number]+" ,你的點數:"+player_sum);
							break;
						case 2:
							System.out.println("抽到:方塊"+name[number]+" ,你的點數:"+player_sum);
							break;
						case 3:
							System.out.println("抽到:黑桃"+name[number]+" ,你的點數:"+player_sum);
							break;
						default:
							break;
					}
				}
			}while(flag!=0);
			if(player_sum > 10.5){
				System.out.println("玩家爆了，電腦獲勝!");
				game_falg = false;
				break;
			}
			System.out.print("加牌請輸入1，不加牌請輸入0: ");
			ans = Integer.parseInt(buf.readLine());
		}while(ans == 1);

		player_sum -= player_point[0];	//玩家檯面上點數必須扣除第一張
		System.out.println("");
		System.out.println("------------------");
		System.out.println("");

		while(game_falg){
			do{
				flag = 1;
				color = Rand(0,3);
				number = Rand(0,12);
				if(card[color][number]==0){
					card[color][number] = 1;
					flag = 0;
					if(number > 9){
						computer_point[computer_count++] = 0.5;
						computer_sum += 0.5;
					}else{
						computer_point[computer_count++] = number+1;
						computer_sum += number+1;
					}
					switch(color){
						case 0:
							System.out.println("電腦抽到:梅花"+name[number]+" ,電腦的點數:"+computer_sum);
							break;
						case 1:
							System.out.println("電腦抽到:愛心"+name[number]+" ,電腦的點數:"+computer_sum);
							break;
						case 2:
							System.out.println("電腦抽到:方塊"+name[number]+" ,電腦的點數:"+computer_sum);
							break;
						case 3:
							System.out.println("電腦抽到:黑桃"+name[number]+" ,電腦的點數:"+computer_sum);
							break;
						default:
							break;
					}
				}
			}while(flag!=0);
			if(computer_sum > player_sum || computer_sum > 10.5 || computer_sum > 7){
				break;
			}
		}
		if(game_falg){
			System.out.println("");
			System.out.println("------------------");
			player_sum += player_point[0];	//玩家所有點數必須加回第一張
			if(computer_sum > 10.5){
				System.out.println("電腦爆了，玩家獲勝！");
			}else if(player_sum > computer_sum){
				System.out.println("玩家點數大於電腦，玩家獲勝！");
			}else if(player_sum == computer_sum){
				System.out.println("玩家點數等於電腦，電腦獲勝！");
			}else{
				System.out.println("玩家點數小於電腦，電腦獲勝！");
			}
		}
	}
}