package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
	    Car holden = new Car();
	    Car testCar = new Car(2,4,"Ford","Engine force", "verde");
        System.out.println(testCar.getModel());
	    porsche.setModel("Carrera");
        System.out.println(porsche.getModel());

    }
}
