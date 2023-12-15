package com.solidPrinciple.dependencyInversionPrinicple;

public class DebitCard implements BankCard{

    public void doTransaction(long amount){
        System.out.println("Payment made through Debit Card");
    }
}
