package DayFour;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainDayFour {
    static void roundOne() {
        String input = getTestInput();
        String[] lines = input.split("\n");
        int score = 0;
        for (int i = 0; i < lines.length; i++) {
            for (int j = 0; j < lines[i].length(); j++) {
                if (lines[i].charAt(j) == 'X') {
                    score += findXmas(i, j, lines);
                }
            }
        }

        System.out.println("score is: " + score);
    }

    static void roundTwo() {
        String input = getTestInput();
    }

    private static int findXmas(int i, int j, String[] lines) {
        // horizontal left to right
        try {
            if (lines[i].charAt(j) == 'X' && lines[i].charAt(j + 1) == 'M' && lines[i].charAt(j + 2) == 'A' && lines[i].charAt(j + 3) == 'S') {
                System.out.println("XMAS");

                return 1;
            }
        } catch (Exception e) {
            System.out.println("fail");
        }

        return 0;
    }

    public static void main(String[] args) {
        roundOne();
//        roundTwo();
    }

    public static String getTestInput() {
        return "....XXMAS.\n" +
                ".SAMXMS...\n" +
                "...S..A...\n" +
                "..A.A.MS.X\n" +
                "XMASAMX.MM\n" +
                "X.....XA.A\n" +
                "S.S.S.S.SS\n" +
                ".A.A.A.A.A\n" +
                "..M.M.M.MM\n" +
                ".X.X.XMASX";
    }


    public static String getInput() {
        return "";
    }
}
