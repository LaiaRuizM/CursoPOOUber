package Java;
class Main {

    // two objects (car and car2) from car class:
    public static void main(String[] args) {
        System.out.println("Good morning");
        Account account = new Account("Andrés Herrera", "AND123", "handres@gmail.com", "123456");
        UberX uberX = new UberX("AMQ123", account, "Chevrolet", "Sonic");
        //Car car = new Car(); // type of object + name of the object = new + constructor method
        //car.license = "AMQ123"; //licence, driver, etc are attributes
        //car.driver = "Andrés Herrera";
        uberX.passenger = 4;
        uberX.printDataCar(); 

        // Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876", "handrea@hotmail.com", "7890"));  
        // // car2.license = "QWE567";
        // // car2.driver = Andrea Herrera;
        // car2.passenger = 3;
        // car2.printDataCar();
    }
}


// Program entry point
