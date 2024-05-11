package Chapter_1;

public class String_Rotation {

    public static void main(String[] args){
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        boolean res = check_rotation(s1+s1, s2);

        System.out.println(res);
    }

    private static boolean check_rotation(String s1, String s2){

        System.out.println(s1);
        if(s1.length() != 2 * s2.length() || s1.length() == 0){
            return false;
        }
        return s1.contains(s2);
    }
}
