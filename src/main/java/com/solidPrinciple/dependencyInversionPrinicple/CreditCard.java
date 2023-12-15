package com.solidPrinciple.dependencyInversionPrinicple;

public class CreditCard implements BankCard{

    public void doTransaction(long amount){
        System.out.println("Payment made through Credit Card");
    }

}
