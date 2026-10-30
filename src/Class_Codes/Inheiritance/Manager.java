package Class_Codes.Inheiritance;

public class Manager extends Employee{
    private String dept;

    Manager(String name,int id,String dept){
        super(name,id);
        this.dept = dept;
    }
    @Override
    public void work(){
        super.work();
        System.out.println(name+" manages "+dept);
    }

}
