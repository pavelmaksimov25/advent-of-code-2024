package DayFour;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainDayFour {
    static void roundOne() {
        String input = getTestInput();
        String[] lines = input.split("\n");

        System.out.println(lines[0]);
    }

    static void roundTwo() {
        String input = getTestInput();
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
