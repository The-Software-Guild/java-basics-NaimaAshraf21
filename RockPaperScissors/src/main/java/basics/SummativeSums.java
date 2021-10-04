package basics;

public class SummativeSums {

    public static int sums (int []array){
        int sum = 0;

        for (int i:array){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] array2 = { 999, -60, -77, 14, 160, 301 };
        int[] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99 };

        System.out.println("Sum of Array 1: " + sums(array1));
        System.out.println("Sum of Array 2: " + sums(array2));
        System.out.println("Sum of Array 3: " + sums(array3));
    }
}
