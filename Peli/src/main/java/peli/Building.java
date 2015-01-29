package peli;

public class Building {

    private int x;
    private int y;
    private String nimi;
    private Player player; // owner

    public Building(int x, int y, String nimi, Player player) {
        this.x = x;
        this.y = y;
        this.nimi = nimi;
        this.player = player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

}
