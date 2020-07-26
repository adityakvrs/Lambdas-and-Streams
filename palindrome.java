package com.epam.palindrome;
import java.util.stream.IntStream;
import java.util.List;
import java.util.ArrayList;
/**
 * To find Strings which are palindrome
 * 
 *
 */
public class Check_Palindrome_String {
 /**
 * @param stringlist
 * @return palindromelist
 *
 */
    
    public static List isPalindrome(ArrayList<String> stringslist) {
        ArrayList<String> palindromelist=new ArrayList<String>();
        for(int i=0;i<stringslist.size();i++)
        {
            String tempString=stringslist.get(i);
            if(IntStream.range(0, tempString.length() / 2)
                .noneMatch(k -> tempString.charAt(k) != tempString.charAt(tempString.length() - k - 1)))
                {
                    palindromelist.add(tempString);
                }
        }
        return palindromelist;
    }

    
    
    public static void main(String[] args) 
    { 
        ArrayList<String> listofstrings=new ArrayList<String>();  
        listofstrings.add("audi");
        listofstrings.add("online");
        listofstrings.add("madam");
        listofstrings.add("racecar");
        listofstrings.add("radar");
        List palindromeStrings=isPalindrome(listofstrings);
        System.out.println(palindromeStrings);
    }
}
 
