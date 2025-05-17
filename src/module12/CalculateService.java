package module12;

public class CalculateService {
    final static double standardServiceFee = 100;

    public static double yearlyService() {
        return standardServiceFee;
    }

    public static double yearlyService(double oilChangeFee) {
        return standardServiceFee + oilChangeFee;
    }

    public static double yearlyService(double oilChangeFee, double tireRotationFee){
        return standardServiceFee + oilChangeFee + tireRotationFee;
    }

    public static double yearlyService(double oilChangeFee, double tireRotationFee, double coupon) {
        return standardServiceFee + oilChangeFee + tireRotationFee - coupon;
    }

    public static void main(String[] args) {
        System.out.println("$ " + CalculateService.yearlyService());
        System.out.println("$ " + CalculateService.yearlyService());

        System.out.println("$ " + CalculateService.yearlyService(26.50));
        System.out.println("$ " + CalculateService.yearlyService(60.50));

        System.out.println("$ " + CalculateService.yearlyService(20.10, 20.00));
        System.out.println("$ " + CalculateService.yearlyService(15.00, 10.00));

        System.out.println("$ " + CalculateService.yearlyService(36.00, 20.00, 10.00));
        System.out.println("$ " + CalculateService.yearlyService(60.00, 10.00, 15.00));
    }
}
