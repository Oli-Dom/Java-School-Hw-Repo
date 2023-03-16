public class Passenger {

    /**
     * *Defined private fields of the class
     */
    private String name;
    private int birthYear;
    private double weight;
    private char gender;
    private int numCarryOn;
    private double height;

    /**
     * * Constructor
     */
    public Passenger() {
        this.name = "";
        this.birthYear = 1900;
        this.weight = 0.0;
        this.gender = 'u';
        this.numCarryOn = 0;
    }

    /**
     * *Overloaded constructor
     */
    public Passenger(String name, int birth, double weight, char gender, int carry) {
        this.name = name;
        this.birthYear = birth;
        if (weight < 0.0) {
            this.weight = -1;
        } else
            this.weight = weight;
        if (gender == 'f' || gender == 'm') {

            this.gender = gender;
        } else
            this.gender = 'u';
        if (carry > 2) {

            this.numCarryOn = 2;
        } else if (carry > 0) {

            this.numCarryOn = carry;
        } else
            this.numCarryOn = 0;
    }

    /**
     * *Second overloaded constructor
     */
    public Passenger(String name, int birth, double weight,double height,  char gender, int carry) {
        this.name = name;
        this.birthYear = birth;
        if (weight < 0.0) {
            this.weight = -1;
        } else
            this.weight = weight;
        if (height < 0.0) {
            this.height = -1;
        } else
                this.height = height;
        if (gender == 'f' || gender == 'm') {

            this.gender = gender;
        } else
            this.gender = 'u';
        if (carry > 2) {

            this.numCarryOn = 2;
        } else if (carry > 0) {

            this.numCarryOn = carry;
        } else
            this.numCarryOn = 0;
    }

    /*
     * Below we will begin to create the class' methods
     */

    public int calculateAge(int currYear) {

        if (currYear < birthYear) {
            return -1;
        }

        return currYear - birthYear;
    }

    public void gainWeight() {
        this.weight += 1;
    }

    public void gainWeight(double incweight) {
        if (!(this.weight + incweight < 0)) {
            this.weight += incweight;
        }
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public char getGender() {
        return this.gender;
    }

    public String getName() {
        return this.name;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getHeight(){
        return this.height;
    }

    public int getNumCarryOn() {
        return this.numCarryOn;
    }

    public boolean isFemale() {
        if (this.gender == 'f') {
            return true;
        }
        return false;
    }

    public boolean isMale() {
        if (this.gender == 'm') {
            return true;
        }
        return false;
    }

    public void loseWeight() {
        if (!(this.weight - 1 < 0)) {
            this.weight -= 1;
        }
    }

    public void loseWeight(double decWeight) {
        if (!(this.weight - decWeight < 0)) {
            this.weight -= decWeight;
        }
    }

    public double calculateBMI(){
        return (this.weight*703)/Math.pow(this.height, 2);
    }

    public void printDetails() {
        System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f |  Height: %10.2f | Gender: %c | NumCarryOn: %2d\n",
                this.name, this.birthYear, this.weight, this.height, this.gender, this.numCarryOn);
    }

    public void setGender(char g) {
        if (g == 'm' || g == 'f') {
            this.gender = g;
        } else
            this.gender = 'u';
    }

    public void setName(String s) {
        this.name = s;
    }

    public void setBirthYear(int birth) {
        if (!(birthYear < 0)) {
            this.birthYear = birth;
        }

    }

    public void setWeight(double weight) {
        if (weight < 0.0) {
            this.weight = -1;
        } else
            this.weight = weight;
    }

    public void setHeight(double height) {
        if (height < 0.0) {
            this.height = -1;
        } else
            this.height = height;
    }

    public void setNumCarryOn(int numCarry) {
        if (numCarry < 0) {
            this.numCarryOn = 0;
        } else if (numCarry > 2) {
            this.numCarryOn = 2;
        } else
            this.numCarryOn = numCarry;
    }

    /*
     * *Override methods
     */

    @Override
    public String toString(){
        String s = String.format("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Height: %10.2f | Gender: %c | NumCarryOn: %2d\n",
        this.name, this.birthYear, this.weight, this.height, this.gender, this.numCarryOn);

        return s;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){ return false;}
        if (this == obj){return true;}
        if(obj instanceof Passenger){
            Passenger anotherPassenger = (Passenger) obj;
            if(this.name.equals(anotherPassenger.name)){
                if(this.gender == anotherPassenger.gender){
                    if(this.birthYear == anotherPassenger.birthYear){
                        if(Math.abs(this.weight - anotherPassenger.weight) < 0.5){
                            if(Math.abs(this.height - anotherPassenger.height) < 0.5){
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}