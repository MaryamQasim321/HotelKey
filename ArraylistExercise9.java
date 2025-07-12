import java.util.ArrayList;

public class ArraylistExercise9 {
static ArrayList <Guests> guests=new ArrayList<>();
public static void addGuests(int guestNumber){
    guests.add(new Guests(guestNumber));


}
    public static void removeSecond(){
        guests.remove(1);

    }

    public static void display(){
        for (Guests guest : guests){
            System.out.println(guest);
        }

    }


    public static void main(String[] args) {
        addGuests(1);
        addGuests(2);
        addGuests(3);
        addGuests(4);
        addGuests(5);
        removeSecond();
        display();
    }

}
