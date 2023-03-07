package com.revature.CardLogic;

public class Card52 implements Comparable<Card52> {
    public enum Suit {SPADE, HEART, CLUB, DIAMOND}
    public enum Rank {TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE}

    private Suit suit;
    private Rank rank;

    public Card52(Suit suit, Rank rank){
        if (suit == null || rank == null) {
            throw new NullPointerException("Both suit and rank must be defined.");
        }
        this.suit = suit;
        this.rank = rank;
    }


    public Suit getSuit() {
        return this.suit;
    }

    public Rank getRank() {
        return this.rank;
    }


    @Override
    public int compareTo(Card52 o) {
        int rankDiff = o.rank.ordinal() - this.rank.ordinal();
        if(rankDiff != 0) {
            return rankDiff;
        } else {
            return this.suit.ordinal() - o.suit.ordinal();
        }
    }

    @Override
    public String toString() {
        String out = "[";
        
        switch (rank) {
            case ACE:
                out += 'A';
                break;
            case KING:
                out += 'K';
                break;
            case QUEEN:
                out += 'Q';
                break;
            case JACK:
                out += 'J';
                break;
            case TEN:
                out += 'T';
                break;
            case NINE:
                out += '9';
                break;
            case EIGHT:
                out += '8';
                break;
            case SEVEN:
                out += '7';
                break;
            case SIX:
                out += '6';
                break;
            case FIVE:
                out += '5';
                break;
            case FOUR:
                out += '4';
                break;
            case THREE:
                out += '3';
                break;
            case TWO:
                out += '2';
                break;
        }
        
        switch(suit){
            case SPADE:
                out += 'S';
                break;
            case HEART:
                out += 'H';
                break;
            case DIAMOND:
                out += 'D';
                break;
            case CLUB:
                out += 'C';
                break;
        }

        out += ']';
        return out;
    }
    
}
