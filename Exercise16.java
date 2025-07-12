import java.util.ArrayList;
import java.util.LinkedList;


//exercise 16,17,19,20
//exercise 18 is in Guests class

public class Exercise16 {

    //exercise 19
    static class RoomNotAvailableException extends Exception{
        public RoomNotAvailableException(String message){
            super(message);
        }
    }
    static class Hotel{

    static ArrayList<Room> rooms=new ArrayList<>();
    static LinkedList<Guests> waitList=new LinkedList<>();
    //Exercise 16 and 20:
        //modified checkin(exercise 120)
    public static void checkIn(Guests guest){
        for(Room room:rooms){
            if(room.isOccupied==false){
                room.isOccupied=true;
                System.out.println("room number :"+room+" assigned");
                return;
            }
            }
                waitList.add(guest);
            System.out.println("all rooms already occupied");
    }
        public static void displayGuestsInWaitList(){
            System.out.println("displaying guests in waiting list:");
        for(Guests guest: waitList){
                System.out.println(guest);
            }
        }
        public static void checkInRoom(int roomNumber) throws RoomNotAvailableException{
            for(Room room:rooms){
                if(room.getRoomNumber()==roomNumber){
                    if(room.isOccupied==true){
                        throw new RoomNotAvailableException( roomNumber+ " room is not available");
                    }
                    room.isOccupied=true;
                    System.out.println("room number :"+roomNumber+" assigned");
                    return;
                }
            }
            System.out.println("all rooms already occupied");
        }


        public static void addRoom(int roomNumber){
           rooms.add(new Room(roomNumber));
        }

    }


    public static void main(String[] args) {
        Hotel hotel=new Hotel();
        Hotel.addRoom(1);
        Hotel.addRoom(2);
        Hotel.addRoom(3);
        //Exercise 16: assigning available rooms to guests
        Hotel.checkIn(new Guests(1));
        Hotel.checkIn(new Guests(2));
        Hotel.checkIn(new Guests(3));
        Hotel.checkIn(new Guests(4));

        //Exercise 19: assigning specific rooms to guests
        try {
            Hotel.checkInRoom(1);
        } catch (RoomNotAvailableException e) {
            System.out.println(" "+ e.getMessage());
        }
    //displaying guests in waiting list
        Hotel.displayGuestsInWaitList();
    }
}
