import java.util.*;
public class ArrayDupliDelet{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = {2,1,4,5,7,5,8,4};
		int b[] = new int[(a.length)+1];
		int c[] = new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					c[k]=j;
					k++;
				}
			}
		}	
		for (int i=0;i<c.length ;i++ ) {
			System.out.print(c[i]+",");
		}	
		/*int j=0;
		for(int i=0;i<;i++){
			if(c[j]==i){
				i++;
				continue;
			}
			else{
				b[j]=a[i];
				j++;
			}
		}
		for (int i=0;i<b.length ;i++ ) {
			System.out.print(b[i]+",");
		}*/

	}
}