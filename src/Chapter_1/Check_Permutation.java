package Chapter_1;

import java.util.Arrays;
import java.util.HashMap;

public class Check_Permutation {

    public static void main(String[] args){
        String a = "abc";
        String b = "bac";

        boolean res = permutation2(a, b);
        System.out.println(res);
    }
    // Approach 1: count the character flequency
    private static boolean permutation(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < a.length(); i++){
            map.put(a.charAt(i),map.getOrDefault(a.charAt(i),0)+ 1);
        }

        for(int i = 0; i < b.length(); i++){
            if(!map.containsKey(b.charAt(i))){
                return false;
            }
            else{
                map.put(b.charAt(i),map.get(b.charAt(i)) - 1);
            }
        }
        for(int count : map.values()){
            if(count > 0){
                return false;
            }
        }
        return true;
    }

    //Approach 2
    private static boolean permutation2(String a, String b){
        char letter[] = a.toCharArray();
        Arrays.sort(letter);

        char letter1[] = b.toCharArray();
        Arrays.sort(letter1);
        String c = new String(letter);
        String d = new String(letter1);

        return c.equals(d);
    }


}
