package objectcasting;

public class qspiders {
    public static void main(String[] args){
        admin a1 = new student();
        a1.viewing();
        a1.editing();
        student s1 = (student) a1;
        s1.viewing1();
        s1.editing();

    }

}
class admin {
    public void viewing() {
        System.out.println("Admin Can view updates");
    }
    public void editing() {
        System.out.println("Student can edit");
    }
}
class student extends admin {
    public void viewing1() {
        System.out.println("Student Can view updates");
    }
    public void editing() {
        System.out.println("Only admin can edit");
    }
}


