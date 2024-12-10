import java.util.*;
public class ArrayIn{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER A NUMBER : ");
		int number = sc.nextInt();
		System.out.print("ENTER AN INDEX : ");
		int index = sc.nextInt();
		int a[] = {2,1,4,5,7,5,8,4};
		int b[] = new int[(a.length)+1];
		for (int i=0;i<b.length ;i++ ) {
			if(i<index){
				b[i]=a[i];
			}
			else if(i==index){
				b[i]=number;
			}
			else{
				b[i]=a[i-1];
			}
		}
		for (int i=0;i<b.length ;i++ ) {
			System.out.print(b[i]+",");
		}
	}
}