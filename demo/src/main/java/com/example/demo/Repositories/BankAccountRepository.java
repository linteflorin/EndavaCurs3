package com.example.demo.Repositories;


import com.example.demo.model.BankAccount;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BankAccountRepository {
    List<BankAccount> bankAccounts = new ArrayList<>();

    public void addBankAccount(BankAccount bankAccount){
        bankAccounts.add(bankAccount);
    }
    public List<BankAccount> getBankAccounts(){
        return bankAccounts;

    }
}
