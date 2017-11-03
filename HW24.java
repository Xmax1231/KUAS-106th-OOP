import java.io.*;
public class HW24{
	public static int Rand(int start, int end){
		return (int)( Math.random() * (end-start+1) ) + start;
	}
	public static void main(String[] argv) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int ans = 0;
		int card[][] = new int[4][13];
		//�p�G��L�N�]��1�A����L��0
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
							System.out.println("���:����"+name[number]+" ,�A���I��:"+player_sum);
							break;
						case 1:
							System.out.println("���:�R��"+name[number]+" ,�A���I��:"+player_sum);
							break;
						case 2:
							System.out.println("���:���"+name[number]+" ,�A���I��:"+player_sum);
							break;
						case 3:
							System.out.println("���:�®�"+name[number]+" ,�A���I��:"+player_sum);
							break;
						default:
							break;
					}
				}
			}while(flag!=0);
			if(player_sum > 10.5){
				System.out.println("���a�z�F�A�q�����!");
				game_falg = false;
				break;
			}
			System.out.print("�[�P�п�J1�A���[�P�п�J0: ");
			ans = Integer.parseInt(buf.readLine());
		}while(ans == 1);

		player_sum -= player_point[0];	//���a�i���W�I�ƥ��������Ĥ@�i
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
							System.out.println("�q�����:����"+name[number]+" ,�q�����I��:"+computer_sum);
							break;
						case 1:
							System.out.println("�q�����:�R��"+name[number]+" ,�q�����I��:"+computer_sum);
							break;
						case 2:
							System.out.println("�q�����:���"+name[number]+" ,�q�����I��:"+computer_sum);
							break;
						case 3:
							System.out.println("�q�����:�®�"+name[number]+" ,�q�����I��:"+computer_sum);
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
			player_sum += player_point[0];	//���a�Ҧ��I�ƥ����[�^�Ĥ@�i
			if(computer_sum > 10.5){
				System.out.println("�q���z�F�A���a��ӡI");
			}else if(player_sum > computer_sum){
				System.out.println("���a�I�Ƥj��q���A���a��ӡI");
			}else if(player_sum == computer_sum){
				System.out.println("���a�I�Ƶ���q���A�q����ӡI");
			}else{
				System.out.println("���a�I�Ƥp��q���A�q����ӡI");
			}
		}
	}
}