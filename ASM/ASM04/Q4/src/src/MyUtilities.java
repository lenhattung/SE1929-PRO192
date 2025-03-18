/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class MyUtilities implements IUtilities{

    @Override
    public int checkIntegerNumber(String value, int min, int max) {
        int result = value.length();
        if(value.length()>=2 && value.length()<=10){
            try {
                result = Integer.parseInt(value);
                result = (result>=min && result<=max)?result:value.length();
            } catch (Exception e) {
            }
        }
        return result;
    }

    @Override
    public String removeDuplicatedWords(String value) {
        return "";
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
