import java.io.*;
public class app{
	public static void main(String[] args)throws  IOException{
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		int mouth, date;
		System.out.print("�п�J����G");
		mouth = Integer.parseInt(buf.readLine());
		System.out.print("�п�J����G");
		date = Integer.parseInt(buf.readLine());

		switch(mouth){
			case 1:
				if(date > 31 || date < 1)
					System.out.print("�п�J���T�����");
				else if(date < 21)
					System.out.print("�z���P�y���G���~�y");
				else
					System.out.print("�z���P�y���G���~�y");
				break;
			case 2:
				if(date > 28 || date < 1)
					System.out.print("�п�J���T�����");
				else if(date < 21)
					System.out.print("�z���P�y���G���~�y");
				else
					System.out.print("�z���P�y���G�����y");
				break;
			case 3:
				if(date > 31 || date < 1)
					System.out.print("�п�J���T�����");
				else if(date < 21)
					System.out.print("�z���P�y���G�����y");
				else
					System.out.print("�z���P�y���G�d�Ϯy");
				break;
			case 4:
				if(date > 30 || date < 1)
					System.out.print("�п�J���T�����");
				else if(date < 21)
					System.out.print("�z���P�y���G�d�Ϯy");
				else
					System.out.print("�z���P�y���G�����y");
				break;
			case 5:
				if(date > 31 || date < 1)
					System.out.print("�п�J���T�����");
				else if(date < 21)
					System.out.print("�z���P�y���G�����y");
				else
					System.out.print("�z���P�y���G���l�y");
				break;
			case 6:
				if(date > 30 || date < 1)
					System.out.print("�п�J���T�����");
				else if(date < 21)
					System.out.print("�z���P�y���G���l�y");
				else
					System.out.print("�z���P�y���G���ɮy");
				break;
			case 7:
				if(date > 31 || date < 1)
					System.out.print("�п�J���T�����");
				else if(date < 21)
					System.out.print("�z���P�y���G���ɮy");
				else
					System.out.print("�z���P�y���G��l�y");
				break;
			case 8:
				if(date > 31 || date < 1)
					System.out.print("�п�J���T�����");
				else if(date < 21)
					System.out.print("�z���P�y���G��l�y");
				else
					System.out.print("�z���P�y���G�B�k�y");
				break;
			case 9:
				if(date > 30 || date < 1)
					System.out.print("�п�J���T�����");
				else if(date < 21)
					System.out.print("�z���P�y���G�B�k�y");
				else
					System.out.print("�z���P�y���G�ѯ��y");
				break;
			case 10:
				if(date > 31 || date < 1)
					System.out.print("�п�J���T�����");
				else if(date < 21)
					System.out.print("�z���P�y���G�ѯ��y");
				else
					System.out.print("�z���P�y���G���Ȯy");
				break;
			case 11:
				if(date > 30 || date < 1)
					System.out.print("�п�J���T�����");
				else if(date < 21)
					System.out.print("�z���P�y���G���Ȯy");
				else
					System.out.print("�z���P�y���G�g��y");
				break;
			case 12:
				if(date > 31 || date < 1)
					System.out.print("�п�J���T�����");
				else if(date < 21)
					System.out.print("�z���P�y���G�g��y");
				else
					System.out.print("�z���P�y���G�]�~�y");
				break;
			default:	
				System.out.print("�п�J���T�����");
				break;
		}
	}
}