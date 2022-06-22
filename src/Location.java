import java.util.ArrayList;

public class Location {
    String name;
    String description;
    ArrayList<String> directions;
    ArrayList<Location> places;

    public Location(String name) {
        this.name = name;
        description = "";
        directions = new ArrayList<String>();
    }

    public void addDescription(String d) {
        description = d;
    }

    public String getName() {
        return name;
    }

    public void describe() {
        System.out.print(name);
        System.out.print(description);
        for (int i=0; i<directions.size(); i++) {
            System.out.println(directions.get(i) + " leads to " + places.get(i));
        }
    }

    public void addExit(String direction, Location place) {
        boolean found = false;
        for (int i=0; i<directions.size(); i++) {
            if (directions.get(i).equals(direction)) {
                places.set(i, place); // replace with this place!
                found = true;
            }
        }
        if (!found) {
            // add a new direction
            directions.add(direction);
            places.add(place);
        }
    }
}
