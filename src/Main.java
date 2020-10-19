import java.util.Random;

public class Main {

	static int genN;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random generator = new Random();
		
		int number = generator.nextInt();
		
		// to only show positive numbers
		if(number<0) {
			setNumber(-number);
		System.out.println("Generated number : " + -number);
		}else {
			setNumber(number);
			System.out.println("Generated number : " + number);
		}
		

	}
	
	public static void setNumber(int n) {
		genN = n;
	}
	
	public static int getNumber() {
		return genN;
	}

}
