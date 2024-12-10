import java.util.*;
public class AlphaOrder{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER A NUMBER OF STRINGS WHICH YOU WANT : ");
		int n = sc.nextInt();
		String str[] = new String[n];
		for (int i=0;i<n;i++) {
			System.out.print("ENTER A STRING : ");
			str[i] = sc.next();
		}
		String temp;
		for (int i=0;i<n ;i++ ) {
			for (int j=i+1;j<n ;j++ ) {
				if (str[i].toUpperCase().charAt(0)>str[j].toUpperCase().charAt(0)) {
					temp = str[j];
					str[j]= str[i];
					str[i]=temp;	
				}	
			}			
		}
		for(int i=0;i<n;i++){
			System.out.println(str[i]);
		}
	}
}