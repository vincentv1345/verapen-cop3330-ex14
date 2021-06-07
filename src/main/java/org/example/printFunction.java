package org.example;

public class printFunction extends CalculateValues{
    public void printF(){
        CalculateValues n = new CalculateValues();
        Double amount = n.getOrderAmount();
        String state = n.getState();
        String currency = n.getCurrency(amount);
        double tax = n.checkState(state, amount);
        double total = n.totalCurr(amount, tax);
        String fullTotal = n.getCurrency(total);
        System.out.println("The subtotal is: " + currency + "\n" + "The tax is: " + tax + "\nThe total is: " + total);
    }
}
