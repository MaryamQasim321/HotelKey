public class Bag {

    private int bagId;
    public Bag(int bagId){
        this.bagId=bagId;
    }


    public void setBagId(int bagId) {
        this.bagId = bagId;
    }

    public int getBagId() {
        return bagId;
    }
    @Override
    public String toString() {
        return "bag's id is:" + bagId;
    }
}
