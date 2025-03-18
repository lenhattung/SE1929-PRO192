/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public interface IUtilities {

    public int checkIntegerNumber(String value, int min, int max);

    public String removeDuplicatedWords(String value);

    public int checkFormatString(String value);

    public double sumNumbers(String value);

    public int countPalindromeWords(String str); // Đếm những word đối xứng: 121 abc aba => 2

    public int findFirstOddNumber(String str); // Tìm số lẻ đầu tiên: 10 20 32 15 65 11 20 => 15

    public int sumAllCharsOfInt(int value); // 123456 => 21
}
