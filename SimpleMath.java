import java.io.*;

public class SimpleMath {
	public static void main(String args[]) {
		SimpleMath simpleMath = new SimpleMath();
		simpleMath.calculation();
	}
	
	private void calculation () {
		InputStream inputStream = System.in;
		BufferedReader buffRead = new BufferedReader (new InputStreamReader(inputStream));
		int exceptionChecker = 1;
		
		do {
			try {
				int calcNumber1 = getUserInput("What is the first Number? ", buffRead);
				int calcNumber2 = getUserInput("What is the second Number? ", buffRead);
		
				System.out.println(calcNumber1 + " + " + calcNumber2 + " = " + (calcNumber1+calcNumber2) + "\n" + calcNumber1 + " - " + calcNumber2 + " = " + (calcNumber1-calcNumber2) + "\n" + calcNumber1 + " * " + calcNumber2 + " = " + (calcNumber1*calcNumber2) + "\n" + calcNumber1 + " / " + calcNumber2 + " = " + (calcNumber1/calcNumber2));
				exceptionChecker = 0;
			} catch (Exception e) {
				System.out.println("\nSie haben eine Falscheingabe gemacht!\nDas Programm startet neu.\n");
			}
		} while (exceptionChecker == 1);
	}
	
	private int getUserInput(String message, BufferedReader buffRead) throws Exception {
			System.out.print(message);
			return Integer.parseInt(buffRead.readLine());
	}
}