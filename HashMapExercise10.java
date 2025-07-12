import java.util.HashMap;

public class HashMapExercise10 {
    static HashMap<Integer, Guests> roomMap = new HashMap<>();
    public static void mapRoom ( int roomNumber){
        if (roomMap.containsKey(roomNumber)) {
            Guests guest = roomMap.get(roomNumber);
            System.out.println("room " + roomNumber + " occupied by:" + guest);

        } else {
            System.out.println("not occupied");
        }
    }
    public static void main(String[] args) {
        Guests guest1 = new Guests(5);
        Guests guest2 = new Guests(6);
        Guests guest3 = new Guests(7);
        roomMap.put(1, guest1);
        roomMap.put(2, guest2);
        roomMap.put(3, guest3);
        mapRoom(1);
        mapRoom(2);
        mapRoom(3);
    }
}