package com.tnsif.interfaceDemo;

public class UPI implements Payment {

    @Override
    public void paymentReceipt(double amount) {
        System.out.println("Payment of ₹" + amount + " completed via UPI.");
    }
}