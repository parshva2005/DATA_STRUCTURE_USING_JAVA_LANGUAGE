import java.util.*;
public class ArrayMerge{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER AN ARRAY 1 LENGTH : ");
		int length1 = sc.nextInt();
		System.out.print("ENTER AN ARRAY 2 LENGTH : ");
		int length2 = sc.nextInt();
		int a[] = new int[length1];
		int b[] = new int[length2];
		for(int i=0;i<a.length;i++){
			System.out.print("ENTER AN ARRAEY 1 ELEMENTS : ");
			a[i] = sc.nextInt();
		}
		for(int i=0;i<b.length;i++){
			System.out.print("ENTER AN ARRAEY 2 ELEMENTS : ");
			b[i] = sc.nextInt();
		}
		int c[] = new int[(a.length)+(b.length)];
		int j=0;
		for(int i=0;i<c.length;i++){
			if(i<a.length){
				c[i]=a[i];
			}
			else{
				c[i]=b[j];
				j++;
			}
		}
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+",");
		}
	}
}