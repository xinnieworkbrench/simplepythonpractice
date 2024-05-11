package review;

import java.util.SplittableRandom;

public class Student {

    //field / state
    private String name;
    private char grade;
    private double height;
    private int phoneName;

    // 没有任何参数的 constructor 叫做 default constructor
    public Student(){

    }

    public Student(String name, char grade, double height, int phoneName){
        this.name = name;
        this.grade = grade;
        this.height = height;
        this.phoneName = phoneName;
    }

    public String toString(){
        return name + "---"+ grade + "----" + height + "----" +phoneName;
    }


}
