import java.util.ArrayList;

public class World {
    String name;
    private ArrayList<Location> places;

    public World(String name) {
        this.name = name;
        places = new ArrayList<Location>();
    }
}
