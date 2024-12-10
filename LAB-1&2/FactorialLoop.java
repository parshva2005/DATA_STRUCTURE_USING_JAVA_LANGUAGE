import java.util.*;
public class FactorialLoop{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int Factorial =1;
		for(int i=1; i<=a ; i++){
			Factorial = Factorial*i;
		}
		System.out.print(Factorial);
	}
}