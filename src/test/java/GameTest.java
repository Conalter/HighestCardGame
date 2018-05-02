import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player player1;
    Player player2;
    Deck deck;


    @Before
    public void before() {
        game = new Game("Game One", deck);
        player1 = new Player("David");
        player2 = new Player("Steve");
    }

    @Test
    public void getGameName() {
        assertEquals("Game One", game.getGameName());
    }

    @Test
    public void getNumberOfPlayers() {
        assertEquals(0, game.getNumberOfPlayers());
    }

    @Test
    public void addPlayer() {
        game.addPlayer(player1);
        assertEquals(1, game.getNumberOfPlayers());
        assertEquals("David", game.getPlayers().get(0).getName());
    }

    @Test
    public void getEnoughPlayers__No() {
        assertEquals(false, game.enoughPlayers());
    }

    @Test
    public void getEnoughPlayers__Yes() {
        game.addPlayer(player1);
        game.addPlayer(player2);
        assertEquals(true, game.enoughPlayers());
    }

    @Test
    public void getPlayGame(){
        game.addPlayer(player1);
        game.addPlayer(player2);
        deck.dealCard(player1);
        deck.dealCard(player2);
        assertEquals(50, deck.getNumberOfCards());
    }
}

