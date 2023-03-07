package com.revature.CardLogic;

import java.util.ArrayList;
import java.util.List;

public class Hand52 {
    private List<Card52> cards = new ArrayList<>();

    public Hand52(){ }

    public Hand52(List<Card52> cards){
        this.cards = cards;
    }

    public List<Card52> getCards() { return cards; }

    public List<Card52> push(Card52 card) {
        cards.add(card);
        return cards;
    }

    public List<Card52> push(List<Card52> cardList){
        cards.addAll(cardList);
        return cards;
    }

    public int size() { return cards.size(); }
    //Other operations on List<> (such as contains()) can be performed using getCards() and operations provided by List<>.
}
