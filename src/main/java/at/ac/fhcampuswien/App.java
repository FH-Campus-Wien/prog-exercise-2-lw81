package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        double number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextDouble();
        //System.out.printf("%,2f", variable, System.lineSeparator());
        //summe laufen überschreiben, do while schleife
        while(number != 0){
            number = scanner.nextDouble();
            int count = 1;
            System.out.println("Number " + count +" :");
            if (number <= 0 ){
                System.out.println("No number entered.");
            }

        }
    }

    //todo Task 2
    public void stairs(){
        final int ROWS = 6;
        final int COLS = 4;


        for(int i = 0; i < ROWS; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 3
    public void printPyramid(){
        // dritte schleife mit leerzeichen
        // i*2 - 1
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