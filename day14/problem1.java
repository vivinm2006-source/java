package day14;
abstract class empl{
    protected String name;
    protected int id;
    protected int base_salary;

    empl(String name, int id, int base_salary) {
        this.name = name;
        this.id = id;
        this.base_salary = base_salary;
    }
    abstract void bonus();
}
class manager extends empl{
    manager(String name,int id,int base_salary){
        super(name,id,base_salary);
    }
    void bonus(){
        System.out.println(base_salary+base_salary*0.10);
    }
}
class developer extends empl{
    developer(String name,int id,int base_salary){
        super(name,id,base_salary);
    }
    void bonus(){
        System.out.println(base_salary+base_salary*0.05);
    }
    static class intern extends empl{
        intern(String name,int id,int base_salary){
            super(name,id,base_salary);
        }

        @Override
        void bonus() {
            System.out.println(base_salary);
        }
    }
}
public class problem1 {
    public static void main(String[] args){
        empl m=new manager("karthick",10,15000);
        empl d=new developer("venket",11,1200);
        empl n=new developer.intern("kavin",12,900);
        m.bonus();
        d.bonus();
        n.bonus();
    }

}

