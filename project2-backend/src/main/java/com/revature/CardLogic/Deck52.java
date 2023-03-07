package com.revature.CardLogic;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Deck52 {
    private List<Card52> deck = new ArrayList<>();

    public Deck52(){
        for(Card52.Suit s : Card52.Suit.values()){
			for(Card52.Rank r : Card52.Rank.values()){
				deck.add(new Card52(s, r));
			}
		}
    }

    //Shuffles all of the cards in the deck.
    //This returns this Deck52 instance so that a deck instance can be created with this logic: 
    // Deck52 deck = new Deck52().shuffle();
    public Deck52 shuffle(){
        Collections.shuffle(deck);
        return this;
    }

    //Get the number of cards remaining in the deck.
    public int size(){
        return deck.size();
    }

    //Shorthand function that can be used to quickly determine if peek() and pop() are safe to execute.
    public boolean hasNext() {
        return deck.size() > 0;
    }

    //Show the next card in the deck without removing it. 
    public Card52 peek() throws IndexOutOfBoundsException {
        if(deck.size() == 0) throw new IndexOutOfBoundsException("There are no more cards left to take.");
        return deck.get(deck.size() - 1); //Index is chosen to avoid many index reassignments each time a card is taken
    }

    //Remove the next card from the deck and return it.
    public Card52 deal() throws IndexOutOfBoundsException {
        if(deck.size() == 0) throw new IndexOutOfBoundsException("There are no more cards left to take.");
        return deck.remove(deck.size() - 1); //Index is chosen to avoid many index reassignments each time a card is taken
    }

    /**
     * Allows you to deal a set number of cards from the deck at once.
     * @param number The number of cards to deal
     * @return a List containing the cards that were dealt
     * @throws IndexOutOfBoundsException If the number of cards to deal is larger than the amount left in the deck.
     */
    public List<Card52> deal(int number) throws IndexOutOfBoundsException {
        if(number > deck.size()) throw new IndexOutOfBoundsException("There aren't enough cards left to deal " + number + '!');
        List<Card52> result = new ArrayList<>();
        
        for(int i = 0; i < number; i++) {
            result.add(deck.remove(deck.size() - 1));
        }

        return result;
    }


    @Override
    public String toString() {
        return "{" +
            " deck='" + deck + "'" +
            "}";
    }
    
}
