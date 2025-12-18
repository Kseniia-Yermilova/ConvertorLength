package app;

public class Main {
    private static final double CONV_K = 1.60934d;

    static void main() {
        System.out.println("Convertor of length with SSH");
        double mls = 3;
        double kilometers = convMilesToKm(mls);
        System.out.println("Result is " + kilometers + " km");
    }

    private static double convMilesToKm(double miles){
        return miles * CONV_K;
    }
}
