package game.poker;

import utilities.Card;
import utilities.Deck;

public class Game{
  private Deck deck;
  private Dealer dealer;
  private Hand hand;

  public Game(){
    this.deck = new Deck();
    this.dealer = new Dealer();
  }
  public void play(){
    while(true){
      System.out.println("Cards on Deck: " + deck.showCards().size());
      hand = dealer.deal(deck);
      for(Card card : hand.getHand()){
        System.out.println("Card: " + card);
      }
      System.out.println("Cards on Deck: " + deck.showCards().size());
      System.out.println("Does it have a pair? " + hand.isPair());
      System.out.println("Does it have a Three of a Kind ? " + hand.isThreeOfAKind());
      System.out.println("Does it have Two Pairs ? " + hand.isTwoPair());
      System.out.println("Does it have a Four of a Kind? " + hand.isFourOfAKind());
      System.out.println("Does it have a Flush? " + hand.isFlush());
      System.out.println("\n"); 
    }
  }
  }
