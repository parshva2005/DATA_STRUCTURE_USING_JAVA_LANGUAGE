import java.util.*;
public class FactorialRecursion{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Fact b = new Fact();
		int c = b.recursion(a);
		System.out.print(c);
	}
}
class Fact{
	int recursion(int a){
		if(a==1){
			return 1;
		}
		else{
			return a*(recursion(a-1));
		}
	}
}