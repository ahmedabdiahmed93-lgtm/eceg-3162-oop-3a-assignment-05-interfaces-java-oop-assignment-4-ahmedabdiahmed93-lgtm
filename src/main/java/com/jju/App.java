package com.jju;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main(String[] args) {
        // Using a polymorphic List of the Interface type
        List<PaymentMethod> cart = new ArrayList<>();
        cart.add(new CreditCard("8965499676"));
        cart.add(new PayPal("wowpc@gmail.com"));

        // Adding one CreditCard and one PayPal object to the list
        
        System.out.println("--- Checkout Initiated ---");
        // Looping through the list and processing a payment of 99.99 for each
        for (PaymentMethod Payment : cart) {
            Payment.processPayment(99.99);
        }
    }
}
