package basics;

import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        int age;

        System.out.println("What is your age? ");
        age = inputReader.nextInt();

        double maxHeartRate = 220 - age;
        double minTargetHeartRate = 0.5 * maxHeartRate;
        double maxTargetHeartRate = 0.85 * maxHeartRate;

        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute.");
        System.out.println("Your target HR Zone is " + minTargetHeartRate + " - " + maxTargetHeartRate + " beats per minute.");
    }
}
