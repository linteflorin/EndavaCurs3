package com.example.demo.Service;

import com.example.demo.Repositories.TransactionRepository;
import com.example.demo.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service
public class TransactionService {
    private TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public void addTransaction (Transaction transaction, HttpServletResponse response){

        if(transaction.getSuma() > 50.00)
            transactionRepository.addTransaction(transaction);
        else
            response.setStatus(403);
    }

    public List<Transaction> getAllTransactions(){
        return transactionRepository.getTransactions();

    }
    public void deleteTransaction(Transaction transaction, HttpServletResponse response){
        transactionRepository.deleteTransaction(transaction, response);


    }
    public void updateTranscation(Transaction transaction, String magazin){
        transactionRepository.updateTranscation(transaction, magazin);

    }
    public void updateSuma(Transaction transaction, Double suma){

        transactionRepository.updateSuma(transaction, suma);
    }
}
