/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class MyUtilities implements IUtilities {

    @Override
    public int checkIntegerNumber(String value, int min, int max) {
        int result = value.length();
        if (value.length() >= 2 && value.length() <= 10) {
            try {
                result = Integer.parseInt(value);
                result = (result >= min && result <= max) ? result : value.length();
            } catch (Exception e) {
            }
        }
        return result;
    }

    public String toTitleCase(String s) {
        String[] words = s.split(" ");
        String result = "";
        for (String word : words) {
            if (!word.trim().isEmpty()) {
                String temp = word.substring(0, 1).toUpperCase()
                        + word.substring(1).toLowerCase();
                result += (temp + " ");
            }
        }
        return result.trim();
    }

    @Override
    public String removeDuplicatedWords(String value) {
        value = toTitleCase(value);
        String[] words = value.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])){
                    words[j]="";
                }
            }
        }
        
        String temp = "";
        for (String word : words) {
            if(word.length()>0){
                temp+=(word+" ");
            }
        }
        
        return toTitleCase(temp);
    }

    @Override
    public int checkFormatString(String value) {
        return 0;
    }

    @Override
    public double sumNumbers(String value) {
        return 0;
    }

    @Override
    public int countPalindromeWords(String str) {
        return 0;
    }

    @Override
    public int findFirstOddNumber(String str) {
        return 0;
    }

    @Override
    public int sumAllCharsOfInt(int value) {
        return 0;
    }

}
