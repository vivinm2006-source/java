package day13;
class car{
    void station(){
        System.out.println("petrol station");
    }
}
class EVCAR extends car{
    void station(){
        System.out.println("EV station");
    }
}
class PETROLCAR extends car{
    void station(){
        System.out.println("petrol station is not working");
    }
}

public class polymorphism {
    public static void main(String[] args){
        EVCAR evcar = new EVCAR();
        evcar.station();
        PETROLCAR car = new PETROLCAR();
        car.station();

    }
}
