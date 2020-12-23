/**
 * Assuming we have data of A B C D E F  (not hashed for simplicity)
 * Each letter is a key value of the Hashtable.  Originally, all keys have a value of "".
 * When the next key is created, the previous key with the value "" will now have the value of the current key.
 * That way each data also has a link to the next piece of data.
 */
import java.util.*;

public class HashTable{
    public static void main(String[] args){
        Hashtable<String, String> table = new Hashtable<>();
        Scanner in = new Scanner(System.in);

        String prevKey = "", key = "", firstKey = "";

        System.out.println("What is the value?");
        key = in.nextLine();
        //gets values for the table
        while(!key.equals("-1")){
            table.put(key, "");
            if(!prevKey.equals("")){
                table.replace(prevKey, key);
            }
            else{
                firstKey = key;
            }
            prevKey = key;
            
            System.out.println("What is the value?  Enter -1 to quit");
            key = in.nextLine();
        }

        in.close();
        key = firstKey;

        //displays table values
        //the next data is obtained by using they key's value
        while(!table.get(key).equals("")){
            System.out.println("Value: "+key+" Next: "+table.get(key));
            key = table.get(key);
        }
        System.out.println("Value: "+key+" Next: "+table.get(key));

    }
}