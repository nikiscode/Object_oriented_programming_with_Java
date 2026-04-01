//Topic:class attributes and static vs instance variables

class employe{
    static String collegeName ="Content Stack";
    String name;
    int id;
    String department;
    String email;
    double salary;

    public employe(String n, int r, String dept, String mail, double s){
        this.name=n;
        this.id=r;
        this.department=dept;
        this.email=mail;
        this.salary=s;
    }

    public employe(string n, int i, string cse, string mail, double s) {
    }

    public void displayDetails(){
        System.out.println("college:"+collegeName);
        System.out.println("name:"+name);
        System.out.println("i:"+id);
        System.out.println("dept:"+department);
        System.out.println("mail:"+email);
        System.out.println("s:"+salary);
        System.out.println("----------------------");
    }
}
public class employedata{
    public static void main(String[] args){
        student s1=new student("Ravi", 1891,"backend developer","arjun@amity.edu",40000);
        student s2=new student("Priya",1242,"frontend developer","priya@amity.edu",30000);
        s1.displayDetails();
        s2.displayDetails();
    }
}
