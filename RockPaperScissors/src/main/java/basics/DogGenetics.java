package basics;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Random DnaReportGenerator = new Random();

        System.out.print("Please enter your dog's name: ");

        String dogName = input.nextLine();

        System.out.println("Well then, I have this highly reliable report on " + dogName + " prestigious background right here.");

        System.out.println(dogName + " is:");

        String dogBreed1 = "St. Bernard";
        String dogBreed2 = "Chihuahua";
        String dogBreed3 = "Dramatic RedNosed Asian Pug";
        String dogBreed4 = "Common Cur";
        String dogBreed5 = "King Doberman";

        System.out.println();

        int d1 = DnaReportGenerator.nextInt(101)+1;
        int d2 = DnaReportGenerator.nextInt(101-d1)+1;
        int d3 = DnaReportGenerator.nextInt(101-d1-d2)+1;
        int d4 = DnaReportGenerator.nextInt(101-d1-d2-d3)+1;
        int d5 = 100-d1-d2-d3-d4;

        System.out.println(d1 + "% " + dogBreed1);
        System.out.println(d2 + "% " + dogBreed2);
        System.out.println(d3 + "% " + dogBreed3);
        System.out.println(d4 + "% " + dogBreed4);
        System.out.println(d5 + "% " + dogBreed5);
    }
}
