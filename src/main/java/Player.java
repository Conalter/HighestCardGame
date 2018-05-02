public class Player {

    private String name;
    private Hand hand;

    public Player(String name){
        this.name = name;
        this.hand = new Hand();
    }

    public String getName() {
        return name;
    }

    public void addCardToHand(Card cardToDeal) {
        this.hand.getHand().add(cardToDeal);
    }

    public Hand getHand() {
        return hand;
    }
}
