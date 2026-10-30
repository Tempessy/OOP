package Class_Codes.Inheiritance;

public class ClassMain {
    public static void main(String[] args){
        Manager m = new Manager("A",101,"IT");
        m.work();

        Employee e1 = new Manager("B",102,"HR");
        Employee e2 = new Manager("C",103,"Java");
        e1.work();
        e2.work();

        Employee e3 = m; //upcasting
        Manager m2 = (Manager)e3; //downcasting
        m2.work();

        System.out.println(m.getId());
        System.out.println(CompanyRules.TAXRATE);
    }
}
