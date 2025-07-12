class BSTExercise131415 {
    static BSTExercise131415 root;
    private int number;   //data
    BSTExercise131415 right;
    BSTExercise131415 left;
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public BSTExercise131415(int number){
        this.number=number;
    }



    public  static void insert(int number){
        root=add( number, root);
    }
    public static BSTExercise131415 add(int number, BSTExercise131415 root){

        if(root==null){
            BSTExercise131415 newNode=new BSTExercise131415(number);
            return newNode;
        }


            if(number<root.getNumber()){
                root.left=add(number, root.left);
            }
            else if(number>root.getNumber()){
                root.right=add(number,root.right);
        }
return root;
    }

    public static void inOrder(BSTExercise131415 root){
        if(root!=null) {
            inOrder(root.left);
            System.out.println(root.getNumber());
            inOrder(root.right);
        }
    }
public static void inorderTraversal(){
        inOrder(root);
        }

public static boolean searchNode(int number){


        return search(root, number);
}
public static boolean search(BSTExercise131415 root, int target){
        if(root.getNumber()==target) {
            return true;
        }
        else if(target< root.getNumber()){
            return search(root.left, target);
        }
        else if(target> root.getNumber()){
            return search(root.right, target);
        }
        return false;
}
    public static void main(String[] args) {



        System.out.println("inserting and showing nodes in bst");
        //BST Exercise 13: Binary Search Tree (BST) Insertion: Create a basic Node class.
        // Write a program that creates a BST of reservation confirmation numbers (integers).
        // Implement an insert method that adds new numbers to the tree correctly.
        BSTExercise131415.insert(89 );
        BSTExercise131415.insert(3 );
        BSTExercise131415.insert(8 );
        BSTExercise131415.insert(2 );
        BSTExercise131415.insert(10 );
        //exercise 14
        BSTExercise131415.inorderTraversal();
        //exercise 15
        System.out.println(BSTExercise131415.searchNode(2));




    }
}