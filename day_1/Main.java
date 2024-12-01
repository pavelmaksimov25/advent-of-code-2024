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

		Collections.sort(left);
		Collections.sort(right);

		int distance = 0;
		for (int i = 0; i < left.size(); i++){
			distance += Math.abs(left.get(i) - right.get(i));
		}

		if (distance == 11) {
			System.out.println("Success");
			return;
		}

		System.out.println("Failure. Result: " + distance);
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
