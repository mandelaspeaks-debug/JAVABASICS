class Calculator {
    int day;
    public int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    public static void stop() {
        System.out.println("Stop Working!");
    }

    public static void play() {
        System.out.println("Stop Working!");

    }

    public static void error() {
        System.out.println("Stop Working!");
    }

    public static void angry() {
        System.out.println("Stop Working!");
    }

    public int subtraction(int... numberss){
        if (numberss.length == 1){
            System.out.println("You only have one number! Add a second.");
            return 0;
        }
        int result = numberss[0];
        for (int i = 1; i < numberss.length; i++){
            result -=numberss[i];
        }
        return result;
    }
}

class Phone {
    static String brand;
    int price;
    String name;

    public void reveal() {
        System.out.println(brand + " " + price + " " + name);
    }
}

public class Main {
    public static void main(String a[]){

        String[] color = {"red", "yellow", "green"};

        Calculator stop = new Calculator();

        for (String col : color) {
            switch (col) {
                case "red" ->
                    stop.angry();


                case "yellow" ->
                    stop.play();


                default ->
                    stop.error();


            };
            System.out.println(col);

        }

        StringBuffer span = new StringBuffer("Daniel ");
        System.out.println(span.append("Emeka"));

        Phone object = new Phone();
        object.name = "Smartphone";
        object.price = 120000;
        Phone.brand = "Nokia";

        Phone obj = new Phone();
        obj.name = "Stupid Phone";
        obj.price = 150000;


        object.reveal();
        obj.reveal();




        /* int dayNumber = 2;
        String dayName = switch (dayNumber) {
            case 1 -> "Monday";
            case 2 -> {
                String extra = "AMALA " + "TUESDAY";
                yield extra;
            }
            default -> "No day";
        };
        System.out.println(dayName); */

        /*int i = 1;
        while(i<=5) {
            System.out.println("Hi " + i);
            int j = 1;
            while(j<=3){
                System.out.println("Hello People!");
                j++;
            }

            i++;
        }*/


    }


}