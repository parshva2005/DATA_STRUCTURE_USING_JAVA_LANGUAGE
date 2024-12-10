import java.util.*;
public class SmallBigNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER A LENGTH : ");
		int a =sc.nextInt();
		int min=0;
		int max=0;
		int b[]=new int[a];
		for(int i=0;i<a;i++){
			System.out.print("ENTER A b["+i+"] : ");
			b[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++){
			if(b[min]>b[i]){
				min=i;
			}
			if(b[max]<b[i]){
				max=i;
			}
		}
		System.out.print("max = b["+max+"] min = b["+min+"]");
	}
}