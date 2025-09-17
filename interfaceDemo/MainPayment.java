package com.tnsif.interfaceDemo;

public class MainPayment {

    public static void main(String[] args) {
        Payment ob = new UPI();
        ob.paymentReceipt(1234.5); // ✅ Correct method name
    }
}