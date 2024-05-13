public class CalculateAverageTemp extends CreateArrayFromUserInput{

    public double[] arr = createArray();
    private double sum = 0;
    private double average = 0;

    public void calculateAverage() {
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = sum / arr.length;
        System.out.println("The average temperature over " + arr.length + " days is: " + average);
    }

    public void calculateOverAverage() {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                count++;
            }
        }
        System.out.println("The number of days above average temperature is: " + count);
    }

}
