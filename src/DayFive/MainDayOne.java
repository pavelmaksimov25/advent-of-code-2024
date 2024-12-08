package DayFive;

import java.util.*;

public class MainDayOne {
    static class Rule {
        int x, y;

        Rule(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static void roundOne() {
        List<Rule> rules = parseRules(getRules());
        List<List<Integer>> updates = parseUpdates(getTestInput());
        int sumOfMiddlePages = calculateSumOfMiddlePages(rules, updates);

        System.out.println("Sum of middle pages: " + sumOfMiddlePages);
    }

    private static List<Rule> parseRules(String input) {
        List<Rule> rules = new ArrayList<>();
        String[] lines = input.strip().split("\n");
        for (String line : lines) {
            String[] parts = line.split("\\|");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
            rules.add(new Rule(x, y));
        }
        return rules;
    }

    private static List<List<Integer>> parseUpdates(String input) {
        List<List<Integer>> updates = new ArrayList<>();
        String[] lines = input.strip().split("\n");
        for (String line : lines) {
            String[] pasrt = line.split(",");
            List<Integer> update = new ArrayList<>();
            for (String part : pasrt) {
                update.add(Integer.parseInt(part));
            }
            updates.add(update);
        }
        return updates;
    }

    private static int calculateSumOfMiddlePages(List<Rule> rules, List<List<Integer>> updates) {
        int sum = 0;

        for (List<Integer> update : updates) {
            if (!isCorrectlyOrdered(update, rules)) {
                continue;
            }

            int middleIndex = update.size() / 2;
            int middlePage = update.get(middleIndex);
            sum += middlePage;
        }

        return sum;
    }

    private static boolean isCorrectlyOrdered(List<Integer> update, List<Rule> rules) {
        Map<Integer, Integer> pageIndexMap = new HashMap<>();
        for (int i = 0; i < update.size(); i++) {
            pageIndexMap.put(update.get(i), i);
        }

        for (Rule rule : rules) {
            Integer x = pageIndexMap.get(rule.x);
            Integer y = pageIndexMap.get(rule.y);

            if (x != null && y != null && x >= y) {
                return false;
            }
        }

        return true;
    }

    private static void roundTwo() {
    }

    public static void main(String[] args) {
        roundOne();
//		roundTwo();
    }

    private static String getRules() {
        return """
                47|53
                97|13
                97|61
                97|47
                75|29
                61|13
                75|53
                29|13
                97|29
                53|29
                61|53
                97|53
                61|29
                47|13
                75|47
                97|75
                47|61
                75|61
                47|29
                75|13
                53|13
                """;
    }

    private static String getTestInput() {
        return """
                75,47,61,53,29
                97,61,53,29,13
                75,29,13
                75,97,47,61,53
                61,13,29
                97,13,75,29,47
                """;
    }


    private static String getInput() {
        return """
               """;
    }
}
