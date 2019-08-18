package utilities;

public class Card{
  private CardNipes nipe;
  private CardValues value;

  public Card(CardNipes nipe,CardValues value){
    this.nipe = nipe;
    this.value = value;
  }
  @Override
  public String toString() {
    return "" + this.value + " " + this.nipe;
  }

  public CardNipes getNipe(){
    return this.nipe;
  }

  public CardValues getValue(){
    return this.value;
  }
}