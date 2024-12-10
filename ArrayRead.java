import java.util.*;
public class ArrayRead{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER A LENGTH : ");
		int a = sc.nextInt();
		int b[] = new int[a];
		for(int i=0;i<a;i++){
			System.out.print("ENTER A NUMBER : ");
			b[i] = sc.nextInt();
		}
		System.out.print("YOUR NUMBER : ");
		for (int i=0;i<a ;i++ ) {
			System.out.print(b[i]+" ");
		}
	}
}