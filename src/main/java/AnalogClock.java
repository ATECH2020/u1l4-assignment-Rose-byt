import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int angleHour = scanner.nextInput();
        int angleMinute = scanner.nextInput();

        /*
         *  your code goes here
         */
        hourHand = angleHour / 720;
        hourDegrees = hourHand * 0.5;
        minuteHand = angleMinute / 60;
        minuteDegrees = minuteHand * 6;

        System.out.print(hourDegrees +" "+ minuteDegrees);
        // closing the scanner object
        scanner.close();
    }
}