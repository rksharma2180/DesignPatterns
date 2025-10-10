package Behavioral.Strategy.custom;

public class Demo {
    private PaymentStrategy paymentStrategy;

    public static void main(String[] args) {
        PaymentMethod method = new PaymentMethod();
        method.setPaymentStrategy(new CreditCardPayment());//
        method.checkout(1000);

        method.setPaymentStrategy(new PaypalPayment());
        method.checkout(2000);

    }

}
