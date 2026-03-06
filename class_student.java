//Topic:clas attribute and static vs instance variables
class student{
    static String collegeName ="Amity University";
    String name;
    int rollno;
    String department;
    String email;
    double cgpa;

    public student(String n, int r, String dept, String mail, double g) {
        this.name=n;
        this.rollno=r;
        this.department=dept;
        this.email=mail;
        this.cgpa=g;
    }

    public student(string n, int r, string cse, string mail, double g) {
    }

    public void displayDetails(){
        System.out.println("college:"+collegeName);
        System.out.println("name:"+name);
        System.out.println("dept:"+department);
        System.out.println("mail:"+email);
        System.out.println("g:"+cgpa);
        System.out.println("----------------------");
    }
}
public class StudentData {
    public static void main(String[] args){
        student s1=new student("Arjun",101,"CSE","arjun@amity.edu",8.9);
        student s2=new student("Priya",102,"ECE","priya@amity.edu",9.2);
        s1.displayDetails();
        s2.displayDetails();
    }
}
