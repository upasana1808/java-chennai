package collectionExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList list=new ArrayList(10);  //int Integer  Char Character
        list.add("uppu");
        list.add(1234);
        list.add(true);
        list.add(12.55f);
        System.out.println(list);
        ArrayList<String> list1=new ArrayList();  //int Integer  Char Character
        list1.add("uppu");
        list1.add("tippu");
        list1.add("chotu");
        list1.add("motu");
        System.out.println(list1);
        ArrayList<Book> bookList=new ArrayList();  //int Integer  Char Character
        bookList.add(new Book("aaa","aaa",12));
        bookList.add(new Book("bbb","bbb",12));
        bookList.add(new Book("ccc","ccc",12));
        System.out.println(bookList);

        Iterator<Book> itr=bookList.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }


    }
}
