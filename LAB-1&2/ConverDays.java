import java.util.*;
public class ConverDays{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER A DAYS : ");
		int day = sc.nextInt();
		int years = 0;
		int week = 0;
		while(day>6){
			if(day>=7){
				week++;
				day-=7;
			}
			if(day>=365){
					years++;
				day-=365;
			}
		}
		System.out.print("YEARS : "+years+" WEEK : "+week+" DAYS : "+day);
	}
}