public class Room{
    private  int roomNumber;
    boolean isOccupied;
    public Room(int roomNumber){
        this.roomNumber= roomNumber;

    }
    public int getRoomNumber(){
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return " "+ getRoomNumber();
    }
}
