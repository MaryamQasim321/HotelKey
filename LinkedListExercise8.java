import java.util.LinkedList;


public class LinkedListExercise8 {
static LinkedList<Room> rooms=new LinkedList<>();
public void addRoom(int roomNumber){
    rooms.add(new Room(roomNumber));
}
public void clean(int roomNumber){
    for(Room room : rooms){
        if(room.getRoomNumber()==roomNumber){
            rooms.remove(room);
        }
    }
}
public static void display(){
    System.out.println("displaying rooms");
    for (Room room : rooms) {
        System.out.println( "room number:" + room);
    }
}

    public static void main(String[] args) {
        //linkedlist exercise8
        LinkedListExercise8 linkedListExercise=new LinkedListExercise8();
        linkedListExercise.addRoom(1);
        linkedListExercise.addRoom(2);
        linkedListExercise.addRoom(3);
        linkedListExercise.addRoom(4);
        linkedListExercise.clean(1);
        linkedListExercise.display();
    }
}