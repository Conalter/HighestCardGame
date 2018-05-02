import java.util.ArrayList;

public class Game {
        private String name;
        private Deck cards;
        private ArrayList<Player> players;

    public Game(String name, Deck cards){
        this.name = name;
        this.cards = cards;
        this.players = new ArrayList<>();
    }

    public String getGameName(){
        return this.name;
    }

    public int getNumberOfPlayers(){
        return this.players.size();
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public boolean enoughPlayers(){
        if (this.players.size() > 1){
            return true;
        }
        return false;
    }

    public void compareHands(){

    }


}
