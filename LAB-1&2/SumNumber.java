import java.util.*;
public class SumNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER A NUMBER : ");
		int n = sc.nextInt();
		double sum=0;
		for(int i=n;i>=1;i--){
			sum+=((i*(i+1))/2);
		}
		System.out.print("SUM : "+sum);
	}
}