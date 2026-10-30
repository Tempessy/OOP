package Class_Codes.Inheiritance;

public class Employee {
    protected String name;
    private int id;

    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void work(){
        System.out.println(name);
    }
    public final int getId(){
        return id;
    }
    @Override
    public String toString(){
        return "Employee"+name+"ID: "+id;
    }
}
