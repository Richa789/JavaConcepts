package practice;

public class BookDetails {
    String bookname;
    String author;
    int bookpages;
    int bookprice;
    public BookDetails(String bname, String bauthor, int bpages, int bprice) {
        bookname = bname;
        author = bauthor;
        bookpages = bpages;
        bookprice = bprice;
    }
    public static void main(String[] args) {
        BookDetails bookobject = new BookDetails("I Miss You","Richa Shekhar",500,800);
        System.out.println("Book name is " + bookobject.bookname);
        System.out.println("Author of book is " + bookobject.author);
        System.out.println("Book contains " + bookobject.bookpages + " pages");
        System.out.println("The price of book is Rs."+ bookobject.bookprice);
    }
}
