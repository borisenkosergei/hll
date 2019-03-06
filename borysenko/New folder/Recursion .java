package Task2;

public class Recursion {
	void recursionNumber(int number) {
		if (number > 1) {
			recursionNumber(number - 1);
		}		
		System.out.print(number + " ");
	}
}