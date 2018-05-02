import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Player player;

    @Before
    public void before(){
        deck = new Deck();
        player = new Player("Frank");
    }

    @Test
    public void deckShouldHave52Cards(){
        assertEquals(52, deck.getNumberOfCards());
    }

    @Test
    public void deckShouldHaveLessOneCard(){
        deck.dealCard(player);
        assertEquals(51, deck.getNumberOfCards());
    }
}
