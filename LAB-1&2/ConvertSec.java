import java.util.*;
public class ConvertSec{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER A SECOND : ");
		int sec = sc.nextInt();
		int hour=0;
		int min=0;
		while(sec>60){
			if(sec>60){
				min++;
				sec-=60;
			}	
			if(min>60){
				hour++;
				min-=60;
			}
		}
		System.out.print("HOUR : "+hour+" MIN : "+min+" SEC : "+sec);
	}
}