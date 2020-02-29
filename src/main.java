package pokemoncloneworkspace.src;

public class main {
    
    Pair temppair = new Pair(0,0);
    Player player = new Player("test", temppair);

    public void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(player.getLeft()[0].ToString());
    }
}