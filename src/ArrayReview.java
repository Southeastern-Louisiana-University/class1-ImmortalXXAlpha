package src;

public class ArrayReview {
    public static void main(String[] args) {
        double doubleArray[];
        doubleArray = new double[10];
        System.out.println("Value of double [0] is doubleArray[0]");
        System.out.println("Before");
        printArray(doubleArray);
        initToIndex(doubleArray);
        sumArray(doubleArray);
        System.out.println("After");
        printArray(doubleArray);

    }
    public static void printArray(double[] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(doubleArray[i]);
        }
    }
    public static void initToIndex(double[] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i]= i;
        }
    }
    public static void sumArray(double[] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] += i;
        }
    }
}
