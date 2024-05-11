package Chapter_1;

import java.util.ArrayList;

public class One_Away {
    public static void main(String[] args){
        String s1 = "pales";
        String s2 = "pale";
        boolean res = true;
        if(s1.length() == s2.length()){
            res = replace(s1,s2);
        }
        else if(Math.abs(s1.length() - s2.length()) >= 2) {
            res = false;
        }
        else{
            res = insert_remove(s1,s2);
        }
;
        System.out.println(res);

    }

    private static boolean replace(String s1, String s2){
        ArrayList<Character> arr = new ArrayList<>();

        for(int i = 0; i < s1.length(); i++){
            arr.add(s1.charAt(i));
        }
        for(int i = 0; i < s2.length(); i++){
            if(arr.contains(s2.charAt(i))){
                arr.remove(Character.valueOf(s2.charAt(i)));
            }
        }

        if(arr.size() >= 1){
            return false;
        }
        return true;
    }

    private static boolean insert_remove(String s1, String s2){
        ArrayList<Character> arr = new ArrayList<>();

        if(s1.length() > s2.length()){
            for(int i = 0 ; i < s1.length(); i++){
                arr.add(s1.charAt(i));
            }

            for(int i = 0; i < s2.length(); i++){
                arr.remove(Character.valueOf(s2.charAt(i)));
            }
        }
        else{
            for(int i = 0 ; i < s2.length(); i++){
                arr.add(s2.charAt(i));
            }

            for(int i = 0; i < s1.length(); i++){
                arr.remove(Character.valueOf(s1.charAt(i)));
            }

        }

        if(arr.size() != 1){
            return false;
        }
        return true;
    }
}
