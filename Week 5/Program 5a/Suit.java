package edu.ics211.h07;

import java.util.Random;

/**
 * Represents a Suit.
 *
 * @author Cam Moore
 *
 */
public enum Suit {
  CLUBS, DIAMONDS, HEARTS, SPADES;

  /**
   * Returns a random Suit.
   * 
   * @return a random Suit.
   */
  public static Suit getRandomSuit() {
    Random random = new Random();
    return values()[random.nextInt(values().length)];
  }
}
