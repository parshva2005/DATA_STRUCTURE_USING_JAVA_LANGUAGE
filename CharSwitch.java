import java.util.*;
public class CharSwitch{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER A STRING : ");
		String str = sc.next();
		for (int i=0;i<str.length();i++ ) {
			if(str.charAt(i)<90){
				System.out.print(str.toLowerCase().charAt(i));
			}
			else{
				System.out.print(str.toUpperCase().charAt(i));
			}
		}
	}
}