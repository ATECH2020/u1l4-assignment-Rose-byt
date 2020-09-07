import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int class1 = scanner.nextInt();
        int class2 = scanner.nextInt();
        int class3 = scanner.nextInt();

        /*
         *  your code goes here
         */
        int desks1 = class1 / 2;
        int remainder1 = class1 % 2;
        int desks2 = class2 / 2;
        int remainder2 = class2 % 2;
        int desks3 = class3 / 2;
        int remainder3 = class3 % 2;
        int totalRemainders = remainder1 + remainder2 + remainder3;
        int totalDesks = desks1 + desks2 + desks3;
        int StuDesks = totalRemainders + totalDesks;
        System.out.print(StuDesks);
        // closing the scanner object
        scanner.close();
    }
}