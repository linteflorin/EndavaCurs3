package com.example.demo.Repositories;

import com.example.demo.model.Card;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CardRepository {
        List<Card> Cards = new ArrayList<>();

        public void addCard(Card card){
            Cards.add(card);

        }

        public List<Card> getCards(){
            return Cards;

        }
        public void deleteCard(Card card){

            for(Card c:Cards)
                if(c.equals(card)){
                    Cards.remove(card);

                }

        }

}
