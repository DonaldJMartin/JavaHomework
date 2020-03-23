public class Room {

    private String description;
    private Room north;
    private Room east;
    private Room west;
    private Room south;

    public Room() {
    }

    Room(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Room getNorth() {
        return north;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public Room getEast() {
        return east;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public Room getWest() {
        return west;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public Room getSouth() {
        return south;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public String getExits() {
        String exits = "There are exits";
        if(north != null) {
            exits = exits + " north";
        }
        if(east != null) {
            exits = exits + " east";
        }
        if(west != null) {
            exits = exits + " west";
        }
        if(south != null) {
            exits = exits + " south";
        }
        return exits;
    }

    public void setExits(Room north, Room east, Room west, Room south){
        this.north = north;
        this.east = east;
        this.west = west;
        this.south = south;
    }

    @Override
    public String toString() {
        return "You are in " +
                description + ". Your exits are " + getExits();
    }
}
