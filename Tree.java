import java.util.*;
import java.security.*;

public class Tree {
    private String root;
    private String[] hashes = new String[14];
    private int count = 0;

    public void createTree(List<String> leaves) throws NoSuchAlgorithmException {

        if (count > 0) {
            count = 0;
        }

        for (String leaf : leaves) {
            hashes[count++] = hash(leaf);
        }

        root = createNodes(0, count - 1);
    }

    private String createNodes(int start, int end) throws NoSuchAlgorithmException {
        if (end - start == 1) {
            return hash(hashes[start] + hashes[end]);
        }

        while (start <= end) {
            String left = hashes[start++];
            String right = "";

            if (start <= end) {
                right = hashes[start++];
            }

            hashes[count++] = hash(left + right);
        }

        return createNodes(start, count - 1);
    }

    private String hash(String toHash) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(toHash.getBytes());
        String stringHash = new String(messageDigest.digest());

        return stringHash;
    }

    public String getRoot(){
        return root;
    }

}