package review;

public class ExampleMethod {

   public static void main(String[] args){
       //how to use/call this method

       int[] res = make2DArray(2);
       int[] arr1 = {1,2,3,4,5};
       System.out.println(lengthOfArray(arr1));


   }
   //goal: sum of two integer and return the result
    public static int sumOfIntegers(int num1, int num2){
       //14-15 method body
       int sum = num1 + num2;
       return sum;
    }
    //goals:  two ragged array
    public static int[] make2DArray(int nRows){

       int[] res = new int[nRows+1];
       for(int i = 0; i < res.length; i++){
           res[i] = 0;
       }
       return res;
    }

    //goals: you have a array and find and print the length of the array. {1,2,3,4,5} => 5
    public static int lengthOfArray(int[] a) {
        return a.length; //int
    }

    //goals:  write a method to reverse the contents of an array of ints b = {1,2,3,4,5} => reverseB = {5,4,3,2,1}
    public static int[] reverse(int[] b){
       int[] reverseB = new int[b.length];
       int j = b.length-1; // j = 4

       for(int i = 0; i < b.length; i++){
           reverseB[i] = b[j];
           j-=1;
       }
       return  reverseB;

    }



}
