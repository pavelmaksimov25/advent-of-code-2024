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
        int score = 0;
        try {
            // horizontal left to right
            if (lines[i].charAt(j) == 'X' && lines[i].charAt(j + 1) == 'M' && lines[i].charAt(j + 2) == 'A' && lines[i].charAt(j + 3) == 'S') {
                System.out.println("horizontal: XMAS");

                score += 1;
            }
        } catch (Exception e) {
        }

        try {
            // horizontal backwards
            if (lines[i].charAt(j) == 'X' && lines[i].charAt(j - 1) == 'M' && lines[i].charAt(j - 2) == 'A' && lines[i].charAt(j - 3) == 'S') {
                System.out.println("horizontal backwards: XMAS");

                score += 1;
            }
        } catch (Exception e) {
        }

        try {
            // vertical
            if (lines[i].charAt(j) == 'X' && lines[i + 1].charAt(j) == 'M' && lines[i + 2].charAt(j) == 'A' && lines[i + 3].charAt(j) == 'S') {
                System.out.println("vertical: XMAS");

                score += 1;

            }
        } catch (Exception e) {
        }
        try {
            // vertical backwards
            if (lines[i].charAt(j) == 'X' && lines[i - 1].charAt(j) == 'M' && lines[i - 2].charAt(j) == 'A' && lines[i - 3].charAt(j) == 'S') {
                System.out.println("vertical upside down: XMAS");

                score += 1;

            }
        } catch (Exception e) {
        }
        try {
            // diagonal top-left to bottom-right
            if (lines[i].charAt(j) == 'X' && lines[i + 1].charAt(j + 1) == 'M' && lines[i + 2].charAt(j + 2) == 'A' && lines[i + 3].charAt(j + 3) == 'S') {
                System.out.println("diagonal top-left to bottom-right: XMAS");

                score += 1;

            }
        } catch (Exception e) {
        }

        try {
            // diagonal top-right to bottom-left
            if (lines[i].charAt(j) == 'X' && lines[i + 1].charAt(j - 1) == 'M' && lines[i + 2].charAt(j - 2) == 'A' && lines[i + 3].charAt(j - 3) == 'S') {
                System.out.println("diagonal top-right to bottom-left: XMAS");

                score += 1;

            }
        } catch (Exception e) {
        }

        try {
            // diagonal bottom-left to top-right
            if (lines[i].charAt(j) == 'X' && lines[i - 1].charAt(j + 1) == 'M' && lines[i - 2].charAt(j + 2) == 'A' && lines[i - 3].charAt(j + 3) == 'S') {
                System.out.println("diagonal bottom-left to top-right: XMAS");

                score += 1;

            }
        } catch (Exception e) {
        }

        try {
            // diagonal bottom-right to top-left
            if (lines[i].charAt(j) == 'X' && lines[i - 1].charAt(j - 1) == 'M' && lines[i - 2].charAt(j - 2) == 'A' && lines[i - 3].charAt(j - 3) == 'S') {
                System.out.println("diagonal bottom-right to top-left: XMAS");

                score += 1;

            }
        } catch (Exception e) {
        }

        return score;
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
