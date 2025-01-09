import java.util.Scanner;

public class condition {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name;
        boolean isStudent;
        int age;

        System.out.println("Enter your name:");
        name = scanner.nextLine();
        System.out.println("Enter your age:");
        age = scanner.nextInt();
        System.out.println("enter whether it is student or not(TRUE/FALSE): ");
        isStudent = scanner.nextBoolean();

// Group 1

        if(isStudent){
            System.out.println("this person is A student");

        }
        else{
            System.out.println("this person is student");
        }

//group 2
        if(name.isEmpty()){
            System.out.println("you didn't enter your name");
        }
        else{
            System.out.println("Hello "+ name);
        }


//group 3

        if(age<0){
            System.out.println("you are not born yet");

        }
        else if (age == 0){
            System.out.println("you are a baby");
        }
        else if (age>=18){
            System.out.println("you are an adult");
        }
        else if (age<18){

            System.out.println("you are a child");
        }

        scanner.close();
    }
}
