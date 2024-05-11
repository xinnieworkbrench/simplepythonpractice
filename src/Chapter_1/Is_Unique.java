package Chapter_1;

import java.util.HashSet;

/*
*  Implement an algorithm to determine if a string has all unique characters.
*  What if you cannot use additional data structure.
*
*
*  */

public class Is_Unique {

    public static void main(String[] args) {
        String test_String = "abcdeg";
        boolean res = isUniqueChars(test_String);
        System.out.println(res);

    }

    private static boolean Check(String s){
        // Use hashset
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                return false;
            }
            else{
                set.add(s.charAt(i));
            }
        }

        return true;

    }
    // Time Complexity for this code is O(n)
    private static boolean isUniqueChars(String s){
        int[] mark = new int[128];
        for(int i = 0; i < s.length(); i++) {
            if (mark[s.charAt(i)] == 1) {
                return false;
            }
            mark[s.charAt(i)] = 1;
        }
        return true;
    }
}
