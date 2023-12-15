package com.solidPrinciple.OpenClosePrinciple;

public interface NotificationService { // This interface can not be modified

    void sendOTP(String medium);

    void sendTransactions(String medium);
}
