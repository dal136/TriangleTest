import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if(a < 1 || a > 200){
			System.out.println("The first input should be 1~200.");
			return;
		}
		if(b < 1 || b > 200){
			System.out.println("The second input should be 1~200.");
			return;
		}
		if(c < 1 || c > 200){
			System.out.println("The third input should be 1~200.");
			return;
		}
		
		if(a >= b+c || b >= a+c || c >= a+b){
			System.out.println("Not A Triangle");
			return;
		}
		
		if(a == b && b == c){
			System.out.println("Equilateral");
			return;
		}
		else if(a == b || b == c || a == c){
			System.out.println("Isosceles");
			return;
		}
		else{
			System.out.println("Scalene");
			return;
		}
		
	}

}
