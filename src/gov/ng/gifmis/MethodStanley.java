package gov.ng.gifmis;

import java.util.Scanner;

public class MethodStanley {
    static String joinWords(){
        System.out.println("Enter Name of User : ");
        Scanner input_name = new Scanner(System.in);
        String name = input_name.next();
        System.out.println("Enter Height (e.g 6.5) : ");
        Scanner input_height = new Scanner(System.in);
        double height = input_height.nextDouble();
        System.out.println("Enter Age of User : ");
        Scanner input_age = new Scanner(System.in);
        int age = input_age.nextInt();
        System.out.println("Gender : ");
        Scanner input_gender = new Scanner(System.in);
        String gender = input_gender.next();
        String val;
        val = ((gender == "female")) ? ("The string that was passed is " + name + " \n She is " + height + "ft. She is " + age + " years old and is a " + gender) : ("The string that was passed is " + name + " \n He is " + height + "cm. He is " + age + " years old and is a " + gender);
        return val;
    }
    public static void main(String[] args) {
        System.out.println(joinWords());
    }
}
