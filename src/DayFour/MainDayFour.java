package DayFour;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainDayFour {
    static void roundOne() {
        String input = getInput();
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
        return "MMMSAMXAMMXSXXMAXAXXXSASAMXSAMXSAMXMAXSAMXSXSMSASAMXXXSASXSMSSSSXMAMSAXMSSXXASASMASXAXXMSMSSMMMSAMXMMMMXMXSXXMSXMAXXMAMXMSSXXMAMMMSMMMMMSXAX\n" +
                "XAAXAMXMASXMASMSSSXSASASAMXMXMAMXMAMXASXAXMAXAMXSAMSMMSAMASAAAAAMXMASMMMMMMSMMASAXAMMMSMSMAAAASMMXSMSMSASMAASXMASMMSXMASASASXMASXMASAAASMMAM\n" +
                "SMMSAMAMMAMXAMAMAAAMAMXSMMAXAMMSXSAMXASMSAMAMAMASXMASASAMAMXMMMMAXMAMAAAAAAAMMMMXMSAAXMASMMSMMSAMXSXAASASAMXMASXMAASAMAXMXMAXSASASASXSXXXAMA\n" +
                "XAAMAXMASASMSSXMMMMMAMAMASMSMSAAAXASMAMAMMXMXAMXMAMASXSAMXMASXSXSXMASXMSSSSMMAASAMXSMSMAMAMXMXXAMASMMXMMMXMASXMAMMMSAMXSXSMMMSASAMASAMASMSAS\n" +
                "MMMMMMMASASAMXMXMSMMAMAXAMMAAMMSSMAMMSMSXSAMXSSMSSMASMSXMAMXMASAMAMXMMAXAXXXSSSSMXMASMMASAMMMMSAMASXXAAAAASAMAXXMAXSXMAMMXAAAMMMXMAMAMAMAMMM\n" +
                "SASASAAMMAMXMASXMAMSASXSSSSMSMMAAMAMAXAXMMASAMAMAXMSMAXMSASMMMMXSAMAMMMMMMXMXMAXXSAMXXSASASXAMSAMXSXSXSMSXMMSSMSSSXSASMSMSSMSSXAXMXSSMAMSMXX\n" +
                "MASASASMMMXAMXAXSMMSMSAAAMXAMXXMMSAMXSXXASAMASAMAMMAMMMASXXAMMAAMXSXSASASASMAMXMXMAMMXMASAMMAXMASXMAXAAAMAXAAAAAAXAMAMXAAAXMAXMASXAAXAXMMXSX\n" +
                "MAMAMMXXAMSXSAMMXMASMMMMMMMMMMMXXMAXMAMSMMXSMMXMSSSMXAAMMXSSMMMSXMXMXMSASASMASAMASAMXAMMMMMASMMASMMAMSMMMAMSSMMMSMMMSMSMMMSMXSMSMMMMMMAMXASA\n" +
                "MXSXMAMSAXXMXAMASMASXSXMAMAMAMXMASMMXAMSAMXSAMXXAAXXMSSXXXXMAXAAMMXSMAMMMXMXAMASASMSSMMAAAXSMAMASAMAMXAXMXXXAXAXAAXXAAMXSAXAXMXAXAMMSMAXMAMA\n" +
                "MAMAMAXSXXAMSSMAXMMSAMASXSASXXSAMXAMMSXSAMMMMMAMMSMSAMXAMSAMXMASASAMMMMAXASMSSMMASXAASASXMXMMMMASXXXXXSMSXMSXMSSSSMSMSMAXMASASXMSXMAASMMMAMM\n" +
                "MMSSMMMXSXXXAXMSMMAMASAMMMMSAAXXXXSMAXAMAMAAAAAAAXAXXMMMMSAMSSMAXAAMXMSMSAXMXAXMSMMMSMMMASASASMXSMMSAAMAMMMSXMAXMAXXXAMXSMXMXMAXAAMSMMSXSMSS\n" +
                "XAAXAXMAMSAMMXMXAMXMAMASXAAMMMMXMAXMMMMXMMSSXSASMMAMXSAMMMAMAAXMASMMXXAMMXMMSSMMAMAMXAXSMMXSAMASXMASMSMXMAXMASMMSAMSSMSAMXAMASMMMSMXAASMMAAA\n" +
                "XMXSMMMAMAXASASMSMSMXSAMMMSSMXMXMAXASMSAXMAXAMAMXSMMASMSMSMMSMMXMXMAMMSSMMSAAMXSAXAMMAMXXSAMAMXSAMXSXXXMSMMAMXMAXXAAAASMMSASXSXXMMAMMXMAMMMM\n" +
                "MMMMMASXMXSXSASAAAXAAMASXMAMAAMAMMSXSASMSMMSSXXAAMAMXSXAXMAAMXSAMASAXAMAAAAMMMASMSSSMAXXAMXSAMXSAMAXMMAXAAMSMSMSSMSMMMMAMSXXMMMMAMAMXAXXMXMS\n" +
                "XAAXMASAMMXAMXMXMMMMMSXMMSAXSASXSXMMMAMXMAAMMSAMXSXMASXMSSMMSASASASASXSSMMSMXMASXAAMMSMMMSMXASASAMMSASMMMSMAAXAMXAAXAAMAMMMMXAAXXMSAXMSXMAMA\n" +
                "SSSSMMXAMXMXMAMXSMXMAMAXXXAXMXSASAAXMAMAXMMSASMMMAMXAMAXAAAAMMSMMAMAMMAXSMAMXMAXMMSMAMXSAAASXMASAMMXAXXAXAMMSMXMMMMXXXSXMAAAMXSSSXXAASAMMSSM\n" +
                "MAMXMXMMMMAXMMXAXXXMASAMMMSMSAMASMMMSAMMXSAMASXSXSXMASMMSSMMSMSAMXMMMMSMMMMSXMAXSMMMXMAXMAXMMMAMAMSMMMSXSMXSAXAASASXSMAMSSMSSXAXXAMXMMASXAAX\n" +
                "SAMASMSAAASMMXMSSSSSMXAAXAAXAXMMMAMASXMSAMASAXAXXXSMAAAAAAXXAAXMMSXMAAAASXMMMMMMSAXAAMMMSSSXSMMXMMSASAMXAMXAAXMAMXMAAMXMAXMAMMMMMMMXXMAMMSMM\n" +
                "SAMAXAMMSMAAMMSMAMXAMSSMMSSSMSSXSXMXSMAMSSMMMMSMMMXMASMMMAMSMSMXAMASMSSSMAAMMMSASXMMSSMAMAAASMXAAMSAMASMSSSMMMMSMMMSMMSMMXSASASAMASXXXASMMXS\n" +
                "SMMSXSXXAXSAMXAMAMSAMXMAMXMAXAXXMAMAXMAAXMXAAAAAAXMAXMXXMXMXAMMMASXMAMMXXSMMAAMASXXAAMMAMMMMMASXSMXAMAXAAAXXSAMXASAAASXXXXMASASXSASAMMMSASAM\n" +
                "XMAXSMXMAXMAMSASAMXASMSSSSSSMMSSMSMMXSMSMMSXMSSSMSSMSSSXMAXMMMMXAMMMSMAAXXXSMSSMMMMMSXSXSAAAMXMAAAXXMXMMMMMMSASMMMSXSAMSMXMMMAMAMMSXMASMXMAM\n" +
                "MMXXAXAXXASAMSAMXMSMMAMAAAAXAAAAAMAXXXXMAMASAMXXXAAXAXMAXAXSAMAMMSMAMMMMSMXMAMXMAASAMMSMSXSSSMMSMMSMMXMAAMSXSXMASMMXMAMXMAXAMAMAMMSASXSAMSAM\n" +
                "SSMSSMMMMMXMMSAMSAMXMAMMSMMMMMSSMSAMMXMSSMMAMMMMMXSMSSSSMASMAMXSAAMASAAXMMAMSMXMSMMAMAXASAXAMAMXAXXAAMSSSMSAMMSSMAMMSMSMSMSXSASASMXASAMXAMAM\n" +
                "XAAAAAAAXXSSXSAMXMAXSXXAAMMAMXAXXXAMASXMASMXMASASXMAXAAMMXMMXMASMXMSSXMSSMXSAAXMMXSAMXSSSMMMMSMSMMSSMXXAMXMXMASAMAMAAXAAMAAASASASMMMMMMSSSSM\n" +
                "SMMXXSMXSAMXAMXMAMXMAXMXSXXASAMXMSSMAXAXSAMSSMXMXAMXMMMXMSMXSAMXXSXXXXXAAXSAMSMSAMSXMMXAXXAAAAAAAAAAXMMAXMSAMXSAMAMSSMMSMMMXMXMMMXAAAXMAAAXM\n" +
                "AXMSAAAAMAMMXMAMASASXSSMAMMMXXXAMAAMAMSMMAXAAAMSSMMMXAAMMXAASMSMAMMSXSMSSMSAMXMMAMMASMMMMXMMMSMSMMSSMXSXMAXXXASAMXMAMASMMAXXMSAMXSSMSSMXMXMX\n" +
                "AMAAMMMSMSMMASMXXSASAAXMAMXSSMMSSSSMMSMASXMSMMMMAXAXSSMSAMMMMAAAAAAXAAXXAMXAMXSSSMSAMXAMASXSAMXAAAXXXXXAMSSSMASMMSSMSMMASMSMMASMXXXAMXMAXSXM\n" +
                "SXMMXMAXAMXSMAMSAMXMMMMMASAMAAMAAAXMXAMXMXAXXSAMXMMXAAAXMAMAMSMSSSSMSMSSSMSAMXAAAAMAXSXMMMAMAMSXMMSMSMSAMAAXMAMAMAAASXSMMMAAMAMMXAMXMAMMXXAM\n" +
                "AAXXSXAMMMXSMAAMAMASAXMAXMAMSMMMMMMSSMMMAMSMASMSAMXMMMMMXMASMMAAAXAAXXAAAXXAMMMSMMMXMAXSMSXMAMAMSAMAXAAXMMSMMMSAMMSMMAXXASMSMXSXMXMSSMSSMSAM\n" +
                "MSAMAMASAMXXMXXMSMASASXSXSXMXXSAAAAXXSXMASMMAMASXSXXAASXSAMXAMMMSMMSMMMXMMXMXSXXMAXXAMMXAAAXXMSXMAMXMMMXSXMAXAMAMAAXMSMSMMAXXMMAMXAAXSAAASMM\n" +
                "XMAXMMAXAMMASXSSMMXSMMMMASAMXASMXMMSASXSXSXMASAMMMMMXXSAMXSMMXAMAXXAAAAASMMSAMAMSXSAMXAMSMSAAAXXMSMAAAMMMASMMSSSMSMXMAAAXMASXAXAMAMMSMMSMMMS\n" +
                "MSMMXMMMXMAAMAXMASAMXAXMAMAAMMMSXSAMXMASAMMSXSAMAXAASMMXMAXASMXSASXSSMSSXAXMAMSMMASXXMXMMAXMMMMMMXAXSAXAMXMMAXAMAMAASMSMXMMSXMMAMXXXMAAXMXXX\n" +
                "XAAXSASAAXSSMSMSXMXSMMXSASXMXAAXXMAXAMXMAMASMSASMSXXAAMSSMSXMAMMMMMAMMMMMSMMAMXAMAMMXMMXMAMXSAMAMMAMXMSMMAXMAMSMAMSMMAAAAXAMXMAXXMASXMMSMSSS\n" +
                "SSXMSAASXXAMAXAXMMMAXAAXXSASAMXMXXMXSMMSSMMXAXAMAAXASXMAAXMMMAMASAMAMAASMMAMAMSXMAMSASASMXMASXSAXXXMXMAXSXSXAMXMMXXMMSMSMSASMMSXAXAXAASXAAAX\n" +
                "MMSAMSMMMAMMAMSAAXAAAMXSASAXASAMASMAXAMAXMSMSMMMMMMMMAMSSMMASMSASASMSSMSASMMAXMMXMAMAXMXMAAMSMSMSMMMXSAMMAMXMASAMXMSAAAAAAAXMAMSMMSXMMMAMMSM\n" +
                "XAXMXAXMAMAMXSXMMAMAAAAMAMMMMSASAMMASAMMSXAAAAMXMMAXSAMXMASASXMAXAMMAMXMAMASXXMXAXMMSMMSSMSXMASXAAAMMMMAAAAXMASXMASMSMSMSMXMMSXMMAXAXXXAMXAA\n" +
                "MMSSXMXXSXSXMAXASXSSSSMMXAXMXXXMASMASXMMMMSSMSAMXMMAXAMASMMMMXMAMXMMSXSASMMXAMSXMSXAXAAAAAXMSMMXSXMMXAXMSSMMSASAMXMXXXXXAXSXXXASMAMMMXMAMXMX\n" +
                "SAAMAXMAMXXAMASXMAMAAAXAXSXMASMSMMXXXAXAAAMAMXAXMSMSSXMXSMAASMMASXAXAMMAMAXMMMAASAMMSMMSSMMAAAAAMXSXSASXAAAXMAMXAMXAXMMSASAXXMAMMMSSSXSMSASX\n" +
                "MMSXMMAASMSSMAXAMSMMSMMSXMAXAAAAAXXSAMSMMMSAMXAMAAAXAASAMASMAASASMMMSSMXMXMXSMSXMAMXAAAMAAMSSMMMSASASAAMSSMMMSMSMSMXMAAXMMAMXMSMSXAAAAAASAMA\n" +
                "SXAMMSSXSAAXMASXMMAXAXAXASXMXMSMMSASXXAAXXMASXSSSMMMMMMASAMXSAMXSAXAMXMASMMXXAMMSXMSSSMXSAMXMXAAMAMAMMMAXAXMXXASASASMSMMSMXASXXAXMXSMMMMMAMX\n" +
                "AXMAXAXMMMMMMXSAASMMMMSSMMASXAXASMAMMSSSMSSMMMXAAXXAAXSXMASAMASMSXMXXAXXAAXAMXMAMAMAAAAXXSXAMSSMMXMXMAXMMAAAAMSMAMAXAXXAAMXAAAMMSMMXXAXAXAMX\n" +
                "MMXMMSXMAXXXMXSMXMSAMSMAMMASMAMMMMAMXAAAAMAMSAMSMMSSXMAXMXMMSAMMMAMMSSMSSMMAXSMXSSMMSMMMAMMMXAAASXMMSXSAAASMXSAMXMMMAMMSASMAMAXAAXMASMSSMMSM\n" +
                "XAMXAAMSAMSAMAMXXAMXMAAAXMASAMMAMSAMMMSSMSAMXSAXMAXMMMAMXMSXMMSASXSAAAAXAASMMXAXSAMXXAAMAMAXMSMMMASXAAMASAMAMAMXAAMMSXXMXXXMAMMSSMSAMAAXMMAX\n" +
                "ASAMMSXSAXSAMASXMSMSXMXMSMASAMXAMSASXMAXAMXMMMXMAMXAAXSMMAAMSAXASAMMXMSMSMMAMMMMXAMSMSSSMSSSXXAASAMMMSMAMXMMMAMSSSXAXMASMMXMAMAMXAMMSMMSXSAS\n" +
                "AMSXSXAMMMMXXAMAAAMXASAMXMASAMSSXSMMMMAMMMMMAMASMMMMMMXAASMMMAMMMMMSXAXAXMXAMXAAMMMSAMAAMAXMASXMMAMXXXMAXXXMMMXXXAMASASAAMMSAXSAMXMAAAXAAMAM\n" +
                "XMAMSMXXMASXMSSMSMXSAMASAMMSAMAMMMMAXMXSAAMSASAXAAXXAAMSMMXXSASAAMAMMMMXMMSMMSMMSAAMXMSMMMMXXAMXSAMXMMMSMXAMAMSMXXXMAXXMSMAMMSXAAXMMSMMMSMAM\n" +
                "XSXSXASXMASXAAAAAAAMAMSSXSASAMXSASXSXSASXSMSASASMMSAMSXMAMAMSASMXMASAMAXXMASMAAASMSMAMMMASMMMAXXMXXAAXAXXXXXASASMXMMSXSAXMSMMXXAMXXAMASMXXAM\n" +
                "MXMAXSMAXAXMMMMMMMMXXMXMMMASAMXSASAAAMXXAXASAMAMXAAXXXAMAMAMXMMXXSASMXSAASASMSMMSXAMMMAXAAAMSXMXMASMXMSSMXMSMSAMXAMAXAMMMMAASMMSSSMMXAMAMSSS\n" +
                "AAAMMMSXMSAMXSAMXMSMSXSXAMMMXSAMAMMMMMSMAMAMMMAMMMMMMSMMAMASMSAXXMASAAMSMMASAXMXXXMASXSMSXSMSAMXXMASAMXSAAMAMMXMSXMAMAMXAMSSMAAAAXASMSMSXAXX\n" +
                "MASXAAXXXAAMAMXMASAMSAMSXSAXMMMSMXAXAASMAMXMSXMSMSAMAAXSMSXXAMSSXSXSMMMAXAAMAMXMASMSSXAAAAMASXXAXMASXMASXXSASXSMMXMSSSSSSMXAAMMMSMMMAXAXMSSS\n" +
                "SMXXMSSMXSXMAMASMMXSMAMAMMMSMSAAMMMXMASAMAMMSAAAXMAMSMMAASAMSMXMASAMASMMSMXMAMAXMAXAXMMMMSMAMSXMSXAMAMXSMMXXSMSAASMAXAAAXXSXMXMXXMSMXMAMXAAA\n" +
                "ASASXMAMMMASASAMMMSXXSMMSAAMMMSXSASASAMAMMSASMMMSSMMXXMSMMAMMAAMMMAMAMXMAXASXSSMSXMSSMMAAXMAMMXSAMMSXMXMXSSXMASMMSSMMMMMMMMAMAMXMAAMAMXXMMSM\n" +
                "MMXSASXMASXMMAXXAMXAMMAXSMSSMAMMSASAMAXAMXMMSXSMXAAAXAXMASXMMSSSXSXMASASASMXAAMMMAMAAASMSXSAASMMMMAAAXXMASMAMAMAAMAXAXSASAAAMASAMSMXXXAMAMAX\n" +
                "XMASAMXMXXAAXAMXXMMXMSMMXXMAMASAMAMMSSMASMSXMASMMMMMSSMXAMMAMAMMXMASASXSAXXMMMMAMAMMSMMAMAXXMXAAAMXSSMAASXXAMXMMMSMMMMMASMSXSASXXAMMSXMAXXAX\n" +
                "SMXSMXXMASXMMXSAMXSMMAASXMSXMAMAMXMMAAXSMMMAMAMAAXAXXXAMSMMMMAMXXMAAAMMMMMMXSASMSSSXAAMXMAMSSSMMMMMAMMSMMMSMSXXSXSXMASMXMXXMAMMXMASASASMSMSM\n" +
                "SSMMMMXMAMAAAAMASXAAMMXMAMAMMMMAMXMMSSMXAMMAMASXMSSSMMXMAAAMXSMSMXAMSMSAAAXASMSAAAXXXMMMMXMXAAXAAXMAMAXAXXAAAMAMAMXXAXXSSXAMMSSXSXMASXMASAMS\n" +
                "MAMAAXXMMSSMMXMAMXMSMMMSXMXSASMSSSXAAAASAMXSSMXAMXMAXAASXSMSAMAAASMXMASMSSMMSAMMMMMMXMAXSAMXSMMMMXXAMXMMMSMSMSSMAMMMSSMAAAMSAAAXAMMMMAMAMXMA\n" +
                "SAMSSSMSAAAASAASXSMAXAAAMAXMASAAAXMMSSMMXMAXAXSXMAMSMSMXXAAMAMAMMAXAMAMXMAXAMXMMXMAXAMAXSASMXMXSASXSSSSXAXAAXMASXMAXXAAMSMMMMSSMMXSASMMSSMXM\n" +
                "SXXXAAAMMSSMMAXXAASASMSMMMSMSMMMMMMMAMMSXSXSAMXMSMSAAXAXSMSMSMAXSMSAMMXSMASMAAXMASXSMSSMSXMAXMAMMSAAAAXMMSMSMSMMMXSMXXXXAAXXAXAAXMMAXSAXMAXX\n" +
                "SMSSSMMMAMAAXSSMSMMXSMMAXMAMAAXXXSXMASXXAXAMXMXMASXMMMXMAAXAAXXXSXSXMSAMXAAXSSSMXSAAAAXAMMMSMMASAMMMMMMMXAAAAAXMAXXAMMSSMSSMMSSMMAMSMMMSMSSX\n" +
                "SAAAXXXMASXMMXAMAXMAMASXMSASMSMMASAMSSMMSMMMAXAMXXMAAAMSMMMMMSMASAMAAMMMMMSMMAMMMSAMXMMSMMAXASMSXSSXMXXXXMSMSMSMSSMXSAAAXAMAXAAAMMMXAAXAAASX\n" +
                "MMMSMMXSAXAXSSSMSXSAMAMAMXMMXXAXAMMMMMAAMAMSMSMSASXSMSMXAAAXAXMAMAMXMASMAMAMMAMMAXXXXSAMAMAXAMASXXMAMMMMSMAAMXSXAAMAMXSXMMSSMSXMMASMSMXSMMSS\n" +
                "XMAXAMAMMSMMMAXAXAMXSASMMSMSMSXMMSXXAMSMSAMXMAMMASXAXXXSSMSMMSMMSXMXXSXSASXSMMSXSSMXXMASMMMSMMAMSMSMMASAAMXMMMMMSXMXSAMMMXAXXMMSSMSAAMXMAMXX\n" +
                "SMAXAMAXXAXAMXMMMSMASXSXAASAAASXXAXSMXAAXXMMSMMMMMXSAMXAMAXXSAMMXAXSMXXSMSAAXMAMMAMSSSMMMAXAXMXMXXAASAMXSXSAAXXAAAXXMASAMMXSAMXAAXMXMXAXAMAS\n" +
                "XMSXMMAXSMSXMSASAAMMMXXMMXSMSMAMMMMMMMMSMAXMAAASASXMASXXMMMMSASXSMMMASMSMMXMMMAMSAMAAXMAXXMXMAMXSMSMMASMXASMSMSXSXMAMAMAMXMSAMMSSMSMSMSSSMXS\n" +
                "AXMASMMXSAMXMSAMSMMAAMMSSMMXMXMAAXAAASAMMMMSMSMSASMSXMASMMXAMXMAAXAXSXAXAAMXAXMXSXMMSMSAMSASXMMXXAXMXMMAMAMAMASAAMSXMASXXMASAMAAAASAAAAAAMMM\n" +
                "MSMAMASAMMMAXMAMAMXSAMMAAASXMXXSSSMXMSAMASAXXXAMAMMMASAXAAMXSMMSMSMMMAMSMMSXMXSAMMMSAMXAAXAMAMSSMMMAAXMXMSMXMAMMMMMASAXXAMXSAMMSMMMSMSMSMMAA\n" +
                "SAMXXXMAXXSMSSXMAXMXAMMSMMMAMMMMMMMSMXMXAMXSSMXSAMASMMSXMMMAAMAMAMXSMSMAXMAAMSMMMAXMASMMMMMSAMAAAMASXXAMXAMXMASXMMSXMASXSMXSAMXXASXXXXXXASMS\n" +
                "AXMASMSSMAXAMASXSSMXAMXAMSSMMAAAAAAMXAXMXSXMXMASASXXMAXMSAMMSMASAMSAAASXMMMSMAAAXSMSXXMAAAMAAMSSMSXMMSSMSMSSMAMAMMMSMAMXASAMXMXMASAMMSAMXMAX\n" +
                "SASASAAAMXMASAMXMAMSMMMMSMAAMSSSXMSSSMMSAAAMAMMSAMAAMASMSASAAMXMAXXMSMSXSAAMMMMMMMAAMMSSSSMXXMAXAXAXAAAAMXMXMASXMAASMSXSAMMSAMMXAXASAAXMXMSX\n" +
                "MAMASMMMMXSAMXSXSAMXXAAMAMMMMMMMAXAAAAAMSSMSMSAMMMSXMMSASAMXSSMSSMMXXAXASMXMAXAXAMSMSAMAMMMMXMXMMSMMMSSMSASXSASMSMSMAAXMXAMXASXMMSAMXMXSAAAA\n" +
                "MAMAMXSAAXMXMAXAAAMXSSSSXSMSXSASMMSMSMMXMMAXXMMSXAMAMAMXMXASAAXAMAAAMXMMMSSSMMMMSMXMAXMAMAAMMSSSXSAAAAXXSASXMASAXMAXXMXMMMSMMMMAMMMMSXAMMMMM\n" +
                "MXMAXSMMSSXMASMSMSSMMMAMAMAMAMMMSAXXAMXAAMAMXMXXMMSAMAXAXXXMASMSXXMASMSXMAMAMSMAAAAXAXMAMMXSAAMAAMXSMMSAMAMXMASMSSSSXXXXAAAAAAXSMASAMMSMSXSA\n" +
                "MSSMSSMXMAXXAAAMAMXAAAAMAMXMASXAMXSAMXSXSMSMMSSMMAMXXXXSMXXXXMAXMMXXSASXMAXAMAMSSSMSMSSSMSAMMSMMXMAXAXMAMAMXMASAXAAXMXMSMSSSMXMAXXMAMXXAXAAM\n" +
                "AAASAMXASMMSXMXMXMSSMSXXAXXSAMMXSXSAMXMAXMMAAAMAXSSSXMAMAXSMMMXMASAXMMMMMMSSSMXAXAAXAAAAXMASXAAXXMAXAXXXMASASMMMMMMMMAMMMAMXMAMXMSSSMAMXMMMX\n" +
                "XSXMXMSASAMMXMMSAAAAXAASXMMMSXSXMASAMXMASAXMMSXSMXAAAMSMSMSAMXMSAMXXMSMAMAMMAMMSSMMMMMSMXSMMMSSMXMMMMSMSSMSASXASXMXXMAXAXXMASXSMMAAXASAMXMSM\n" +
                "MMAMXMMAXAAMXSASMMMSMMMMSAAAMXSAMASAMXMASMMXSAXMAMMMMMMAMXSSMXMMMSAMSAMSMAMSAMMAXXAAXXAXAXASAMXMXAAASAMAAAMAMXMMMSXMSSSMSSMXAMMAMMSMMMXXXMMS\n" +
                "ASAMAXMMSSMSAMXSXMSXAXMASMMMXASXMASASMMXSAAMAMAMSASASMXXSMMAMXSMSMMMSASXSXXSASMMXSSSSMSXMSMMASAMSMMMSASMMMMMMXXAXMAMAXAMAXMMSASAMXAAASMSMMAX\n" +
                "XSASMSXAAMXMASAMAXMSSMMXSXSXMXMMMASAMXSASMMSMXMSMMSASXAAXASAMAMXMASASXMAAMXSAMXXXXAAAXXAMAXMASXMASMASMMAXXAXMASMXSAMASMMSSXAXXSASMSSMSAAXMAS\n" +
                "ASAMXXMMSSXSAMASXMMAMXXXMASAMXAXMAMMMAMASAAMXMXAMXMMMMMMSMMSMASMSXMASAMXMMAMAMXXAXMXMMSXMASMXMASASMAMXSMMXMMSMMMAMAMMSAAXXMMSASAMXAAAMXMSMAS\n" +
                "XXAMXAAAXXXXXMXMXAMASMSMXMSAMMMMMAMAMASASMMSASMXSAXAAAAAXAAXSMSASXSASXMAXMSSMMSMMXSASXMASXSXASAMXSMXSASASMSAMAAMMSSMSXMASXSAMMMXMMSMMMAXXMAS\n" +
                "ASMMMSSSMXMAMMSAMMMAXMAMXXXAMMXAXAXMAAAASAASAXXAMMSSSSSSMMMMMXSMMAMXSASXSXMAMMAMXXSASASXMMMXXXMAXSAXMASASAMXMXMSXAMXMAMXSAMASXMASAXMASMSXMAS\n" +
                "MMAAAXAMAAMASAMASXMSXSASXMXXMASASXSXSXSASXMMAMSSSMAAAAMAMXXSXASAMXMASMMSMXSXMXMMSAMXMAXMAAAXMAMSAMXXSASMMMMSMXMSMXMAMAMAMXMAMASAMXMMAXMAXMMS\n" +
                "XSSMMMAMSMSAXXXAMXAAASASMXAASMSAAMAMXAMMMMXMAMAAAMMMMMMASAAMMMSXMAMASXXMXMMXMAMASAMSMAMSSMMSAMXMMMMMMASXAXMASAAXAASXSXMASAMAMXMASASMSSMXMAMX\n" +
                "AXAMSSMMAXMMMSMXSMMMXMAMAASMMAMXMSSSMMMAAAMMSMMXMMXASXSASMAXAMXXXASXXMXMAMMSSSMASXMMMXMAMMMMAMAXAAAAMXMXXXSASMSMMMXMAXSASMSSSXSAMMSAAAMSSSXS\n" +
                "SSSMAAAMXMSAAMMMXASMAMXMSMMAMXMSXMAAAASXMSXMAAXSMXMXXAMXSXAMMMMMSASXAMSSSSXAAAMAMMMAMXMAMSAMASXSSSSSXMASXXMAMAMXXXXMXMMASXAXMMMAXXMMMSMAAXAX\n" +
                "MAMMSSMXSASMXSAMSAMXAXXMMSMXMASXAMXMMMMAXAASMMMAMSMSMAMASMMMSAAXMMMMMMAAXAMMSMMASAMAXXMAMXAXXSAAAAAMXSASXSMSMMXSAMXSSSXAMMSSMMSMMMMXXMMMMMMM\n" +
                "MXMAXAAAMAMAMSAMMAMSXSASAAXAMXSAXMXSASXSMSXMASAMXSAMXXMASAAAXMSMSXMASXMSMMAXXXSXSMSSSSMSXSSMAMMMMMMMAMAMAMAAXXAXAMXXAMMMMXAAAAAASMSAMMMSMAAM\n" +
                "MAMSSMMMMAMXMMASXXMAASAMSMSMMAMAMMXSASAMXMASXMSXAMMMMMMXMMMMMXMAXXSASMMMXASXMXMASAAAAAAAMAMMMXSAAAAMAMMMMMSMSMXSMMSMSMAMMMSSMMXMSASASAAASMMS\n" +
                "SAMAAXXXSMSAXMAMMAMXMMMMAXAXAASAMXAMXMAMXSXMASMXMXAAAAMMSXAASXMMMMMAXAAAAMMAMXMAMMMMMMMMXMXMXASXSSSSSSMSAAAAXXMAMXXAAMMXSAXXMMSMMAMXMMSMSMAM\n" +
                "SSSXSMSXMASMXMASMXMASAXSSSMSSXMASXXSASAMXMASMMAASMSSSXSAAMSXSAMSAMMSMSMMSXSAMAMASMSXSXMSAMAMMMSAMXAAAAASMSMSXXAMXAMSMSAAMXMAXXAMMMMAMXXAMMAX\n" +
                "SASAAAXSMASAXSAMAASXXXMXAAAAMMSSMMMMASAXAMAMAMMMMAAMMAMASXMAMXMMAXXXAXAAMMSXSXSAXMXAXAASASASAAMAMMSSSMMMAXMMMXSAMXXXAMMSSSMSSSMMAAXAXAMAMSMS\n" +
                "SAMSMMMXMAMMXMASXMMXSSSMSMMMSAXAAAAMMMMMSMASAMASMMMSSXMXXXMAMAMXSMSMMMMMSAMMMMMXSMMSMMMSXMASMXMAMXAAAXXMMMSAAAXMAMMMSMXMAMAMXAXSSSSXSASXMAAX\n" +
                "MAMXXXXAMMSSMSAMAXASAMXAXMXXMASMSMSSMASXXXXXAXASAXSAAASXMXSMSMSAAAXAAAAXMXMAAAXAAXAAAXAMAMXMMMMAMXMSMMSASASMSSXMMASAMMAMXSSMSAMAAAAASXMASMSM\n" +
                "SSMSSSSXSMAAXMMSAMXMSXMSMMSMMAAAMAMXMAMMSMMSSMASXMMMMMMASMSAAAMMSXSXMSSSXAXSXSSSMSXXSMSSMMXSAMXSMAXAXXXAMXMMAMASAMMASMXXAMAMSASMMMMMMASAMMMA\n" +
                "AAAAAAAAMMMSASXMMSXAXMMMAASAMXSMMASMMXSAAAMAXMAMXXMAXASMMAMMMSMAMMMAXAMAXMMMAMXMASXMMAXAXAAMMSAXMASXSSMXMSXMASAMAXMXMAXMAXAMSXMAXXMXSXMMXXXX\n" +
                "SMMMMMMSMXMXASAMAMMSMAXSMMSAMAMXSASASMSXSSMASMAMMMSMMAMASXMSXXMAMASMMMXMMMAMAMAMAMAXSXSXMMMSAMMSXAXMAXAAMMAMAMASXMSASMSSMSXXXMXMMMSAMXMSMSMM\n" +
                "MMMMXXXMAMAMAMXMASXXSSMAMMSAMXSAMASXXAMAMXMAMMASAXAMXSSMMAMXMXMASXMMASAMAXAMSSMMASXMMMSASXAMASASMSMMSMSSSSSMASAMAXMASXMAMAMSAMSAMXMAXAMAMAAS\n" +
                "XMASXMMMSMAMSMXSXSAMAMXMSAMXSXMAMXMXMSMMMAMSMMXMMMASAAAXSXMAMAMXSAASASAMSSMMMAASAMXAAMXAMMMSAMMMAMXAAAXAAAAXXMAMMMMMMMMAMAXSAMXMASXSMMSASXSM\n" +
                "MMASAAAAAMAMAMMAMMMMMMMXMMSAMXMMSAAMAAAASXMXASMSXSAMMSMMMMSXSAMMMXMMAXAMMAXAMXMMAMSSMSMSMMXSXMXMAMSXMSMMMMMMSSSMMXSAASMMSMXSXMASXSAMXXAAXMAM\n" +
                "XMXMMMMXSMMSSXMAAAXSXMMAAXMASMAASMSASXXMMMXSSMAAMAXAXAXAXMAMMASMSAMXSSSXSAMSSMXSAMAMMSAMASAXMMAMAXMSMXMXSAMXXAXXMASXMMAAAXASMSAMMMMMMMMSMMSS\n" +
                "XXMMSMSAMAMXMASXSMMSAMSSSSSMMMMXXXMMAMXMSMAMAMXMMMSXXSMXMASXSXSMSASAAXMAMMMXAXASAMXSASASAMMSASXSXSMAMAMAMAMSMSMSMASMSSXMMMASAMXMAXMASAAMAXAS\n" +
                "MMXAAAMASXMSSMMAXMASAMAAXAASXMSMMMSSXSAAAMSSXMAMAXMAXMXSXXXAAAXASAMMXAMMMAMSAMXSXMSMAMAMXXAMXXXMASXMSASASAMAAAAAMMSMASAAXMAMMMSSSMSASMXSAMMS\n" +
                "AAMSSMMMMMXXAMXXMMMMAMMSMSAMXSAAASMSASMMMXAAMSMXMAMXAMAMXMMMMMMMMAXMXMAMSAMMSMAMAXAMXMSMMMSSMSXMXMAXMXMASMSMSMMMSAXMASMMXMAMXMAAMXMASAAMXXXS\n" +
                "MXMMAMXXMASMSMMAAASXMMXXAMAMXSMSMSAMMMXMMMMXXAAASXSMSMAMAMAMAMXXSMMSAMMASMSAASMXSAMXMAXAAAMAMXAMASAMXXMASAAAAAASMXSMMSASXSASAMMSMMXAMMMSMMAS\n" +
                "XMASMMAMXAXXMAXXSMXAXSMSMSASAMXAAMAMXXMASXMMXMMMXAXAAXMMAXSXSSSMSXASAXAMXAMAMAXAXMMAMMSXMSSXMSXMASASAMXAMXMSMSMSAMXAAXASASASXSAXAXMMSAMXXXAX\n" +
                "SXMXXXXAAMSMSSMMMASXMSAAASAMASXMMMAMXXMMAAAAMSSSMAMSMSMSMSMAMAMASMMSAMSXMXMMMXMASXSXSAAASAXAXMASMSAMAXMASXMAMXMMMMXXSMAMAMASMMMSMMSMAMSMMMSS\n" +
                "SAMXSMSMASXAAMASMAMXAMMMMMAMMMMAASMMMSXXMAMXSAAAXSMXXXAAXAMXMAMMMAXMAMXASXMXSXAAAAXAMASXMAMMMSAMMSXMAMMSMMSMSMMAAAMMMAMXXMAMAAAAXAAXMXSAMAAX\n" +
                "SAMAXAASXAMXMXXMMSMMXMAXAMAMXAMMMSAAAXAMSMXSMMSMMAAXSSSSXMMMXMMXSSMSSMSXMASXMASMMSMSMMMXMAMMAMXSMSMMXSXAXAAXXASMMSAAXSMXXMXSSMSSMSSSMAMAMSSM\n" +
                "SAMXMSMSXMSSSMMSAMXSSSSSSSMXMMXSXSXMMSXMASMMMMMAXMMMMAAMXSAMAXAXXXXAXXSASMMAXAXAAXXXAMSAMASMASAXAMMSASXMMSSSSXMXMAXMSAMXSAMXAAXXAAXXMASXMAXX\n" +
                "SXSAAMAMXXAAAAAMASMMAAXAMXXAASASXSASAXAMXXMASASAMXAAMMMMASASASMMMMMMMASAMXMXMASMMMMSMMMAMAAXAMMMMMAMMMAXAAMAMAXMAXSMSASMMASXSMMMXAMXSASAMAMX\n" +
                "XASMSMAMSMMSMMMSAMAMSMMSMASXSMASASAMMASMXMSAMMSAMSSSSSSMXSAMXMAAAXAASAMAMXXAMXXAAMXSXAMAMXSMMSXSXMXSAXAMMXXAMXSAMXSASASASAMAMXMAXMMMMAXAMSSS\n" +
                "MMMXAMAMAAXXAXXMXSXMXAAXMASMAMSMMMAMMAXXXXMASXSMMXAXAAMSAMXSASMSMXSAMXMAMSMXSXSSMSAMXMXXMMAXMAXMASMSXSSXSSSSXMAXASMAMAMMMAXAMSMXMAAAMMMSMMAM\n" +
                "XAASXMMXSSMSSMSMMXXMSMMSMAXMAMXAXXXMMSMMMMMXMAXAXMMMMMMMXSAMMSAAAXXMMSXMASXXAAXAAMASMMXSAMMMXSXSAMAXAXAAMXAMXAXMMAMXMMMXSAMMMSAASXSMSAAXASMS\n" +
                "XXXSMASAMAAAXMAAMXXXAMXSMMSSMSSMMSSMAMAXMASMSXSXMMXXXSAMAMXSSMMMMMXMASAMAMMMMSMMMSXMAAASAMXSAXAMXSSMMMMAMMMMMSMSASXMXXXAMASXAMMMSAAASMMSAMAS\n" +
                "SMMMMAMASMMMSXSMMAMSASAXMAMAAAXAAAXMAMXMAMSAAXSAMMAMXXAXSAMXXAAMMSMMASXMMXAAAAAXAMASMMMSXMXMASXMASAMAAXSSXSAAAASAMXAMMMXSAMMAMAAMXMMMMXMAMSM\n" +
                "XMAXMXSAMMSAMXAMMSXSAMASMXSMMXSMMSSMSMSAXXMMMMSAMAAXMSMMXAAXMSMSAAASXSXSSXSMSSSMMSAMAMAMMAMMMMXMXXAXSSSMAASMSSMMAMXMASMMMASMAXMSSXSAAXXSSMMM\n" +
                "XSMSAMMMMAMASAMXAXMXAMXXAAXAMAXXAMAAAAXMSXSASASAMXSSMAAMSMMXMAXMMSMMAXMAMAAAAAAAAMMSAMAXMAMXMMMSMSSMMXMMMMMMMMMXMASMSAMASAXXMSSMMMSSMXAXAASM\n" +
                "XAAMXXAAMMSMXMSMMSXSASAXXXMAMASMMSMMMSMAAAXAMASMMXMAMSSMSAASXMMAXMMMAMXSMMMMMSMMMMXSASMMSAXASAAMMAAAMAMXAAXAMAAASMMMXASMSAMSMMMAAAMAMSSSXMMS\n" +
                "MMXMMSSMMXAMAXXXXAMSAMMMSSSSXMXAXXXXMMXMMSMAMAMAMMSAMXAASXMMAMSMSMASAMAXAMXXMXASXMXSMMAASASAMMSSMMMMMSXMXMSMSMSXXAAXXAMXMAMXAASMMSMAMSASXMAM\n" +
                "ASXMXXMASMMSXSMSMSXMMMMAMMAXXXSAMMSXMMAXAXMXSMMXXAMAXSMMMAMSMMAAXMASAMXSAMMSMSXMAMMXAMMMMAAASXMXAMMSAXASMMAAMAMMSSMSSXSAMMMSMMSAMXMMMMAMSMXS\n" +
                "SMAXMXMAMAAXAXAAAMMSAMSSSMAMXXMASAAASXMMMSMAMAMMMXSSMMXMMMAAMSMSMMXSAMAMXMAAMMMSMMASAMXXMSMMMAAMMMAMASAMASXXMAMMAAMAAXSMSMAMXAXAXXXXAMAMAMMM\n" +
                "MSMMSSMASMMMMMSMSMAXAMAAMMAXAMSXMMXXMAAAAAMASAMAXMAMAMASAMSMXAMAAXMSAMMSAMSMSAAAAXXXAMMXMAMXSMMMSMMSASASXMMMSASMSXMXSMSMAMASMASMMSXXASXSASAS\n" +
                "XAXXXAXASXMXSAAXXXMSSMMSMSXSXMAMMXMSMSMMXMXASASXSAMSXMASAMAXSASMSMASAAMMMAXASMSMSMMMSSSSSXSAAXMXAAXMASAMMMAXXAMXAASXXASMSSMMXMXXAAMSMMASAMAS\n" +
                "SSMMSMMXMAXAMSXMMMXAMAXAAXAAMAAMSAMXAMXSASMXSAMAXMXSAMAMXAMMXMMAMXMSMMXMXMMAMXAMMAXXXAXAAASAMXXSXSMMXMMMASMSXMMMSMMAMSMAMMMXXXAMMMXASMMMSMAM\n" +
                "MAAAMXMAXMMMMMSMAAMMSSMMMMMMAMMMXASMAMAMAXXXMAMMMSAMAMAMAMXXMSMAMAXXXAAXAAXMXMMXXAMSMAMXMMMSXMXAAXXMAXAMXXAAAASAXAMXMAMXMAAXMMSSMMSASXMAXXAS\n" +
                "MSMMSASMXMAMAAAMSSXMAMXAAAXAMMSMXAMMXMMMSMMMMAMAAMASXMXXSXSXAAMMSMMMSMMXSSMSAASMMAMMAAAMXMXXMSMMXMASASXSMMSMMMMASMMAMMXSMMMAXAAAAMMAMAMXMSAS\n" +
                "XMAMSASXASASMSMMAMXMASXSSSSSSMAAMSSMMMSAMAMMXAXXMXMMMMMMAAMMSMSMAMMMSAXXAAAAMMAASMMXMASASXMMAXXAASXMMMMAMAAAAXMAMAMAMXXAAASMSMSSMMMMSSMSMMMX\n" +
                "MMAMMMMXMSASAXXMASMMMSAAAAXAAXMMMAAMXXMAMSASXSSSSXSAAAXMMMMMAAAMAMAASAMASMMSXMSAMAMXMAMXXAAMSMAMXMMMXSSSMSXSMSMMSSSMSSMMSMAAXMAMMMXMMMAAXAXA\n" +
                "MSSMMAAAMMMMAMASAMAAAMMMMMMSMMXSMMSMMMSAMXMXAAAAAASXSAXAAAAXMSMXSMMMSAMMAAAXXXMASXMXMAXAMMMMAAASAAXSAXMAXXAXXMAXAAAMAXAXAXMMMMASXMAAAMXMSMSM\n" +
                "MAXASMSXSAMSASMMASMMMSAXXXXMASMXMMMMAAASAXXSMMMMMMMXMXSXSSSSMXMXXASAMASXSMMMAXAAMXMAMXSSMMSSXMXSMSMMXSMMMMMMASMMMSMMXMSSMXXMAXXSAXSMMXSXXXAM\n" +
                "MASXMAXXSAMSASXSASXMASXXXMAMSMMASAMXMAXMXSASASXMXSMMMMSXAMAMXAMMMAMASXMAMSAMXMMMSASAMXAAAAMAMSMMMMAMXMAAMASMXMXAMMXSAAXAXSSSXSAMMMXAMXSMMXXX\n" +
                "MAMAMMMAMSMMAMAMXSAMASMSSMSMXASAXAXSXSXSAMASAMMSAAAXXAMMMMSXXSMAMMMXMAXAMAMXMXAAMXXAMMXMMMSMSAAAMXAMMSSMMASMAMSMSMASMSMAMXAAMMMSXAXAMAXAXSSS\n" +
                "MASMMAMXAMMMSMXMXSAMXSAMMAAAMAMMXSMMXMAMXMAMAMAMSSMMMSSMMAXMAMSSSXMXSSMXSASAMSMSSMMSXSXMMXSXSMSMSSMSXMASMASMMMAMAMXMXXMAMMMMSAAXMSXMMSSSMAAX\n" +
                "SMAASXSMMXAMMXAMXSXMXMAMMSMXMXMXAMAMMMAMSMAMMMMXAMAAAMAAMXMAXXAXAMMAMAAMAAMMAAAXMAAMASMXSAMMSAMAXXXMASAMMXMAMSXMASXSMXSAXXAXMMMSAAASAAAXMMMM\n" +
                "XMXMAAXXMASMSSMSAMSXMSAMXMASMMXMASAMXXAMMXXMAAXMASXMSMXMMASXMMSMMAMAMMMMMXMXSMSMMSXMAMAAMAMAMMMMMMAMXMMSMASAMMMMAMAXAXSXSSSSMASAMMXMASAMXXXX\n" +
                "XMMXMXMMSAXMXAXXMSMXAXMSXMSMMAXMASXMAMXXSASXSMXSAMASMMSAMAXAAAMASMSSSXSXXAAMXMAXAAAXMMMMSXMXSAAASMMSASMMMASASASMSMMMSAMXXXAAMXMAMMAAAXMSMSMM\n" +
                "XMAMSXSAMMSSMMMSMAMMSMAMAMAAXSXMASMMAMXAMMSAAAAMASMMAASAMSSSMMSAMAAAAASASAXSASXMSSSMSAXXMMSMMMXSAAXMASAMMMMAMAMAXMASMAMAMMSMMMSAMXAMXMAAAAAA\n" +
                "XMASAXMASAAXAAAASASAAMAMASMSMMAMASAMASMAMXMMMMMSAMXMMMSXMAAAMAMAMMMMMMMAMAMSASMMAAAASMSAMAAAAASAMXMASMMMAXMSMSMMMXMASAAAMXAMXAMMSAMXSMSMSMSX\n" +
                "SSMSAXSMMMSSSMSMSMSXSSMSASMMMSMMMSXMAXXAMMSAMXXMMSXXSAMXMMSMMASMMSAMXXMMMXMMAMMMMSMMMXSAMSSSMSSSXAASXXXSXSAXAMXSSXMASXSMMSASMXSASXMASMXXMAMA";
    }
}
