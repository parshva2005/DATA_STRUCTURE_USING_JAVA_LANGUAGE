import java.util.*;
public class ArrayShortedDelet{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER A NUMBER : ");
		int number = sc.nextInt();
		int a[] = {2,4,9,10,12,13,15,19};
		int b[] = new int[(a.length)-1];
		int i=0;
		while(i<b.length){
			if(a[i]<number){
				b[i]=a[i];
			}
			else{
				b[i]=a[i+1];
				break;
			}
			i++;
		}
		i++;
		while(i<b.length){
			b[i]=a[i+1];
			i++;
		}
		for (int j=0;j<b.length ;j++ ) {
			System.out.print(b[j]+",");
		}
	}
}