package com.example.demo.Repositories;

import com.example.demo.model.Transaction;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
@Repository
public class TransactionRepository {
    List<Transaction> transactions = new ArrayList<>();

    public void addTransaction (Transaction transaction){

        transactions.add(transaction);
    }

    public List<Transaction> getTransactions(){
        return transactions;

    }

    public void deleteTransaction(Transaction transaction, HttpServletResponse response){

                transactions.remove(transaction);



    }
    public void updateTranscation(Transaction transaction, String magazin){
        int index = transactions.indexOf(transaction);
        transactions.get(index).setMagazin(magazin);

    }
    public void updateSuma(Transaction transaction, Double suma){

        int index = transactions.indexOf(transaction);
        transactions.get(index).setSuma(suma);
    }
}
