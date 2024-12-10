import java.util.*;
public class PowerNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER A NUMBER : ");
		int a = sc.nextInt();
		System.out.print("ENTER A POWER OF NUMBER : ");
		int p = sc.nextInt();
		int ans = 1;
		for (int i=1;i<=p;i++ ) {
			ans = ans*a;
		}
		System.out.print("ANS : "+ans);
	}
}