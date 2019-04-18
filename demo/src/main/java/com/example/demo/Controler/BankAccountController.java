package com.example.demo.Controler;

import com.example.demo.Service.BankAccountsService;
import com.example.demo.model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class BankAccountController {

    private BankAccountsService bankAccountsService;

    @Autowired
    public BankAccountController(BankAccountsService bankAccountsService) {
        this.bankAccountsService = bankAccountsService;
    }

    @PostMapping(path = "/add/account")
    public void addBankAccount(@RequestBody BankAccount bankAccount, HttpServletResponse response){

    bankAccountsService.addBankAccount(bankAccount, response);
    }



}
