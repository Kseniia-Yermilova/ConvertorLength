package app;

public class Main {
    private static final double CONV_K = 1.60934d;

    static void main() {
        System.out.println("Convertor of length with SSH");
        double mls = 3;
        double km = 5;
        double kilometers = convMilesToKm(mls);
        double miles = convKmToMiles(km);
        System.out.println("Result is " + kilometers + " km and " + miles + " miles");
    }

    private static double convMilesToKm(double miles){
        return miles * CONV_K;
    }

    private static double convKmToMiles(double km){
        return km / CONV_K;
    }
}
