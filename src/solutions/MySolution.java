package solutions;

import java.util.Arrays;

public class MySolution implements Solution {
    @Override
    public String reverseString(String word) {
        int i, len = word.length();
        StringBuilder result = new StringBuilder();
        for (i = (len -1); i >= 0; i--) {
            result.append(word.charAt(i));
        }
        return result.toString();
    }

    @Override
    public long factorialize(int number) {
        long result = 1;
        if (number == 0) {
            return result;
        } else {
            for (int i = 0; i < number; i++) {
                result *= (i + 1);
            }
        }
        return result;
    }

    @Override
    public boolean palindrome(String word) {
        String strippedWord = "";
        String baseWord = word.toLowerCase();

        for (int i = 0; i < baseWord.length(); i++) {
            Character letter = baseWord.charAt(i);
            if (Character.isDigit(letter) || Character.isAlphabetic(letter)) {
                strippedWord += letter;
            }
        }

        String reverse = "";
        for (int i = strippedWord.length() - 1; i >= 0; i--) {
            reverse += strippedWord.charAt(i);
        }
        return strippedWord.equals(reverse);
    }

    @Override
    public int findLongestWord(String word) {
        String[] split = word.split(" ");
        int result = 0;
        for (int i = 0; i < split.length; i++) {
            if (split[i].length() > result) {
                result = split[i].length();
            }
        }
        return result;
    }

    @Override
    public String titleCase(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if (i == 0) {
                result += Character.toUpperCase(word.charAt(i));
            } else if (word.charAt(i) == ' ') {
                result += " " + Character.toUpperCase(word.charAt(i + 1));
                i++;
            } else {
                result += Character.toLowerCase(word.charAt(i));
            }
        }
        return result;
    }

    @Override
    public int[] largestOfFour(int[][] numbers) {
        int[] result = new int[4];
        int maxNum= 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] > maxNum) {
                    maxNum = numbers[i][j];
                    result[i] = numbers[i][j];
                }
            }
            maxNum = 0;
        }
        return result;
    }

    @Override
    public boolean confirmEnding(String word, String end) {
        int suffixLength = end.length();
        int startSub = word.length() - suffixLength;

        return suffixLength <= word.length() &&
                word.substring(startSub, word.length()).equals(end);
    }

    @Override
    public String repeatStringNumTimes(String word, int counter) {
        String result = "";
        if (counter <= 0) {
            return result;
        } else {
            for (int i = 0; i < counter; i++) {
                result += word;
            }
        }
        return result;
    }

    @Override
    public String truncateString(String word, int counter) {
        return null;
    }

    @Override
    public Object[][] chunkArrayInGroups(Object[] numbers, int counter) {
        return new Object[0][];
    }

    @Override
    public Object[] slasher(Object[] numbers, int counter) {
        if (numbers.length < counter) {
            return new Object[0];
        }
        Object[] result = new Object[numbers.length - counter];
        for (int i = 0; i < numbers.length; i++) {
            if (i >= counter - 1) {
                result[i] = numbers[i];
            }
        }
        return result;
        //Not working yet, but the solution is not that far, anymore.
    }

    @Override
    public Object[] destroyer(Object[] numbers, Object... remove) {
        return new Object[0];
    }

    @Override
    public int getIndexToIns(Object[] numbers, float number) {
        int result = 0;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (number > (Integer)numbers[i]) {
                result = i + 1;
            }
        }
        return result;
    }

    @Override
    public String rot13(String word) {
        return null;
    }
}