import java.util. Scanner;
public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try (Scanner Cal = new Scanner(System.in)) {
			System.out.println("Welcome to Grand Circus' Room Detail Generator!");
			String answer;
			do {
				System.out.print("Enter the length:");
				double length = Cal.nextDouble();

				System.out.print("Enter the Width:");
				double width = Cal.nextDouble();

				double area = length * width;
				double perimeter = (length *2)+ (width * 2);

				System.out.println("Area:" + area);


				System.out.println("Perimeter:" + perimeter);

				System.out.print("Continue? y/n:");
				answer = Cal.next();
			}
			while (answer.equals("y"));


		}


	}

}
