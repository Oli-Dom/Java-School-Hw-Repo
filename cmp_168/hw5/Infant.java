public class Infant extends Person implements Mover {

    class InfantToy {
        private String infantToyName;
        private int infantToyRating;

        InfantToy(String name, int rating) {
            infantToyName = name;
            infantToyRating = rating;
        }
    } // end of infanttoy class

    private InfantToy[] toys;
    private int numInfantToys;

    public Infant() {
        super();
        toys = new InfantToy[10];
        numInfantToys = 0;
    }

    public Infant(String name, int birth, double weight, double height, char gender, int numCarry) {
        super(name, birth, weight, height, gender, numCarry, 0);
        toys = new InfantToy[10];
        numInfantToys = 0;
    }

    public void addInfantToy(String name, int rating) {
        if (numInfantToys < toys.length) { // check that there is space
            if (name != null && rating > 0) { // check for a valid rating and name
                InfantToy toy = new InfantToy(name, rating);
                toys[numInfantToys] = toy;
                numInfantToys++;
            }
        } else {
            System.err.println("Toys has reached a capacity of 10");
        }
    }

    public String getInfantToyAsString(int index) {
        if (index < numInfantToys && index >= 0) {
            return toys[index].toString();
        } else {
            return "invalid index " + index;
        }

    }

    public int getNumInfantToys() {
        return numInfantToys;
    }

    public String getInfantToyName(int index) {
        if (index < numInfantToys && index >= 0) {

            return toys[index].infantToyName;
        } else {
            return "invalid index " + index;
        }
    }

    public int getInfantToyRating(int index) {
        if (index < numInfantToys && index >= 0) {

            return toys[index].infantToyRating;
        } else {
            return -1;
        }
    }

    public int getHighestInfantToyRating() {
        int rating = toys[0].infantToyRating;
        for (int i = 0; i < numInfantToys; i++) {
            if (toys[i].infantToyRating > rating) {
                rating = toys[i].infantToyRating;
            }
        }
        return rating;
    }

    /*
     * Abstract methods
     */
    @Override
    public  double metabolizeAccumulatedCalories(){
        int negativeCals = getCaloriesAccumulator() * -1;
        double weightGained = ((double)getCaloriesAccumulator()/1200);
        // int remainderCals = getCaloriesAccumulator() % 1200;
        setWeight(getWeight() + weightGained);
        setCaloriesAccumulator(negativeCals);
        return weightGained;
    }

   

    /*
     * Mover interface methods
    */
    public String move(){
        return "flail arms and legs";
    }
    public String move(int count){
        String s = "";

        for(int i = 0; i <count;i++){
            s += String.format("Flaim arms and legs\n");
        }

        return s;
    }

    @Override
    public String toString() {
        String s = super.toString();
        String fs = String.format(s + "Infant: Number of Toys: %4d | Infant Toys:\n", this.numInfantToys);
        String toy = "";

        for (int i = 0; i < numInfantToys; i++) {
            toy += String.format("InfantToy: Toy Name: %20s | Rating %4d\n", toys[i].infantToyName,
                    toys[i].infantToyRating);
        }
        String fs2 = fs + toy;
        return fs2;
    }

    @Override
    public void printDetails() {
        String s = super.toString();
        String fs = String.format(s + "Infant: Number of Toys: %4d | Infant Toys:\n", this.numInfantToys);
        String toy = "";

        for (int i = 0; i < numInfantToys; i++) {
            toy += String.format("InfantToy: Toy Name: %20s | Rating %4d\n", toys[i].infantToyName,
                    toys[i].infantToyRating);
        }
        String fs2 = fs + toy;
        System.out.println(fs2);
    }

    @Override
    public void eat(Food food){
        int foodCals = food.getCalories();
        setCaloriesConsumed(foodCals);
        setCaloriesAccumulator(foodCals);
    }

    @Override
    public void eat(Food[] foods){
  	int foodCals = 0;
        for(int i = 0; i < foods.length; i++){
            foodCals += foods[i].getCalories();
        }
        setCaloriesConsumed(foodCals);
        setCaloriesAccumulator(foodCals);
    }
}// end of class

