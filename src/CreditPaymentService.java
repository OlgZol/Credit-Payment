public class CreditPaymentService {
    public int calculate(double sum, double term, double rate) {
        double i = (rate / 12) / 100;
        double koef = i*Math.pow((1+i),term)/(Math.pow((1+i),term)-1) ;
        double payment = sum * koef;
        return (int) payment;
    }
}
