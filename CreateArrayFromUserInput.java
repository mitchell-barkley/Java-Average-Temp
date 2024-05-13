import java.util.Scanner;
public class CreateArrayFromUserInput {

    public double[] createArray() {
        Scanner arraySize = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int length = arraySize.nextInt();
        double[] arrayIn = new double[length];
        for (int i = 0; i < length; i++) {
            Scanner Scanner = new Scanner(System.in);
            System.out.println("Enter temperature " + (i + 1) + ": ");
            arrayIn[i] = Scanner.nextDouble();
        }
        return arrayIn;
    }
}
