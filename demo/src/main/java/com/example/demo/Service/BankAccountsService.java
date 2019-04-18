package com.example.demo.Service;

import com.example.demo.Repositories.BankAccountRepository;
import com.example.demo.model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;

@Service
public class BankAccountsService {

    private BankAccountRepository bankAccountRepository;

    @Autowired // se face legatura serive-repository prin constructor
    public BankAccountsService(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    public void addBankAccount(BankAccount bankAccount,  HttpServletResponse response) {
        if (bankAccount.getBalance() > 50)
        {
            bankAccountRepository.addBankAccount(bankAccount);

        }
        else{
            response.setStatus(403);//sa returneze eroarea;
        }

    }
}
