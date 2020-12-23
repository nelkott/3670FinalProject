/**
 * This class implements the Tree class.
 * A Tree is created using some data, the user can then try checking if a block
 * exists in this tree by specifying block value and index.
 * A temporary tree is created based on the original one except that the new value replaces
 * the value inside the index the user specified.
 * The root hashes of both trees are compared and whether it matches or not, the user is informed.
 */
import java.util.*;

public class Bst {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //data
        //make sure they dont exceed 8
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        //orginal tree
        Tree tree = new Tree();

        try{
            tree.createTree(list);

            System.out.println("What is the value of this block?");
            String block = in.nextLine();

            System.out.println("What index is it in? From 1 to "+list.size());
            int index = in.nextInt();
            
            if(index > 0 && index <= list.size()){
                Tree temp = new Tree();
                List<String> tempList = list.subList(0, list.size());
                tempList.set(index-1, block);
                temp.createTree(tempList);

                if(tree.getRoot().equals(temp.getRoot())){
                    System.out.println("A match!");
                }
                else{
                    System.out.println("Fail!");
                }
            }
            else{
                System.out.println("Your index is wrong!");
            }

            in.close();
        }
        catch(Exception NoSuchAlgorithmException){
        }

    }
}
