import java.util.Scanner;

public class CreateArrayFromUserInput {
    int length = 8;
    double[] arr = new double[length];
    public double[] createArray() {
        for (int i = 0; i < length; i++) {
            Scanner Scanner = new Scanner(System.in);
            System.out.println("Enter temperature " + (i + 1) + ": ");
            arr[i] = Scanner.nextDouble();
        }
        return arr;
    }
}
