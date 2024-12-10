import java.util.*;
public class Armstrong{
	public static void main(String[] args) {
		for(int i=1;i<=1000;i++){
			if(isArmstrong(i)){
				System.out.println(i);
			}
		}
	}
	static boolean isArmstrong(int a){
		int q = a;
		int n=a;
		int rem;
		int b;
		int c=0;
		int count=0;
		while(n>0){
			count++;
			n=n/10;
		}
		while(a>0){
			rem=a%10;
			b=1;
			for(int j=1;j<=count;j++){
				b=b*rem;
			}
			c+=b;
			a=a/10;		
		}
		if(q==c){
			return true;
		}
		else{
			return false;
		}
	}
}

