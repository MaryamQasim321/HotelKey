import java.util.Objects;

class Guests{
    private int guestNumber;
    private String guestName;


    Guests(int guestNumber){
        this.guestNumber=guestNumber;
    }
    public int getGuestNumber() {
        return guestNumber;
    }

    public void setGuestNumber(int guestNumber) {
        this.guestNumber = guestNumber;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    @Override
    public String toString() {
        return "guest number:" + getGuestNumber();
    }
    @Override
    public int hashCode() {
        return Objects.hash(guestName); // based on what equals uses
    }


    //exercise 18

    @Override
    public boolean equals(Object obj) {
         Guests guest = (Guests)obj;

        return guest.guestName==this.guestName;
    }

    public static void main(String[] args) {
        Guests guest1=new Guests(1);
        Guests guest2=new Guests(2);
        Guests guest3=new Guests(3);
        guest1.setGuestName("Mughees");
        guest2.setGuestName("Mughees");
        guest3.setGuestName("Maryam");
        System.out.println(guest1.equals(guest2));
        System.out.println(guest1.equals(guest3));

    }
}
