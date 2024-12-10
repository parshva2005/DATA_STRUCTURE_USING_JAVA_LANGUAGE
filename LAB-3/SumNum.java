import java.util.*;
public class SumNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER A START POINT : ");
		int m = sc.nextInt();
		System.out.print("ENTER AN END POINT : ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i=m;i<=n ;i++ ) {
			sum=sum+i;
		}
		System.out.print("SUM = "+sum);
	}
}