package collectionExamples;

public class Book {
    int id;
    String title;
    String author;
    //public Book() {}
    public Book() {
        System.out.println("Book Constructor");
    }
    public Book(String t, String author, int id) {
        System.out.println("Book Constructor");
        this.title=t;
        this.author=author;
    }
    public Book(String t, String author) {
        System.out.println("Book Constructor");
        this.title=t;
        this.author=author;
    }
    //accepts nothing returns nothing
    public void print(){
        System.out.println("book with id "+id+" " +
                "and title "+title+" was written by "+author);

    }
    //accepts something returns nothing
    public void show(String title){
        this.title=title;
        System.out.println(title);
    }
    //accepts something returns something
    public String display(String title){
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
