package ManagementSystem;

import java.util.Scanner;

public class SimpleScanner {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Please input your option Y for continue, N for shutdown ");
            String input = scanner.nextLine();
            if(input.equals("N")){
                break;
            }
            System.out.println("Your choice is " + input + "so continue the system");
        }

        System.out.println("System shut down");

    }

}


