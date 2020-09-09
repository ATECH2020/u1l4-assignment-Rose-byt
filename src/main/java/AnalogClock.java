import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int angleHour = scanner.nextInt();
        int angleMinute = scanner.nextInt();

        /*
         *  your code goes here
         */
        int hourHand = angleHour / 720;
        double hourDegrees = hourHand * 0.5;
        int minuteHand = angleMinute / 60;
        int minuteDegrees = minuteHand * 6;

        System.out.print(hourDegrees +" "+ minuteDegrees);
        // closing the scanner object
        scanner.close();
    }
}