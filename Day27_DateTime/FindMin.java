package Day27_DateTime;

public class FindMin {
    public static void main(String[] args) {
        int[] arr={5,4,7,5};
        double[] arr2={5.1,4,7,5,2.9,22};

        System.out.println(minimum(arr2));

    }

    public static int minimum(int[] arr) {
        int minimum=arr[0];

        for (int each:arr) {
            if (each<minimum){
                minimum=each;
            }
        }
        return minimum;
    }

    public static double minimum(double[] arr) {
        double minimum = arr[0];

        for (double each : arr) {
            if (each < minimum) {
                minimum = each;
            }
        }
        return minimum;
    }
}
