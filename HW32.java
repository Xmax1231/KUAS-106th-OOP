import java.io.*;
import java.util.Date;
public class HW32{
	public static void main(String[] args)throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�п�J�n�d�ߪ������G");
		String inp = buf.readLine();
		Date dt = new Date();
		switch(inp){
			case "�ª��s":
				System.out.println(inp+"�{�b�ɶ��G"+((dt.getHours()-8-8)<0?dt.getHours()-8-8+24:dt.getHours()-8-8)+":"+dt.getMinutes()+":"+dt.getSeconds());
				break;
			case "�۴�":
				System.out.println(inp+"�{�b�ɶ��G"+(dt.getHours()-8+0)+":"+dt.getMinutes()+":"+dt.getSeconds());
				break;
			case "�ھ�":
				System.out.println(inp+"�{�b�ɶ��G"+(dt.getHours()-8+1)+":"+dt.getMinutes()+":"+dt.getSeconds());
				break;
			case "�Ҩ�":
				System.out.println(inp+"�{�b�ɶ��G"+(dt.getHours()-8+7)+":"+dt.getMinutes()+":"+dt.getSeconds());
				break;
			case "�x�W":
				System.out.println(inp+"�{�b�ɶ��G"+(dt.getHours()-8+8)+":"+dt.getMinutes()+":"+dt.getSeconds());
				break;
			case "�F��":
				System.out.println(inp+"�{�b�ɶ��G"+(dt.getHours()-8+9)+":"+dt.getMinutes()+":"+dt.getSeconds());
				break;
			case "����":
				System.out.println(inp+"�{�b�ɶ��G"+(dt.getHours()-8+11)+":"+dt.getMinutes()+":"+dt.getSeconds());
				break;
		}
		// System.out.println(dt.getHours()+":"+dt.getMinutes()+":"+dt.getSeconds());
	}
}