package com.solidPrinciple.interfaceSegregationPrinicple;

public class PaytmService implements UPIPaymentService{
    @Override
    public void sendMoney() {
        // implementation
    }

    @Override
    public void getScratchCard() {
        // implementation
    }


    // feature of getting cashback in bank account is not available in paytm, so we did not implement CashBackService
}
