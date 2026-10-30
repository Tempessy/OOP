package Class_Codes.Inheiritance;

public class Developer extends Employee{
    private String lang;
    Developer(String name, int id, String lang){
        super(name,id);
        this.lang = lang;
    }
    @Override
    public void work(){
        System.out.println(name + "writes "+lang+"code");

    }

}
