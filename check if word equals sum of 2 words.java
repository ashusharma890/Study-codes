

class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int firstValue = 0;
        int secondValue = 0;
        int targetValue = 0;
        int num;

        for (int i = 0; i < firstWord.length(); i++) {
            num = firstWord.charAt(i) - 'a';
            firstValue = 10 * firstValue + num;
        }

        for (int i = 0; i < secondWord.length(); i++) {
            num = secondWord.charAt(i) - 'a';
            secondValue = 10 * secondValue + num;
        }

        for (int i = 0; i < targetWord.length(); i++) {
            num = targetWord.charAt(i) - 'a';
            targetValue = 10 * targetValue + num;
        }
        return (firstValue + secondValue) == targetValue;
    }
}


