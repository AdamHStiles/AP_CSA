package Unit_1;

public class mortgage{
    static double fixedRate(double P, double r, double n, double t){
        double payment = (P * (r/n) * Math.pow(1+ r/n,n*t)) / (Math.pow(1+ r/n,n*t) -1);
        return payment;
    }
    public static void main(String[] args){
        double loanAmount = 100000;
        double interestRate = .06;
        double years = 30;
        double numPayments = 12;

        double payment = fixedRate(loanAmount,interestRate, numPayments,years);
        System.out.println("Your fixed payment is:");
        System.out.printf("%.2f", payment);
    }
}