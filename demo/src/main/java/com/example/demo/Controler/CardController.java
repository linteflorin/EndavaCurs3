package com.example.demo.Controler;


import com.example.demo.Service.CardService;
import com.example.demo.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class CardController {
    private CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @PostMapping(path = "/add/card")
    public void addCard(@RequestBody Card card, HttpServletResponse response){
        cardService.addCard(card,response);

    }
    @GetMapping(path = "/get/card")
    public List<Card> getCards(){
        return cardService.getAllCards();

    }

    @DeleteMapping(path = "/delete/card")
    public void deleteCard(@RequestBody Card card){
        cardService.deleteCard(card);

    }

}
