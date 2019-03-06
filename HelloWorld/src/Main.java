import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //System.out.println("Hello world!");
        //System.out.println("Burak");

        // Body shop to create cars

        /*Car myCar = new Car(20.2,
                "1BC32E",
                Color.BLUE,
                true);
        Car sallyCar = new Car(21.9,
                "3DOES2",
                Color.BLACK,
                false);

        // ==== CALL BY VALUE VS. CALL BY REFERENCE ====

        double myCarSpeed = 50;
        myCarSpeed = myCar.speedUp(myCarSpeed);
        System.out.println(myCarSpeed);*/


        //System.out.println("Sally's license plate: " + sallyCar.licensePlate);
        //System.out.println("My car's license plate: " + myCar.licensePlate);
        //System.out.println("Paint color before change: " + myCar.paintColor);
        //myCar.changePaintColor(Color.RED);
        //System.out.println("Paint color after change: " + myCar.paintColor);


        // ====== SCANNER ======

        // Scanner is used to get user input

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int userNumber = sc.nextInt();
        System.out.println("You are " + userNumber);
        System.out.println("Enter your weight in decimal: ");
        double userNumber2 = sc.nextDouble();
        System.out.println(userNumber2);
        System.out.println("You weigh " + userNumber2 + " kilograms.");
        */


        // ====== ARRAYS =======
        // 31,45,22,98,10
        /*
        int[] numbers = new int[5];

        // Array initialization

        numbers[0] = 31;
        numbers[1] = 45;
        numbers[2] = 22;
        numbers[3] = 98;
        numbers[4] = 10;

        // Array sorting

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // Another type of array initialization

        int[] numbersTwo = {31, 45, 22, 98, 10};

        String[] candyBars = {"Twix", "Hershey's", "Crunch"};
        System.out.println(candyBars[1]);
        candyBars[1] = "Butterfinger";
        System.out.println(candyBars[1]);
        System.out.println(candyBars.length);

        System.out.println(Array.get(candyBars, 2));
        */


        // ===== USER INPUT ======

        /*
        System.out.println("Enter one word: ");
        String userInput = sc.next();
        String upperCased = userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(upperCased);

        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);

        System.out.println("Contains: "
                + userInput.contains("enter".toLowerCase()));
        */


        // ==== replace() method demonstration ====

        /*
        String s = "dog";
        String replaced = s.replace("d", "f");
        System.out.println(replaced);
        */


        // ==== IF STATEMENT ====
        /*
        System.out.println("Enter an age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 0 && age <= 5) {
            System.out.println("Baby");
        } else if (age >= 6 && age <= 11){
            System.out.println("Kid");
        } else if (age >= 12 && age <= 17) {
            System.out.println("Teen");
        } else if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("invalid");
        }

        System.out.println("Thanks for using this program!");
        */


        // ==== WHILE LOOP ====

        /*
        System.out.println("While loop: ");
        int x = 3;
        while (x > 0) {
            System.out.println("Current x: " + x);
            x -= 1;
        }
        System.out.println("Final x: " + x);
        System.out.println();
        */


        // ==== DO-WHILE LOOP ====

        /*
        System.out.println("Do while loop: ");
        int y = 3;
        do {
            System.out.println("Current y: " + y);
            y -= 1;
        } while (y > 0);
        System.out.println("Final y: " + y);
        */


        // ==== FOR LOOP ====

        /*
        System.out.println("For loop: ");
        for (int i = 3; i > 0; i--) {
            System.out.println("Current i: " + i);
        }
        System.out.println();
        */


        // ==== LIBRARIES ====

       /* double power = Math.pow(5, 3);
        System.out.println(power);

        double squareRoot = Math.sqrt(64);
        System.out.println(squareRoot);

        // Random number generation

        Random rand = new Random();
        int randomNumber = rand.nextInt();
        System.out.println(randomNumber);
        int randomNumberWithBound = rand.nextInt(10);
        System.out.println(randomNumberWithBound);*/


        // ==== FLIP A COIN ====

        /*Coin c = new Coin();
        System.out.println("Initial: " + c.getResult());
        String[] headsOrTails = new String[10];
        for (int i = 0; i < 10; i++) {

            c.flipACoin();
            System.out.println("After flip: " + c.getResult());
            headsOrTails[i] = c.getResult();
        }

        // Count the number of heads and tails

        int headsCounter = 0;
        int tailsCounter = 0;
        for (int i = 0; i < headsOrTails.length; i++) {
            if (headsOrTails[i] == "HEADS") {
                headsCounter++;
            } else {
                tailsCounter++;
            }

        }

        System.out.println("Number of heads: " + headsCounter);
        System.out.println("Number of tails: " + tailsCounter);*/


        // ==== LAMBDA FUNCTIONS ====

        // Interface Answerable created in Answerable.java class

        Answerable phone = () -> "Hello";

        System.out.println(phone.answer());

        Predicate isOdd = n -> n % 2 != 0;

        Predicate isEven = n -> n % 2 == 0;

        System.out.println("Is 11 odd? " + isOdd.test(11));
        System.out.println("Is 19 even? " + isEven.test(19));

    }
}
