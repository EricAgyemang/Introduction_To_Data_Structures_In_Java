package edu.ics211.h07;

import java.util.Random;

/**
 * Represents a Rank.
 *
 * @author Cam Moore
 *
 */
public enum Rank {
  TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
  
  public static Rank getRandomRank() {
    Random random = new Random();
    return values()[random.nextInt(values().length)];
  }
}
