import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hrDegree = scanner.nextInt();
        int degreeOutput;
        
        /*
         *  Determines the angle by which the minute hand turned since the start of the    *  current hour
         */
        degreeOutput = (hrDegree % 30) * 12;
        System.out.print(degreeOutput);
        
        // closing the scanner object
        scanner.close();
    }
}