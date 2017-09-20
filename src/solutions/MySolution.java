package solutions;

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
                System.out.println(result);
            }
        }
        return result;
    }

    @Override
    public boolean palindrome(String word) {
        return false;
    }

    @Override
    public int findLongestWord(String word) {
        return 0;
    }

    @Override
    public String titleCase(String word) {
        return null;
    }

    @Override
    public int[] largestOfFour(int[][] numbers) {
        return new int[0];
    }

    @Override
    public boolean confirmEnding(String word, String end) {
        return false;
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
        return new Object[0];
    }

    @Override
    public Object[] destroyer(Object[] numbers, Object... remove) {
        return new Object[0];
    }

    @Override
    public int getIndexToIns(Object[] numbers, float number) {
        return 0;
    }

    @Override
    public String rot13(String word) {
        return null;
    }
}