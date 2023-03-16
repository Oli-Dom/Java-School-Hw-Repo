package hw3;

public class Driver {

	public static void main(String[] args) {
		Airplane Airplane = new Airplane();
		Passenger p1 = new Passenger("Albert", 1879, 198.5, 'm', 2);
		Passenger p2 = new Passenger("Grace", 1906, 105, 'f', 1);
		Passenger p3 = new Passenger("Tim", 1955, 216.3, 'm', 2);
		Passenger p4 = new Passenger("Steve", 1955, 160, 'm', 2);
		Passenger p5 = new Passenger("Sergey", 1973, 165.35, 'm', 1);

		Airplane.addPassenger(p1);
		Airplane.addPassenger(p2);
		Airplane.addPassenger(p3);
		Airplane.addPassenger(p4);
		Airplane.addPassenger(p5);

		Airplane.printAllDetails();

	}

}
