package practice;

public class StudentDetails {
    String studentname;
    int studentage;
    int studentid;
    float percentage;
    public StudentDetails(String studentname) {
        this.studentname = studentname;
    }
    public StudentDetails(String studentname, int studentage) {
        this.studentname = studentname;
        this.studentage = studentage;
    }
    public StudentDetails(float percentage, int studentid) {
        this.percentage = percentage;
        this.studentid = studentid;
    }
    public static void main(String[] args) {
        StudentDetails studentobject = new StudentDetails("Richa");
        studentobject.display();
        StudentDetails secondobject = new StudentDetails("Richa",25);
        secondobject.display2();
        StudentDetails thirdobject = new StudentDetails(85.6f,3082);
        thirdobject.display3();
    }
    public void display() {
        System.out.println("Student name is "+ studentname);
    }
    public void display2() {
        System.out.println("Student name is "+ studentname +" and her age is "+studentage);
    }
    public void display3() {
        System.out.println("Her id is " + studentid +" and she scored " + percentage);
    }
}
