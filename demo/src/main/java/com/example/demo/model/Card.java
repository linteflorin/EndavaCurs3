package com.example.demo.model;

import java.util.List;
import java.util.Objects;

public class Card {
    String ownerName;
    String numar;
    double balance;
    //List<Transaction> transactionList;




    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getNumar() {
        return numar;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Double.compare(card.balance, balance) == 0 &&
                Objects.equals(ownerName, card.ownerName) &&
                Objects.equals(numar, card.numar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerName, numar, balance);
    }

    @Override
    public String toString() {
        return "Card{" +
                "ownerName='" + ownerName + '\'' +
                ", numar='" + numar + '\'' +
                ", balance=" + balance +
                '}';
    }
}
