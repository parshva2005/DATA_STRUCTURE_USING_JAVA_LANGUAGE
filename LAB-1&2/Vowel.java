import java.util.*;
public class Vowel{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		if(a=='a' || a=='A' || a=='e' || a=='E' || a=='I' || a=='i' || a=='O' || a=='o' || a=='U' || a=='u'){
			System.out.print("VOWEL CHARACTER");
		}
		else{
			System.out.print("NOT A VOWEL CHARACTER");
		}
	}
}