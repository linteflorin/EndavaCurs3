package com.example.demo;

import com.example.demo.model.BankAccount;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {


    //@RequestMapping(path = "/myresource/{name}", method = RequestMethod.GET)    //asta e pentru Rest si e metoda get:
    @GetMapping(path = "/myresource/{name}") //e acelasi lucru doar ca nu mai trb sa scriem metoda
    public ResponseEntity<String> firstGet(@PathVariable String name){      //name  epun in path si cand scriem localhost:8080/myresoruce/si ceva atunci name va primi acel ceva
        String value = "Welcome! " + name + " This is my first service";

        ResponseEntity<String> responseEntity = new ResponseEntity<>(value, HttpStatus.OK);
        return responseEntity;

    }

    @PostMapping(path ="/mypost")
    //trebuie sa iau PostMan
    //In postman scris in body, in loc de text folosim JSON, cu structura { si aici valorile pt fiecare atribut din BankAccount  }
    public ResponseEntity<BankAccount> myPost(@RequestBody BankAccount bankAccount){
        bankAccount.setBalance(bankAccount.getBalance()+50);
        ResponseEntity<BankAccount> responseEntity = new ResponseEntity<>(bankAccount, HttpStatus.OK);
        return responseEntity;

    }





}
