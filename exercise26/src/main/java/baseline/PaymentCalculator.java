package baseline;

public class PaymentCalculator {
    //This class will calculate the months
    public double calculateMonthsUntilPaidOff(double i, double b, double p)
    {
        //Once months is created it is set through 3 separate calculations
        double months = (-1.0/30.0);

        months = months * Math.log((1+(b/p) * (1 - Math.pow((1 + i),30))));

        months = months / Math.log((1 + i));

        //Rounds up
        return Math.ceil(months);
    }
}
