import java.util.LinkedList;
import java.util.Queue;

public class binaryTree<E extends Comparable> {

    private BinaryNode<E> root;

    // default constructor
    public binaryTree(){
        root = null;
    }

    // insert item into binary tree
    public void insert(E item) {

        // if the tree is empty, then create a binary node
        // as the root with item in it
        if (root == null) {
            root = new BinaryNode<E>(item);
            return;
        }

        // insert item as a node using the order relation
        root.insert(item);
    }

    // print tree in inorder
    public String inorder(){
        String Result = "";
        if (root == null){
            return Result;
        }

        // call recursive BinaryNode inorder()
        return root.inorder();
    }


}