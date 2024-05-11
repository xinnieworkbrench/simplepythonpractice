package Chapter_1;

import java.util.HashMap;

public class Palindrome_Permutation {

    public static void main(String[] args){
        String input = "Tact Coa";

        boolean res = palidrome_check(input);
        System.out.println(res);
    }

    private static boolean palidrome_check(String input){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < input.length(); i++){
            if(Character.isLetter(input.charAt(i))){
                char c = Character.toLowerCase(input.charAt(i));
                sb.append(c);
            }
        }
        int length = sb.length();

        System.out.println(sb);
        if(length % 2 == 0){
            int[] mark = new int[128];
            for(int i = 0; i < length; i++){
                mark[sb.charAt(i)] +=1;
            }
            for(int i = 0; i < length; i++){
                if(mark[sb.charAt(i)] != 0 && mark[sb.charAt(i)] != 2){

                    return false;
                }
            }
        }
        else{
            //System.out.println("!23");
            HashMap<Character, Integer> map = new HashMap<>();
            for(int i = 0; i < length; i++){
                map.put(sb.charAt(i), map.getOrDefault(sb.charAt(i),0) + 1);
            }
            System.out.println(map.get('t'));

            for(char x : map.keySet()){
                //System.out.println(t);
                if(map.get(x) == 1){
                    map.remove(x);
                    break;
                }
            }
            for(int t: map.values()){
                if(t != 2){
                    return false;
                }
            }
        }

        return true;

    }
}
