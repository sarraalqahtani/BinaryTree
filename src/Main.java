import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.TreeVisitor;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // create empty myTree
        binaryTree<Integer> myTree = new binaryTree<Integer>();
        Scanner keyboard = new Scanner(System.in);
        // create a number of random integers and insert them into myTree
        for (int i=0; i< 5; i++){

            // generate random number in range [-15, 50] in Java
            System.out.print("Enter item #"+i+": ");
            int randValue = keyboard.nextInt();

            // insert each into myTree
            myTree.insert(randValue);
        }

        //System.out.println(myTree);
        System.out.print("The nodes of tree are (inorder): ");
        System.out.println(myTree.inorder());

    }
}