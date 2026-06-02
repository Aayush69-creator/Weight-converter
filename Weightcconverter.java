import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		double weight;
		double newWeight;
		int choice;
		
		System.out.print("Welcome to weight conversion program \n");
		
		System.out.print("Choose any one option " + 
		                 "1:  Convert lbs to kgs \n 2:  Convert kgs to lbs ");
		
		choice = scanner.nextInt();
		
		if( choice == 1 ){
		    System.out.print("Enter your weight in lbs:  ");
		    weight = scanner.nextDouble();
		     newWeight = weight * 0.453;
		     System.out.printf("Your weight in kgs is %.2f", newWeight);
		}
		
		else if( choice == 2 ){
		    System.out.print("Enter your weight in kgs:  ");
		    weight = scanner.nextDouble();
		    newWeight = weight * 2.2042;
		    System.out.printf("Your weight in lbs is %.2f", newWeight);
		}
		
		
		else{
		    System.out.println("Invalid choice!!!! ");

		}
		
	}
}