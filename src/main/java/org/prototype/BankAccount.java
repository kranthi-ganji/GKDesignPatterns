package org.prototype;

public class BankAccount implements Cloneable{
    private String bankAccountType;
    private double minimunBalance;
    private double intrestRate;

    private String accountHolderName;
    private String accountNumber;

    BankAccount(String bankAccountType, double minimunBalance, double intrestRate){
        this.bankAccountType = bankAccountType;
        this.minimunBalance = minimunBalance;
        this.intrestRate = intrestRate;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    @Override
    public BankAccount clone(){
        try{
            return (BankAccount) super.clone();
            //
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
            throw new RuntimeException("Clone not supported");
        }
    }

    @Override
    public String toString(){
        return "------Bank Account Details \n" +
                "Account Holder : " + accountHolderName + "\n" +
                "Account Number : " + accountNumber + "\n" +
                "Account Type   : " + bankAccountType + "\n" +
                "Interest Rate  : " + minimunBalance + "%\n" +
                "Minimum Balance: " + intrestRate + "\n" +
                "-----------------------------------";
    }
}


/*
super
    Refers to the parent class of BankAccount.
    Every class in Java implicitly extends Object if no other parent is defined.
    So here, super points to the Object class.

Object.clone()

    This is a protected method in java.lang.Object.
    It creates a field-by-field copy of the current object (a shallow copy).
    That’s exactly what we need for a Prototype pattern.

Type casting (BankAccount)

    Object.clone() returns Object.
    We cast it back to BankAccount to use the cloned object directly.

 */