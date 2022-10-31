import java.util.Scanner;

public class PowersTable {

	public static void main(String[] args) {
		System.out.println("Thank you for using the Powers Table!");
		System.out.println();

		try (Scanner in = new Scanner(System.in)) {
			String answer = "yes";

			while (answer.equalsIgnoreCase("yes")) {
				System.out.println("Enter an integer: ");
				int numInput = in.nextInt();
				System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");
				System.out.println("======" + "  " + "=======" + "  " + "=====");
				for (int i = 1; i <= numInput; i++) {
					int numSquared = (int) Math.pow(i, 2);
					int numCubed = (int) Math.pow(i, 3);
					String message = "\n" + i + "      " + numSquared + "      " + numCubed;
					System.out.println(message);
					System.out.println();
				}

				System.out.print("Would you like to continue? (yes/no): ");
				answer = in.next();
			}
		}
	}

}