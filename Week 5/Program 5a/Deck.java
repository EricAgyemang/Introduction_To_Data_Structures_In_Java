package edu.ics211.h07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Represents a Deck.
 *
 * @author Cam Moore
 *
 */
public class Deck {
  private ArrayList<Card> cards;

  /**
   * Creates a new 52 card Deck.
   *
   */
  public Deck() {
    // initialize the member variable
    cards = new ArrayList<Card>();
    for (Suit s : Suit.values()) {
      for (Rank r : Rank.values()) {
        cards.add(new Card(s, r));
      }
    }
  }


  /**
   * Creates a new Deck from the array of cards.
   *
   * @param cards the cards to add to the deck.
   */
  public Deck(Card[] cards) {
    this.cards = new ArrayList<Card>();
    for (Card c : cards) {
      this.cards.add(c);
    }
  }


  /**
   * Returns a single card from the top of the deck.
   * 
   * @return a single card from the top of the deck.
   */
  public Card dealACard() {
    Card card = cards.remove(0);
    return card;
  }


  /**
   * Returns n cards from the top of the deck as a List.
   * 
   * @param n the number of cards to deal.
   * @return n cards from the top of the deck as a List.
   */
  public List<Card> dealNCards(int n) {
    ArrayList<Card> retVal = new ArrayList<Card>();
    for (int i = 0; i < n; i++) {
      retVal.add(cards.remove(0));
    }
    return retVal;
  }


  /**
   * Returns the number of cards remaining in this deck.
   * 
   * @return the number of cards remaining in this deck.
   */
  public int size() {
    return cards.size();
  }


  public void shuffle() {
    Random random = new Random();
    for (int i = 0; i < cards.size(); i++) {
      int randomIndex = i + random.nextInt(cards.size() - i);
      Card temp = cards.get(randomIndex);
      cards.set(randomIndex, cards.get(i));
      cards.set(i, temp);
    }
  }


  @Override
  public String toString() {
    return "Deck [cards=" + cards + "]";
  }

}
