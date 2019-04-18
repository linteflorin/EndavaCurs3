package com.example.demo.model;

import java.util.Objects;

public class Transaction {

    double suma;
    String magazin;

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public String getMagazin() {
        return magazin;
    }

    public void setMagazin(String magazin) {
        this.magazin = magazin;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "suma=" + suma +
                ", magazin='" + magazin + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Double.compare(that.suma, suma) == 0 &&
                Objects.equals(magazin, that.magazin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suma, magazin);
    }
}
