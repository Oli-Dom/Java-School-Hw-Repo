package hw3;

public class Airplane {
	private Passenger[] passengers;
	private String airplaneName;
	private int numPassengers;

	public Airplane() {
		passengers = new Passenger[100];
		airplaneName = "";
		numPassengers = 0;

	} // End of default constructor

	public Airplane(String name) {
		this();
		airplaneName = name;
	} // end of first overloaded constructor

	public Airplane(int size) {
		this();
		if (size >= 0) {
			passengers = new Passenger[size];
		} else
			passengers = new Passenger[0];
	} // end of second overloaded constructor

	public Airplane(String name, int size) {
		this();
		airplaneName = name;
		if (size >= 0) {
			passengers = new Passenger[size];
		} else
			passengers = new Passenger[0];
	} // end of third overloaded constructor

	// Below is the addPassenger method
	public void addPassenger(Passenger Passenger) {
		if (passengers != null && Passenger != null) {
			if (numPassengers < passengers.length) {
				passengers[numPassengers] = Passenger;
				numPassengers++;
			} else {
				resizePassengerArray();
				passengers[numPassengers] = Passenger;
				numPassengers++;
			}
		}

	} // end of addPassenger method

	public void resizePassengerArray() {
		Passenger[] resized = new Passenger[passengers.length * 2];
		for (int i = 0; i < passengers.length; i++) {
			resized[i] = passengers[i];
		}
		passengers = resized;
	}

	// Below are the getter methods
	public String getAirplaneName() {
		return this.airplaneName;
	}

	public Passenger getPassenger(int index) {
		if (index < 0 || index >= numPassengers) {
			return null;
		} else
			return passengers[index];
	}

	public int getNumPassengers() {
		return numPassengers;
	}

	public Passenger getFirstPassenger() {
		return this.passengers[0];
	}

	public Passenger getLastPassenger() {
		return passengers[numPassengers - 1];
	}

	public Passenger[] getPassengers() {
		Passenger[] arrCopy = new Passenger[passengers.length];

		for (int i = 0; i < getNumPassengers(); i++) {
			arrCopy[i] = passengers[i];
		}
		return arrCopy;
	}

	// Below are the setter methods
	public void setAirplaneName(String name) {
		airplaneName = name;
	}

	// Below are the print methods
	public void printAllDetails() {
		System.out.printf("AirplaneName: %20s | Number of Passengers: %4d | Airplane Size: %4d\n", airplaneName,
				getNumPassengers(), passengers.length);
		for (int i = 0; i < numPassengers; i++) {
			System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c | NumCarryOn: %3d\n",
					passengers[i].getName(), passengers[i].getBirthYear(),
					passengers[i].getWeight(), passengers[i].getGender(), passengers[i].getNumCarryOn());
		}

	}

	public Passenger removePassenger(int index) {
		// Passenger[] arrCopy = getPassengers();
		if (index < 0 || index >= numPassengers) {
			return null;
		}
		Passenger personRemoved = passengers[index];
		if (index == (numPassengers - 1)) {
			numPassengers--;
			return personRemoved;
		} else {

			for (int i = index; i < numPassengers - 1; i++) {
				passengers[i] = passengers[i + 1];

			}

			numPassengers--;
		}
		return personRemoved;
	}

	public void removeAllPassengers() {
		for (int i = 0; i < numPassengers; i++) {
			passengers[i] = null;
		}
		numPassengers = 0;
	}

	public double getTotalWeightOfAllPassengers() {
		double weight = 0;
		for (int i = 0; i < numPassengers; i++) {
			weight += passengers[i].getWeight();
		}
		return weight;
	}

	public double getAverageWeightOfAllPassengers() {
		return getTotalWeightOfAllPassengers() / numPassengers;
	}

	public int getNumberOfPassengersAboveWeight(double weight) {
		int counter = 0;
		for (int i = 0; i < numPassengers; i++) {
			if (passengers[i].getWeight() > weight) {
				counter++;
			}
		}

		return counter;
	}

	public int getNumberOfPassengersBelowWeight(double weight) {
		int counter = 0;

		for (int i = 0; i < numPassengers; i++) {
			if (passengers[i].getWeight() < weight) {
				counter++;
			}
		}

		return counter;
	}

	public void increaseWeightOfAllPassengers() {
		for (int i = 0; i < numPassengers; i++) {
			passengers[i].gainWeight();
		}
	}

	public void increaseWeightOfAllPassengers(double weight) {
		for (int i = 0; i < numPassengers; i++) {
			passengers[i].gainWeight(weight);
		}
	}
} // end of class
