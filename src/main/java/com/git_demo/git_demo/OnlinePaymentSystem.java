package com.git_demo.git_demo;

import java.util.*;

public class OnlinePaymentSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentMethod paymentMethod = null;

        
        System.out.println("Choose payment method 1 for credit-card 2 for paypal ");
        int n = sc.nextInt();

        if (n == 1) {
            paymentMethod = new CreditCard();
        } else if (n == 2) {
            paymentMethod = new PayPal();
        } else {
            System.out.println("Invalid payment method.");
        }
        
        processTransaction(paymentMethod);

    }

    public static void processTransaction(PaymentMethod paymentMethod) {
        paymentMethod.processPayment();
    }
}

abstract class PaymentMethod {
    
    abstract void processPayment();
}

class CreditCard extends PaymentMethod {
    
    public void processPayment() {
        System.out.println("Oops!! If You are Processing payment via Credit Card: a processing fee of 5% is charged");
    }
}

class PayPal extends PaymentMethod {
    
    public void processPayment() {
        System.out.println("Hurray!!! If You are Processing payment via PayPal: a processing fee may not be charged");
    }
}
