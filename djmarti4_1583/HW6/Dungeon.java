public class Dungeon {

    private Room balcony = new Room();
    private Room bedroom1 = new Room();
    private Room bedroom2 = new Room();
    private Room dining = new Room();
    private Room kitchen = new Room();
    private Room northHall = new Room();
    private Room southHall = new Room();


    Dungeon() {

        balcony.setDescription("Balcony");
        balcony.setExits(null, null, null, northHall);

        northHall.setDescription("northHall");
        northHall.setExits(balcony, kitchen, bedroom1, southHall);

        southHall.setDescription("southHall");
        southHall.setExits(northHall, dining, bedroom2, null);

        bedroom1.setDescription("Bedroom1");
        bedroom1.setExits(null, northHall, null, bedroom2);

        bedroom2.setDescription("Bedroom2");
        bedroom2.setExits(bedroom1, southHall, null, null);

        dining.setDescription("Dining");
        dining.setExits(kitchen, null, southHall, null);

        kitchen.setDescription("Kitchen");
        kitchen.setExits(null, null, northHall, dining);
    }

    public Room getRoom0() {
        return northHall;
    }

}
