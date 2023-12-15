package com.solidPrinciple.interfaceSegregationPrinicple;

public class GPayService implements UPIPaymentService, CashBackService{
    @Override
    public void getCashBackInBankAccount() {
       // implementation
    }

    @Override
    public void sendMoney() {
        // implementation
    }

    @Override
    public void getScratchCard() {
        // implementation
    }
}
