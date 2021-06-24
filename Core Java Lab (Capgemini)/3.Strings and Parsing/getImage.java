package Lab_3;
import java.util.Scanner;
public class getImage {
public String getImage(String str) {
	StringBuffer sbr = new StringBuffer(str);
	sbr.append('|');
	StringBuffer sb = new StringBuffer(str);
	sb.reverse();
	sbr.append(sb);
	return sbr.toString();
}
	public static void main(String[] args) {
		getImage p = new getImage();
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a string");
		String str = s.next();
		System.out.println(p.getImage(str));

	}

}
