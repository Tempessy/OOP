package Class_Codes.Encapsulation;

public class Main {
    static void changeNumber(int x){
        x=100;
    }
    static void changeStudent(Student s){
        s.setMarks(95);
    }
    static void reassign(Student s){
        s=new Student("New",50);
    }
    static void changeId(StudentID s){
        s = new StudentID("999","EWU");
    }

    public static void main(String[] args){
        int number =10;
        changeNumber(number);

        System.out.println(number);

        Student s1 = new Student("Hanif", 80);
        changeStudent(s1);
        s1.display();

        StudentID i = new StudentID("101","EWU");
        i.display();
        changeId(i);
        i.display();

        //i = 100
    }


}
