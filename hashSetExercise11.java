import java.util.HashSet;

    public class hashSetExercise11 {

       static class Hotel {
            HashSet<String> amenities = new HashSet<>();
            public Hotel() {
                amenities = new HashSet<>();
            }
            public void addAmenity(String amenity) {
                boolean added = amenities.add(amenity);
                if (added) {
                    System.out.println(amenity + " added");
                } else {
                    System.out.println(amenity +" amenity was already present");
                }
            }
            public void showAmenities(){
                for (String amenity: amenities){
                    System.out.println(" " + amenity);
                }
            }
        }
        public static void main(String[] args) {
            Hotel hotel=new Hotel();
            hotel.addAmenity("WiFi");
            hotel.addAmenity("gym");
            hotel.addAmenity("pool");
            hotel.addAmenity("pool");
            hotel.showAmenities();
        }
    }

