package ManagementSystem;

public class Dog {

    // static variable -> associate with the class and can be shared
    // non static varivale, cannot share, only itself


    //spesfic
    private String name;
    private char size;
    private int id;
    //common
    private static int small;
    private static int medium;
    private static int large;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public Dog(String name, char size){
        this.name = name;
        this.size = size;
    }

    public String toString(){
        return "this is dog" + name + "his size is " + size + "his id is " + id + "the small dog in this kennel is " + small + "the medium dog in this kennel is " + medium + "the large dog in this kennel is " + large;
    }

    // 1. Object (Dog, NBA, Timberwolves), -> print computer memory address -> toString()
    // 2. 8 data type (int , String ,char, boolean ....)

    //why we need setter and getter.
    // setter: if your constructor doesn't define the value there, but you want to set the value, you should use setter.
    // getter: read only the value


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSmall() {
        return small;
    }

    public void setSmall(int small) {
        this.small = small;
    }

    public int getMedium() {
        return medium;
    }

    public void setMedium(int medium) {
        this.medium = medium;
    }

    public int getLarge() {
        return large;
    }

    public void setLarge(int large) {
        this.large = large;
    }
}


//A. "max and min difference" and "inverse array" analyze the time complexity. （）chat
//B. 1定义一个class 叫 Timberwolves, 有哪些属性: name, age, position, allStar, seasonWin, playOff
//2. 对于 non static的属性， 需要定义一个 constuctor
//3. 对于 static的属性， 只需要定义 setter 和 getter
//4. 创建一个 toString(), 打印他们的基本信息 （基本信息包括所有的 属性(all)
//5. 创建一个新的class 叫 League 里面有 main, 在main里面创建5个不同的森林狼球员。 有loop打印这5个球员的基本信息 (getter)
//C compareArray ------ carry over!