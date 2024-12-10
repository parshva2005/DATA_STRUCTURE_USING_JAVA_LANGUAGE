import java.util.*;
public class ArrayDupliOrNo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER A LENGTH : ");
		int a =sc.nextInt();
		int b[]=new int[a];
		int temp=0;
		for(int i=0;i<a;i++){
			System.out.print("ENTER A b["+i+"] : ");
			b[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++){
			for (int j=i+1;j<a ;j++ ) {
				if(b[i]==b[j]){
					temp++;
				}
			}
		}
		if(temp==0){
			System.out.print("NO DUPLICATE NUMBER");
		}
		else{
			System.out.print("DUPLICATE NUMBER EXIST");
		}
	}
}