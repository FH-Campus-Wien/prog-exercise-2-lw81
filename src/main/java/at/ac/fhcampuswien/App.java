package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        double number;
        double largest = 0;
        int count = 0;
        int countTwo = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            count++;
            number = scanner.nextDouble();
            if (countTwo < 1 && number <= 0) {
                System.out.print("Number " + count + ": ");
                System.out.println("No number entered.");
                return;
            }

            if (number > largest) {
                largest = number;
            }
            System.out.print("Number " + count + ": ");

            if (number <= 0 && count > 0) {
                System.out.print("The largest number is ");
                System.out.printf("%.2f", largest, System.lineSeparator());
                System.out.println();
                break;
            }
            countTwo++;
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
    public void printRhombus() {
        // w3resource
        //single character einlesen
        //single char
        //char c = scan.next().charAt(0); character an der 0ten Stelle
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Input the number:  ");
//        int rows = scanner.nextInt();
//        int count = 1;
//        int col = 1;
//        //int start = 0;
//
//        for (int i = 1; i < rows*2; i++) {
//            //rows = rows/2;
//            for (int spc = rows - col; spc > 0; spc--) {
//                System.out.print(" ");
//            }
//            if (i < rows) {
//                //start = i;          //for number
//                col++;    //for spaces
//            } else {
//                //start = rows * 2 - i;   //for number
//                col--;      //for space
//            }
//            for (int j = 0; j < count; j++) {
//                System.out.print("*");
////                if (j < count / 2) {
////                    start--;
////                } else {
////                    start++;
////                }
//            }
//            if (i < rows) {
//                count = count + 2;
//            } else {
//                count = count - 2;
//            }
//
//            System.out.println();
//        }
        int height = scanner.nextInt();
        char c = scanner.next().charAt(0);
        int col = height / 2 + 1;
        int length = height * 2 - 1;
        System.out.print("h: ");
        System.out.print("c: ");
        if ((height % 2) == 0) {
            System.out.print("Invalid number!");
            System.out.println();
            //return;
        } else  {
            for (int i = 0; i < col; i++) {
                for (int j = 0; j < length; j++) {
                    if ((j > (length / 2) - i) && (j < (length / 2) + i)) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for (int i = height - col + 1; i > 0; i--) {
                for (int j = length; j > 0; j--) {
                    if ((j > (height - 1 / 2) - i) && (j < (height - 1 / 2) + i)) {
                        System.out.print("c");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    //todo Task 5
    public void marks(){
        // ähnlich wie nummern eingabe, nur integer. noten nicht zwischenspeicher, sondern in summen variable laufen aufsummieren, int durch int dividieren kommt immer nur in raus, typecasten
        //sum (double) count wird wieder zu dpuble
        int mark;
        double sum = 0;
        int count = 0;
        int markCounter = 0;
        double average;
        Scanner scanner = new Scanner(System.in);
        //number = scanner.nextDouble();
        //System.out.printf("%.2f", largest, System.lineSeparator());
        //summe laufen überschreiben, do while schleife
        //largest = scanner.nextDouble();
        //for (int count =1; number != 0; count++) {
        //}
        do {
            mark = scanner.nextInt();
            count++;
            if (mark > 5 || mark < 0) {
                //sum = mark;
                System.out.print("Mark " + count + ": ");
                System.out.println("Invalid mark!");
                count--;
                //mark -= mark;
            } else {

                if (mark == 5) {
                    markCounter++;
                }
                System.out.print("Mark " + count + ": ");
                sum += mark;

                if (mark == 0) {
                    if (count - 1 > 0) {
                        sum = sum / (count - 1);
                    } else {
                        sum = sum / (count);
                    }
                    System.out.print("Average: ");
                    System.out.printf("%.2f", sum, "%n");
                    System.out.println();
                    System.out.println("Negative marks: " + markCounter);
                    //System.out.printf("%.2f", sum, System.lineSeparator());
                    break;
                }
            }
        } while (mark >= 0);

    }

    //todo Task 6
    public void happyNumbers() {
        // wie zerlege ich eine zahl, in einer schleife
        //zwei schleifen
        //immer wenn man zahl 4 hat, mit einem break die schleife abbrechen, %10 /10
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("n: ");
        while (n != 1 && n != 4) {
            int part2 = 0;
            while (n > 0) {
                int part1 = n % 10;
                part2 = part2 + (part1 * part1);
                n = n / 10;
            }
            n = part2;
        }
        if (n == 1) {
            System.out.println("Happy number!");
        } else if (n == 4) {
            System.out.println("Sad number!");
        }
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