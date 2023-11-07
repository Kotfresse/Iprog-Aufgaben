
/**
 * @author Tri Nguyen
 **/
import java.math.BigDecimal;
import java.math.BigInteger;

public class MyMath {
    public static void main(String[] args) {
        int[] numbers = new int[21];
        for (int i = 0; i < 21; i++) {
            numbers[i] = (i + 1);
            System.out.print(numbers[i] + ",");
        }
        System.out.println("Sum of numbers: " + addAll(numbers));
        System.out.println("Product of numbers: " + multiplyAll(numbers));
        System.out.println("Concatenation of numbers: " + catAll(numbers));
        long[] numbers2 = new long[21];
        for (int i = 0; i < 21; i++) {
            numbers2[i] = (i + 1);
            System.out.print(numbers2[i] + ",");
        }
        System.out.println("Sum of numbers: " + addAll(numbers2));
        System.out.println("Product of numbers: " + multiplyAll(numbers2));
        System.out.println("Concatenation of numbers: " + catAll(numbers2));
        double[] numbers3 = new double[21];
        for (int i = 0; i < 21; i++) {
            numbers3[i] = (i + 1);
            System.out.print(numbers3[i] + ",");
        }
        System.out.println("Sum of numbers: " + addAll(numbers3));
        System.out.println("Product of numbers: " + multiplyAll(numbers3));
        System.out.println("Concatenation of numbers: " + catAll(numbers3));

        System.out.println("Reverse of 123: " + reverse(123));
        System.out.println("Reverse of 120: " + reverse(120));
        System.out.println("Reverse of -431: " + reverse(-134));

        System.out.println("Minimum of numbers: " + min(numbers));
        System.out.println("Maximum of numbers: " + max(numbers));
        System.out.println("Minimum of numbers: " + min(numbers2));
        System.out.println("Maximum of numbers: " + max(numbers2));
    }

    public static int addAll(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static long addAll(long[] numbers) {
        long sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static double addAll(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static BigInteger multiplyAll(int[] numbers) {
        BigInteger product = new BigInteger("1");
        for (int i = 0; i < numbers.length; i++) {
            product = product.multiply(new BigInteger("" + numbers[i]));
        }
        return product;
    }

    public static BigInteger multiplyAll(long[] numbers) {
        BigInteger product = new BigInteger("1");
        for (int i = 0; i < numbers.length; i++) {
            product = product.multiply(new BigInteger("" + numbers[i]));
        }
        return product;
    }

    public static BigDecimal multiplyAll(double[] numbers) {
        BigDecimal product = new BigDecimal("1");
        for (int i = 0; i < numbers.length; i++) {
            product = product.multiply(new BigDecimal("" + numbers[i]));
        }
        return product;
    }

    public static String catAll(int[] numbers) {
        String cat = "";
        cat += numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            cat += ", " + numbers[i];
        }
        return cat;
    }

    public static String catAll(long[] numbers) {
        String cat = "";
        cat += numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            cat += ", " + numbers[i];
        }
        return cat;
    }

    public static String catAll(double[] numbers) {
        String cat = "";
        cat += numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            cat += ", " + numbers[i];
        }
        return cat;
    }

    public static String catAll(String[] numbers) {
        String cat = "";
        cat += numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            cat += ", " + numbers[i];
        }
        return cat;
    }

    public static int reverse (int i){
        boolean negative = false;
        if (i < 0) {
            negative = true;
            i = -i;
        }
        int reverse = 0;
        while (i != 0) {
            reverse = reverse * 10 + i % 10;
            i = i / 10;
        }
        if (negative) {
            reverse = -reverse;
        }
        return reverse;
    }
    public static long reverse (long i){
        boolean negative = false;
        if (i < 0) {
            negative = true;
            i = -i;
        }
        long reverse = 0;
        while (i != 0) {
            reverse = reverse * 10 + i % 10;
            i = i / 10;
        }
        if (negative) {
            reverse = -reverse;
        }
        return reverse;
    }
    
    public static int min(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }
    public static double min(double[] numbers) {
        double min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }
    public static long min(long[] numbers) {
        long min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }
    public static float min(float[] numbers) {
        float min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }
    public static int max(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }
    public static double max(double[] numbers) {
        double max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }
    public static long max(long[] numbers) {
        long max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }
    public static float max(float[] numbers) {
        float max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

}
