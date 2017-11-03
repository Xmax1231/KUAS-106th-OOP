import java.io.*;
import java.util.Date;
public class HW32{
	public static void main(String[] args)throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("請輸入要查詢的城市：");
		String inp = buf.readLine();
		Date dt = new Date();
		switch(inp){
			case "舊金山":
				System.out.println(inp+"現在時間："+((dt.getHours()-8-8)<0?dt.getHours()-8-8+24:dt.getHours()-8-8)+":"+dt.getMinutes()+":"+dt.getSeconds());
				break;
			case "倫敦":
				System.out.println(inp+"現在時間："+(dt.getHours()-8+0)+":"+dt.getMinutes()+":"+dt.getSeconds());
				break;
			case "巴黎":
				System.out.println(inp+"現在時間："+(dt.getHours()-8+1)+":"+dt.getMinutes()+":"+dt.getSeconds());
				break;
			case "曼谷":
				System.out.println(inp+"現在時間："+(dt.getHours()-8+7)+":"+dt.getMinutes()+":"+dt.getSeconds());
				break;
			case "台灣":
				System.out.println(inp+"現在時間："+(dt.getHours()-8+8)+":"+dt.getMinutes()+":"+dt.getSeconds());
				break;
			case "東京":
				System.out.println(inp+"現在時間："+(dt.getHours()-8+9)+":"+dt.getMinutes()+":"+dt.getSeconds());
				break;
			case "雪梨":
				System.out.println(inp+"現在時間："+(dt.getHours()-8+11)+":"+dt.getMinutes()+":"+dt.getSeconds());
				break;
		}
		// System.out.println(dt.getHours()+":"+dt.getMinutes()+":"+dt.getSeconds());
	}
}