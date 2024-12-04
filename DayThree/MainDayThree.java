import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainDayThree {
    static void solutionOne() {
        String input = getTestInput();
        String[] lines = input.split("\n");
        int score = 0;

        // Plan
        // 1. use regex to find matches Done!
        // 2. extract two numbers separated by comma.
        // 3. multiply
        // 4. write result to a variable

        for (String line : lines) {
            List<String> parsedLine = parseLine(line);
            for (String entry : parsedLine) {
                List<Integer>numbers = extractNumbers(entry);
                if (numbers.size() != 2) {
                    continue;
                }

                score += numbers.get(0) * numbers.get(1);
            }
        }
        System.out.println("Actual result: " + score);
        System.out.println("Expected result: 161");
    }

    static void solutionTwo() {
    }
    static List<String> parseLine(String line) {
        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile("mul\\(([0-9]{1,3}),([0-9]{1,3})\\)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            // Full matched substring
            result.add(matcher.group());
        }

        return result;
    }

    static List<Integer> extractNumbers(String input) {
        // Regex pattern to match `mul(x,y)` and capture x and y
        String regex = "mul\\(([0-9]{1,3}),([0-9]{1,3})\\)";
        List<Integer> result = new ArrayList<>();

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        // Extract and print x and y for each match
        while (matcher.find()) {
            // Extract x and y values from capturing groups
            int x = Integer.parseInt(matcher.group(1));
            int y = Integer.parseInt(matcher.group(2));
            result.add(x);
            result.add(y);
            return  result;
        }

        return result;
    }

    public static void main(String[] args) {
        solutionOne();
//        solutionTwo();
    }

    public static String getTestInput() {
        return "xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))\n";
    }


    public static String getInput() {
        return "";
    }
}
