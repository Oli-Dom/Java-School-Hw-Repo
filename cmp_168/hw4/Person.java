public class Person extends Passenger {
    private int numOffspring;

    public Person() {
        super();
        numOffspring = 0;
    }

    public Person(int spring) {
        super();
        numOffspring = spring;
    }

    public Person(String name, int birth, double weight, double height, char gen, int carry, int spring) {
        super(name, birth, weight, height, gen, carry);
        if (spring < 0) {
            numOffspring = 0;
        } else
            numOffspring = spring;
    }

    /*
     * Setter methods
     */

    public void setNumOffspring(int spring) {
        if (spring < 0) {
            numOffspring = 0;
        } else
            numOffspring = spring;
    }

    /*
     * Getter method
     */

    public int getNumOffspring() {
        return this.numOffspring;
    }

    /*
     * Additional methods
     */

    @Override
    public void printDetails() {
        String s = "Person: " + super.toString();
        String fs = String.format(s + " Number of Offspring: %4d\n", this.numOffspring);
        System.out.println(fs);
    }

    @Override
    public String toString() {
        String s = super.toString();
        String fs = String.format(s + " Person: Number of Offspring: %4d\n", this.numOffspring);
        return fs;
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            Person otherPerson = (Person) obj;
            if (this.numOffspring == otherPerson.numOffspring) {
                return true;
            }
        }
        return false;
    }

}// end of class
