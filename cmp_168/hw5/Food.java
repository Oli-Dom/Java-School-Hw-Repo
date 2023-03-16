public class Food{

    private String name;
    private int calories;

    public Food(String name, int cal){
        this.name = name;
        this.calories = cal;
    }

    /**
     * *Setter methods
    */

    public void setName(String name){
        this.name = name;
    }

    public void setCalories(int cal){
        this.calories = cal;
    }

    /*
     * Getter methods
    */

    public String getName(){
        return this.name;
    }

    public int getCalories(){
        return this.calories;
    }

    @Override
    public String toString(){
        String s = String.format("Food - name: %10s | calories: %4d", this.name, this.calories);
        return s ;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){return false;}
        if(this == obj){return true;}
        if(obj instanceof Food){
            Food otherFood = (Food) obj;
            if(otherFood.calories == this.calories){
                if(this.name.equals(otherFood.name)){
                    return true;
                }
            }
        }
        return false;
    }
}