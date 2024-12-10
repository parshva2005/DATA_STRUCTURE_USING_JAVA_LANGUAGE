import java.util.*;
public class AvgNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER AN END POINT : ");
		double n = sc.nextInt();
		int sum = 0;
		double avg = 0;
		for (int i=1;i<=n ;i++ ) {
			sum=sum+i;
		}
		avg = sum/n;
		System.out.print("AVG = "+avg);
	}
}