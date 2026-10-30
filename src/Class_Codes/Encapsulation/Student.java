package Class_Codes.Encapsulation;

public class Student {
    private String name;
    private int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public int getMarks(){
        return marks;
    }

    public void setMarks(int marks){
        this.marks=marks;
    }
    public void display(){
        System.out.println(name+": "+marks);
    }

}
