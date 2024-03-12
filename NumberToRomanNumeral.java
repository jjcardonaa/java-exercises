package com.nextiva.accounts.receivable.orchestration.controller;

import java.util.Map;

/**
 * convert an int value to roman numeral
 * 1 -> I
 * 2 -> II
 * 3 -> III
 * 4 -> IV
 * 5 -> V
 *
 * constrains ->  1 <= input <= 3000
 */
public class NumberToRomanNumeral {

    private static final Map<Integer, String>  map;
    private static int ONE = 1;
    private static int FOUR = 4;
    private static int FIVE = 5;
    private static int NINE = 9;
    private static int TEN = 10;
    private static int FORTY = 40;
    private static int FIFTY = 50;
    private static int NINETY = 90;
    private static int HUNDRED = 100;
    private static int FOUR_HUNDRED = 400;
    private static int FIVE_HUNDRED = 500;
    private static int NINE_HUNDRED = 900;
    private static int THOUSAND = 1000;

    static {
        map = Map.ofEntries(
                Map.entry(ONE, "I"),
                Map.entry(FOUR, "IV"),
                Map.entry(FIVE, "V"),
                Map.entry(NINE, "IX"),
                Map.entry(TEN, "X"),
                Map.entry(FORTY, "XL"),
                Map.entry(FIFTY, "L"),
                Map.entry(NINETY, "XC"),
                Map.entry(HUNDRED, "C"),
                Map.entry(FOUR_HUNDRED, "CD"),
                Map.entry(FIVE_HUNDRED, "D"),
                Map.entry(NINE_HUNDRED, "CM"),
                Map.entry(THOUSAND, "M")
        );
    }

    public static void main(String[] args) {
        String romanNumeralValue2 = getRomanNumeral(2999);
        System.out.println(romanNumeralValue2);
    }


    private static String getRomanNumeral(int value) {
        if (value >= THOUSAND) {
            return map.get(THOUSAND).concat(getRomanNumeral(value - THOUSAND));
        }

        if (value >= NINE_HUNDRED) {
            return map.get(NINE_HUNDRED).concat(getRomanNumeral(value - NINE_HUNDRED));
        }
        if (value >= FIVE_HUNDRED) {
            return map.get(FIVE_HUNDRED).concat(getRomanNumeral(value - FIVE_HUNDRED));
        }

        if (value >= FOUR_HUNDRED) {
            return map.get(FOUR_HUNDRED).concat(getRomanNumeral(value - FOUR_HUNDRED));
        }

        if (value >= HUNDRED) {
            return map.get(HUNDRED).concat(getRomanNumeral(value - HUNDRED));
        }

        if (value >= NINETY) {
            return map.get(NINETY).concat(getRomanNumeral(value - NINETY));
        }

        if (value >= FIFTY) {
            return map.get(FIFTY).concat(getRomanNumeral(value - FIFTY));
        }

        if (value >= FORTY) {
            return map.get(FORTY).concat(getRomanNumeral(value - FORTY));
        }

        if (value >= TEN) {
            return map.get(TEN).concat(getRomanNumeral(value - TEN));
        }

        if (value >= NINE) {
            return map.get(NINE).concat(getRomanNumeral(value - NINE));
        }
        if (value >= FIVE) {
            return map.get(FIVE).concat(getRomanNumeral(value - FIVE));
        }
        if (value >= FOUR) {
            return map.get(FOUR).concat(getRomanNumeral(value - FOUR));
        }
        if (value >= ONE) {
            return map.get(ONE).concat(getRomanNumeral(value - ONE));
        }

        return "";
    }

}