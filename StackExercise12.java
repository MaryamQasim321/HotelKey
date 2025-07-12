import java.util.Stack;

public class StackExercise12 {

static Stack<Bag> bags=new Stack<>();




    public static void pushBag(int bagId){
    Bag bag = new Bag(bagId);
    bags.push(bag);


}


    public static void popBag(){


        bags.pop();
    }

    public static void display(){

    for (Bag bag: bags){
        System.out.println(" " + bag);
    }
    }

    public static void main(String[] args) {
        StackExercise12 stackExercise=new StackExercise12();
        stackExercise.pushBag(1);
        stackExercise.pushBag(2);
        stackExercise.pushBag(3);
        stackExercise.pushBag(4);
        stackExercise.pushBag(5);
        stackExercise.popBag();
        stackExercise.popBag();
        System.out.println("displaying all bags");

        stackExercise.display();
    }
}
