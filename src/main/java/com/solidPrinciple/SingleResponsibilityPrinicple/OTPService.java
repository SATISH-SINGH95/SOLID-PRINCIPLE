package com.solidPrinciple.SingleResponsibilityPrinicple;

public class OTPService {

    public void sendOTP(String medium){
        if(medium.equalsIgnoreCase("Mobile")){
            System.out.println("OTP sent on Mobile number");
        }else if(medium.equalsIgnoreCase("Email")){
            System.out.println("OTP sent on Email");
        }

    }
}
