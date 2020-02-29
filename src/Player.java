package pokemoncloneworkspace.src;

public class Player {

    // Instance variables
    String name;
    Pair<Integer, Integer> position;
    
    // Constructor Declaration of Class
    public Player(String name, Pair <Integer, Integer> position) {
        this.name = name;
        this.position = position;
    }

    public Pair getPosition() {
        return this.position;
    }
    
    public void setPosition(Pair <Integer, Integer> newPosition) {
        this.position = newPosition;
    }

    public static void render() {
        System.out.println("Player rendered");
    }

}