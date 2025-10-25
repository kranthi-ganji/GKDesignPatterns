package org.prototype;

public class Client {
    public static void main(String[] args) {
        BankAccount account1 = (BankAccount)AccountRegistry.getAccount("Savings");
        account1.setAccountNumber("1234");
        account1.setAccountHolderName("John");
        BankAccount account2 = (BankAccount)AccountRegistry.getAccount("Current");
        account2.setAccountNumber("7898");
        account2.setAccountHolderName("Peter");
        BankAccount account3 = (BankAccount)AccountRegistry.getAccount("Premium");
        account3.setAccountNumber("54787");
        account3.setAccountHolderName("Cristopher");
        System.out.println(account1);  //Java automatically calls the toString() method of that object behind the scenes.
        System.out.println(account2);
        System.out.println(account3);
    }
}
/*
You can clone any type of account instantly from a prebuilt template.

You can customize per-customer fields without affecting the prototype.

You can add new account types in the registry — no code change needed elsewhere.
*/