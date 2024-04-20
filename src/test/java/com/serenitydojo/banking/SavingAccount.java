package com.serenitydojo.banking;

public class SavingAccount extends BankAccount implements  InterestBearing{

    private double interestRate;

    public SavingAccount(double initialBalance, double interestRate) {
        this.interestRate = interestRate;
        setBalance(initialBalance);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    @Override
    public double calculateMonthlyInterest(){
        return interestRate * getBalance() /12;
    }
}