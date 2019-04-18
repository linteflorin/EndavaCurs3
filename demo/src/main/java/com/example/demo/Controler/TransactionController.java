package com.example.demo.Controler;


import com.example.demo.Service.TransactionService;
import com.example.demo.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class TransactionController {
    private TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }
    @PostMapping(path = "/add/transaction")
    public void addTransaction(@RequestBody Transaction transaction, HttpServletResponse response){
        transactionService.addTransaction(transaction,response);

    }
    @GetMapping(path = "/get/transaction")
    public List<Transaction> getTransactions(){

        return transactionService.getAllTransactions();
    }
    @PutMapping(path = "/update/suma/{suma}")
    public void updateSuma(@RequestBody Transaction transaction, @PathVariable double suma){

        transactionService.updateSuma(transaction,suma);

    }
    @PutMapping(path = "/update/magazin/{magazin}")
    public void updateTransaction(@RequestBody Transaction transaction, @PathVariable String magazin){

        transactionService.updateTranscation(transaction, magazin);

    }

    @DeleteMapping(path = "/delete/transaction")
    public void deleteTransaction(@RequestBody Transaction transaction, HttpServletResponse response){

        transactionService.deleteTransaction(transaction, response);
    }
}
