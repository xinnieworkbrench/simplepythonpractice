package Chapter_1;

public class URLify {

    public static void main(String[] args){
        String input = "Mr John Smith    ";
        int index = 13;

        String res = url(input, index);
        System.out.println(res);
    }

    public static String url(String input, int index){
        String res = input.substring(0,index);

        System.out.println(res);

        res = res.replace(" ", "%20");

        return res;
    }

}
