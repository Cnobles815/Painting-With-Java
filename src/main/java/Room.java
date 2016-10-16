import java.util.ArrayList;

/**
 * Created by christophernobles on 10/15/16.
 */
public class Room {
    ArrayList<Window> windowList = new ArrayList<Window>();
    ArrayList<Door> doorList = new ArrayList<Door>();

    Room(int windowNumber, int doorNumber){
        for(int i = 0; i < windowNumber; i++){
            Window window = new Window();
            windowList.add(i, window);
        }
        for(int i = 0; i < doorNumber; i++){
            Door door = new Door();
            doorList.add(i, door);
        }
    }
}
