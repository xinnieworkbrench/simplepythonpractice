package test1;

public class Student {

    //field/ attuibate
    private int studentID;
    private String name;
    private String major;

    //Constructor

    //step1:  definition of constuctor
    //step2: public className (parms ...){}

    public Student(int studentID, String name, String major){
        this.studentID = studentID;
        this.name = name;
        this.major = major;
    }

    //method/funcation: method is to seperate functionality to solve the problem.

    //step1 definition of method.
    //public + (String/int/double/boolean) + name(){return; }
    public String getName(){
         return name;
    }

    // short answer:
    //default constutor
    // static vs non-static method: static can directly call, non-static should create the instance first,and call
    // method signature vs method body:
    // Array: the array is a group of similar elements - egg example
    // toString(): since the object cannot be print, if we want to print the object, we need to override the toString() method from the parent class, and then yuu should be able to see the print.
    // iteration and recursion: iteration -> loop, recursion - no loop. but call itself/
    // Sort: 排序
    // equals vs ==: equals compare actual value however == compare the reference.
    // main(), to run the appliation
    // how to compile the java: javac file.name java file.name
    // private vs public: private only can be used inside the class, in other word, no other resocure can access the private variable.
    // what is new keyword:
    // array vs arraylist: arraylist has order, no has to initialze the size, has some built-in method to get/remove/add
    // complex time: the methods take how much time they need .

    // array declare
    // datatype(int/String/double/boolean) [] = new datatype[length],
    int[] arr1 = new int[5];//定义一个长度为5的整数型数组
    //int size = arr1.length; 代表数组的长度，也就是能容纳多少个整数

    //loop
//    for(int i = 0; i < arr1.length; i++){ //loop signuature
//        //loop body
//    }

    //sum
    //find max or min
    public static void main(String[] args) {
        int[] a = {1,3,2,8,4};
        int size = a.length;
        int min =  -999; //max = 999
        for(int i = 0; i < a.length ; i++){
            if(a[i] > min){ //a[i] < max
                min = a[i]; //max = a[i]
            }
        }
        System.out.println(min);
    }

    //embedeed software
    //python vs java:

    //写所有题之前第一步就是把定义写上
    //能 yes or no: yes





}
