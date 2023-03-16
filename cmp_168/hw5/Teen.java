public class Teen extends Person implements Mover{


    @Override
    public double metabolizeAccumulatedCalories(){
        int negativeCals = getCaloriesAccumulator() * -1;
        double weightGained = (double)getCaloriesAccumulator()/5000;
        setWeight(getWeight() + weightGained);
        setCaloriesAccumulator(negativeCals);
        return weightGained;
    }

  
    /*
     * Mover interface methods
    */
    public String move(){
        return "run fast and jump";
    }
    public String move(int count){
        String s = "";

        for(int i = 0; i <count;i++){
            s += String.format("run fast and jump\n");
        }

        return s.trim();
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
}
