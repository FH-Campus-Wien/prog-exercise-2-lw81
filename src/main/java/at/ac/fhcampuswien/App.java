package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        double number;
        double largest = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        //number = scanner.nextDouble();
        //System.out.printf("%.2f", largest, System.lineSeparator());
        //summe laufen überschreiben, do while schleife
        //largest = scanner.nextDouble();
        //for (int count =1; number != 0; count++) {
        //}
        do {
            count++;
            number = scanner.nextInt();

            if (number > largest) {
                largest = number;
            }
            System.out.println("Number " + count + ": " + number + " ");

            if (number <= 0 && count > 0){
                System.out.print("The largest number is ");
                System.out.printf("%.2f", largest, System.lineSeparator());
                break;
            }
//            else {
//                System.out.print("No number entered.");
//            }
        } while (number >= 0);
    }

    //todo Task 2
    public void stairs(){
        Scanner scanner = new Scanner(System.in);
        final int ROWS = scanner.nextInt();
        System.out.print("n: ");
        if (ROWS <=0){
            System.out.println("Invalid number!");
        }
        int counter = 0;
        for(int i = 0; i < ROWS; i++) {
            for (int j = 0; j <= i; j++) {
                counter++;
                System.out.print(counter + " ");
            }
            System.out.println();
        }
    }

    //todo Task 3
    public void printPyramid() {
        final int ROWS = 6;
        for (int i = 0; i < ROWS; i++) {
            for (int j = ROWS - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // w3resource
        //single character einlesen
        //single char
        //char c = scan.next().charAt(0); character an der 0ten Stelle
    }

    //todo Task 5
    public void marks(){
        // ähnlich wie nummern eingabe, nur integer. noten nicht zwischenspeicher, sondern in summen variable laufen aufsummieren, int durch int dividieren kommt immer nur in raus, typecasten
        //sum (double) count wird wieder zu dpuble
    }

    //todo Task 6
    public void happyNumbers(){
        // wie zerlege ich eine zahl, in einer schleife
        //zwei schleifen
        //immer wenn man zahl 4 habt, mit einem break die schleife abbrechen, %10 /10
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}