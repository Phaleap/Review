package Review17;

import java.util.ArrayList;

class Payment{
    public void pay(double amount){
        System.out.println("Paying " + amount);
    }
}
class CreditCardPayment extends Payment{
    @Override
    public void pay(double amount){
        System.out.println("Paid " + amount + " using credit Card");
    }
}
class PaypalPayment extends Payment{
    @Override
    public void pay(double amount){
        System.out.println("Paid " + amount + " using Paypal Card");
    }
}
class CryptoPayment extends  Payment{
    @Override
    public void pay(double amount){
        System.out.println("Paid " + amount + " using Crypto");
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Payment> payments = new ArrayList<Payment>();
        payments.add(new CreditCardPayment());
        payments.add(new PaypalPayment());
        payments.add(new CryptoPayment());
        for(Payment payment:payments){
            payment.pay(100);
        }
    }
}
