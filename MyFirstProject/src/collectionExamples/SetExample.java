package collectionExamples;

import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet();
        hs.add("Virat");
        hs.add("uppu");
        hs.add("tippu");
        hs.add("chotu");
        hs.add("chotu");
        hs.add("motu");
        System.out.println(hs);
        TreeSet<String> ht=new TreeSet();
        ht.add("virat");
        ht.add("uppu");
        ht.add("tippu");
        ht.add("chotu");
        ht.add("chotu");
        ht.add("motu");
        System.out.println(ht);




    }
}
