import java.util.*;
public class ReplaceWord{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER A LENGTH : ");
		int a =sc.nextInt();
		int b[]=new int[a];
		int c[]=new int[a];
		for(int i=0;i<a;i++){
			System.out.print("ENTER A b["+i+"] : ");
			b[i]=sc.nextInt();
		}
		System.out.print("ENTER A FIRST NUMBER : ");
		int firstnum = sc.nextInt();
		System.out.print("ENTER A SECOND NUMBER : ");
		int secondnum = sc.nextInt();
		int count=0;
		System.out.print("NEW ARRAY : ");
		for (int i=0;i<b.length ;i++ ) {
			if(b[i]==firstnum){
				b[i]=secondnum;
				c[count] = i;
				count++;
			}
			System.out.print(b[i]+" ");
		}
		System.out.println();
		System.out.print("INDEX : ");
		for(int i=0;i<count;i++){
			System.out.print(c[i]+" ");
		}
	}
}