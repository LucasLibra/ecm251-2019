package game.poker;

import java.util.ArrayList;
import java.util.List;

import utilities.Card;

public class Hand {
  private List<Card> cards;
  
  public Hand(List<Card> CardList) {
    this.cards = CardList;
  }

  public List<Card> getHand(){
    return this.cards;
  }

  public boolean isPair(){
    int counter = 0;
    for (Card cardOne : this.cards){
      for(Card cardTwo: this.cards){
        if(!cardOne.equals(cardTwo)){
          if(cardOne.getValue().equals(cardTwo.getValue())){
            counter++;
          }
        }
      }
      if(counter == 1){
        return true;
      }
    }
    return false;
  }
  public boolean isThreeOfAKind(){
   int counter = 0;
   for (Card cardOne : this.cards){
      for(Card cardTwo: this.cards){
        for(Card cardThree: this.cards){
          if(!cardOne.equals(cardTwo) & !cardOne.equals(cardThree) & !cardTwo.equals(cardThree)){
            if(cardOne.getValue().equals(cardTwo.getValue()) & cardOne.getValue().equals(cardThree.getValue())){
              counter++;
            }
          }
        }
      }
   }
   if(counter == 1){
        return true;
  }
   return false; 
  }

  public boolean isTwoPair(){
    int counter = 0;
    for (Card cardOne : this.cards){
      for(Card cardTwo: this.cards){
        if(!cardOne.equals(cardTwo)){
          if(cardOne.getValue().equals(cardTwo.getValue())){
            counter++;
          }
        }
      }
    }
    if(counter == 4){
        return true;
    }
    return false;
  }
  
  public boolean isFourOfAKind(){
  int counter = 0;
   for (Card cardOne : this.cards){
      for(Card cardTwo: this.cards){
        for(Card cardThree: this.cards){
          for(Card cardFour: this.cards)
          if(!cardOne.equals(cardTwo) & !cardOne.equals(cardThree) & !cardTwo.equals(cardThree) & !cardOne.equals(cardFour) & !cardTwo.equals(cardFour) & !cardThree.equals(cardFour)){
            if(cardOne.getValue().equals(cardTwo.getValue()) & cardOne.getValue().equals(cardThree.getValue()) & cardOne.getValue().equals(cardFour.getValue())){
              counter++;
            }
          }
        }
      }
      if(counter == 1){
        return true;
      }
   }
   return false; 
  }

  public boolean isFlush(){
    int counter = 0;
    for (Card cardOne : this.cards){
      for(Card cardTwo: this.cards){
        for(Card cardThree: this.cards){
          for(Card cardFour: this.cards){
            for(Card cardFive: this.cards)
              if(!cardOne.equals(cardTwo) & !cardOne.equals(cardThree) & !cardTwo.equals(cardThree) & !cardOne.equals(cardFour) & !cardTwo.equals(cardFour) & !cardThree.equals(cardFour) & !cardOne.equals(cardFive) & !cardTwo.equals(cardFive) & !cardThree.equals(cardFive) & !cardFour.equals(cardFive)){
                if(cardOne.getNipe().equals(cardTwo.getNipe()) & cardOne.getNipe().equals(cardThree.getNipe()) & cardOne.getNipe().equals(cardFour.getNipe()) & cardOne.getNipe().equals(cardFive.getNipe())){
                   counter++;
            }
          }
          }
        }
      }
  }
  if(counter == 1){
        return true;
  }
   return false; 
  }
}