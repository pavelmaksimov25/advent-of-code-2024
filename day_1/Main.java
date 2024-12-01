import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	static void solutionOne() {
		String input = getInput();
		String[] lines = input.split("\n");

		List<Integer> left = new ArrayList<>();
		List<Integer> right = new ArrayList<>();

		for (int i = 0; i < lines.length; i++) {
			String[] parts = lines[i].trim().split("\\s+");
			left.add(Integer.parseInt(parts[0]));
			right.add(Integer.parseInt(parts[1]));
		}

		System.out.println("Left side: " + left);
		System.out.println("Right side: " + right);

		System.out.println("Sorting...\n");

		Collections.sort(left);
		Collections.sort(right);

		System.out.println("Left side: " + left);
		System.out.println("Right side: " + right);
	}
    
    public static void main(String[] args) {
    	solutionOne();	
    }

	public static String getInput() {
		return "3   4\n" + // test input from task description
				"4   3\n" +
				"2   5\n" +
				"1   3\n" +
				"3   9\n" +
				"3   3";
	}
}
