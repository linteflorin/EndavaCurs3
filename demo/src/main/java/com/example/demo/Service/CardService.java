package com.example.demo.Service;

import com.example.demo.Repositories.CardRepository;
import com.example.demo.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service

public class CardService {
    private CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public void addCard(Card card, HttpServletResponse response)
    {
        if(card.getBalance()>100)
            cardRepository.addCard(card);
        else
            response.setStatus(403);
    }
    public List<Card> getAllCards(){
        return cardRepository.getCards();
    }
    public void deleteCard(Card card)
    {   cardRepository.deleteCard(card);



    }

}
