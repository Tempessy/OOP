package Class_Codes.Encapsulation;

public final class StudentID {
    private final String id;
    private final String uni;

    StudentID(String id, String uni){
        this.id=id;
        this.uni = uni;
    }
    String getID(){
        return id;
    }
    String getUni(){
        return uni;
    }
    void display(){
        System.out.println(id+": "+uni);
    }
}
