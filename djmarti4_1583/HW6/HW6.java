import java.util.Scanner;

public class HW6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Dungeon castle = new Dungeon();

        Room player = new Room();
        player = castle.getRoom0();

        boolean run = true;

        System.out.println("Where would you like to go?");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Type the first letter of the action (ex. n will move you north.)");


        while(run) {

            System.out.println("north, east, west, south & quit");
            System.out.println(player);
            String userInput = input.next();

            if (userInput.equals("n")){

                if(player.getNorth() != null) {
                    player = player.getNorth();
                }

                else {
                    System.out.println("You can not move here! Try again.");
                }
            }

            else if (userInput.equals("e")) {
                if(player.getEast() != null) {
                    player = player.getEast();
                }
            }


            else if (userInput.equals("w"))
            {
                if(player.getWest() != null) {
                    player = player.getWest();
                }
            }

            else if (userInput.equals("s"))
            {
                if(player.getSouth() != null) {
                    player = player.getSouth();
                }
            }


            else if (userInput.equals("q"))
            {
                run = false;
                System.out.println("Thank you for playing. See you next time!");
            }

            else {

                System.out.println("You can not move here! Try again.");
            }
        }

    }


}
