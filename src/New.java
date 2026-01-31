import java.util.Scanner;

class  A{


    public A () {
        super(); System.out.println("In A");
    }

    public A (int n) {
        System.out.println("In A inside A");
    }
    public A (String name) {System.out.println("THIS IS " + name);}
    public A (double dubs) {System.out.println("This is a double, and it is " + dubs);}

}

class B{

    public B () {
        super(); System.out.println("In B");
    }
    public B(int n){
        System.out.println("In B inside B");
    }

}

class C{
    public C() {
        System.out.println("In C");
    }

}

public class New {
    public static void main(String a[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        if (input.hasNextInt()) {

            System.out.println("You entered an integer " + input.nextInt());
        }
        else {
            String text = input.next();
            System.out.println("Your input is a string " + text);
        }
        System.out.println("Your name is: " + input.nextInt());


       // A object = new A("Stanley");
        //System.out.println(object);
    }
        }