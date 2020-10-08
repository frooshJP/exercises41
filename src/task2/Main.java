
package task2;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Room room1 = new Room(4, 1, 2, 3);
        Room room2 = new Room(3, 0, 22, 0);
        Room room3 = new Room(7, 4, 2, 5);

            List<Room> rooms = new ArrayList<Room>();
                rooms.add(room1);
                rooms.add(room2);
                rooms.add(room3);

        int sumLamps = 0;
        Building building1 = new Building(rooms, 5, 22, false);
        for (int i = 0; i < rooms.size(); i++) {
           sumLamps += rooms.get(i).getNumberOfLamps();
        }
        System.out.println(sumLamps);

        if(building1.getNumberOfFloors() > rooms.size()){
            System.out.println("This is an odd building");
        }

    }

}

