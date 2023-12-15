package com.solidPrinciple.dependencyInversionPrinicple;

public class ShoppingMall {

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount){
        System.out.println("Purchased");
    }

    public static void main(String[] args) {
        BankCard bankCard1 = new DebitCard();// If you want to use Credit card then just change here -> new CreditCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard1);
        shoppingMall.doPurchaseSomething(10000);
    }
}
