package ua.alevel.lesson3HWTask1;

//Created by Lev Sehal 08.03.2021
/**
 * Remove spaces from the string and check if it is a palindrome?
 */
public class lesson3HomeWorkTask1 {
    static boolean checkForPalindrome(String palindrome) {
        String withoutSpaces = palindrome.replace(" ", "").toLowerCase();
        System.out.println(withoutSpaces);
        for (int i = 0; i < withoutSpaces.length() / 2; i++)
            if(withoutSpaces.charAt(i) != withoutSpaces.charAt(withoutSpaces.length()-i-1))
            {
                System.out.println("no");
                return(false);
            } else {
                System.out.println("yes");
            }
        return(true);
    }
    static public void main(String args[])
    {
        checkForPalindrome("Lev is the Best student");
        checkForPalindrome("W o W");
    }
}
