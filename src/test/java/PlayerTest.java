import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Hand hand;
    Card card;

    @Before
    public void before() {
        player = new Player("Frank");
        hand = new Hand();
        card = new Card( Suit.SPADES, Rank.ACE);

    }

    @Test
    public void addCardToHand(){
        player.addCardToHand(card);
        assertEquals(1, player.getHand().getSize());
    }
}
