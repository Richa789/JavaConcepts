package practice;

public class DefaultBook {
    String bname;
    int bprice;
    public DefaultBook(String bname, int bprice) {
        this.bname = bname;
        this.bprice = bprice;
    }
    public void display() {
        System.out.println(bname + bprice);
    }
    public static void main(String[] args) {
      DefaultBook defaultobject = new DefaultBook("Java",500);
      defaultobject.display();
      DefaultBook bookobject = new DefaultBook("SQL",300);
      bookobject.display();
    }
}
