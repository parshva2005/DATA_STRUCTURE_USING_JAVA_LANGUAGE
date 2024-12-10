import java.util.*;
public class PrimeNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER A NUMBER : ");
		int a = sc.nextInt();
		int count = 0;
		for(int i=2;i<a/2;i++){
			if(a%i==0){
				count++;
			}
		}
		if (count==0) {
			System.out.print("A PRIME NUMBER ");
		}
		else{
			System.out.print("NOT A PRIME NUMBER");
		}
	}
}