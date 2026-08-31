package ClassObject;

public class Test {
    public static void main(String[] args) {
        Book book1=new Book();
        book1.id=101;
        book1.author="Robert Kiyosaki";
        book1.title="Rich dad poor dad";
        book1.print();
        book1.show("Tell me your dreams");
        String temp=book1.display("High living");
        System.out.println(temp);
        System.out.println(book1.display("High living"));
        Book book2=new Book();;
        book2.id=102;
        Book book3=new Book("Agile","Upasana",102);
        Book book4=new Book("Agile","Upasana");
    }

}
