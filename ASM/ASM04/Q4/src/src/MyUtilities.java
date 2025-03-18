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
        // A.B.C with A is 03 uppercase letters, B is 06 digits, C in [@#$]
        String regex = "^[A-Z]{3}\\.\\d{6}\\.[@#\\$]$";
        // GHF.123456.#
        if(value.matches(regex)){
            String B = value.substring(4, 10);
            return Integer.parseInt(B);
        }else{
            return value.length();
        }
    }

    @Override
    public double sumNumbers(String value) {
        //abc12 def8.5 kdje
        //   12    8.5     
        
        // Xin chao cac ban. Day la nam 2026.
        // Buoc 1
        String temp = "";
        for (int i = 0; i < value.length(); i++) {
            char x = value.charAt(i);
            if(Character.isDigit(x)){
                temp+=(x);
            }else if(x=='.'){
                if(i>0 && Character.isDigit(value.charAt(i-1))){
                    temp+=(x);
                }
            }else{
                temp+=(" ");
            }
        }
        System.out.println(temp);
        // Buoc 2
        double sum = 0;
        String[] words = temp.split(" ");
        for (String word : words) {
            if(word.length()>0){
                sum+=Double.parseDouble(word);
            }
        }
        return sum;
    }

    @Override
    public int countPalindromeWords(String str) {
        return 0; // 121 abc aba => 2
    }

    @Override
    public int findFirstOddNumber(String str) { // Tìm số lẻ đầu tiên: 10 20 32 abc 15 65 11 20 => 15
        String[] words = str.split(" ");
        for (String word : words) {
            if(word.length()>0){
                try {
                    int num = Integer.parseInt(word);
                    if(num%2==1){
                        return num;
                    }
                } catch (Exception e) {
                }
            }
        }
        return -1;
    }

    @Override
    public int sumAllCharsOfInt(int value) {
        // 987654 => 39
        // -987654 => 39
        
        value = Math.abs(value);
        String s = value+"";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum+=Integer.parseInt(s.charAt(i)+"");
        }
        return sum;
    }

    
    public static void main(String[] args) {
        //10 20 32 abc 15 65 11 20
        MyUtilities m = new MyUtilities();
        System.out.println(m.findFirstOddNumber("10 20 32 abc 15 65 11 20"));
        System.out.println(m.sumAllCharsOfInt(-987654));
    }
}
