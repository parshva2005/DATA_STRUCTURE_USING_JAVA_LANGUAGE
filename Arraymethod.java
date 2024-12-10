import java.util.*;
class ArrayDatabase {
	int[] data;
	int i;
    public ArrayDatabase(int[] data) {
        this.data = data;
    }
    public int sum() {
        int sum = 0;
        for (i=0;i<data.length;i++) {
            sum += data[i];
        }
        return sum;
    }
    public int min() {
        if (data.length == 0) {
            System.out.print("Array is empty");
        }
        int min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }
    public int max() {
        if (data.length == 0) {
            System.out.print("Array is empty");
        }
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }
    public double avg() {
        if (data.length == 0) {
            System.out.print("Array is empty");
        }
        int sum = sum();
        return (double) sum / data.length;
    } 
}
public class Arraymethod{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER A NUMBER OF ARRAY ELEMENT : ");
		int n = sc.nextInt();
        int[] array = new int[n];
        for(int i =0 ;i<n;i++){
        	System.out.print("ENTER A ELEMENTS : ");
        	array[i]=sc.nextInt();
        }
        ArrayDatabase arrayDB = new ArrayDatabase(array);
        System.out.println("ENTER YOUR CHOICE : ");
        System.out.println("OPTION 1 TO SUM ");
        System.out.println("OPTION 2 TO MIN NUMBER ");
        System.out.println("OPTION 3 TO MAX NUMBER ");
        System.out.println("OPTION 4 TO AVG ");
        int opt = sc.nextInt();
        if(opt==1){
        	System.out.println("Sum: " + arrayDB.sum());
        }
        if(opt==2){
        	System.out.println("Min: " + arrayDB.min());
        }
        if(opt==3){
        	System.out.println("Max: " + arrayDB.max());
        }
        if(opt==4){
        	System.out.println("Avg: " + arrayDB.avg());
        }
	}
}
