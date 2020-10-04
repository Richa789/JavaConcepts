package practice;

public class NoArgsConstructorExample {
    String dogname;
    String dogcolor;
    public NoArgsConstructorExample() {
        dogname = "Tommy";
        dogcolor = "Brown";
    }
    public static void main(String[] args) {
        NoArgsConstructorExample object = new NoArgsConstructorExample();
        System.out.println("Dog's name is "+ object.dogname);
        System.out.println("Dog's color is "+ object.dogcolor);
    }
}
