/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktail;

/**
 *
 * @author ibrah
 */
class Cup {
    private int capacity;
    private int Calories;
    private Color color;

    public Cup(int Calories, Color color) {
        
        this.Calories = Calories;
        this.color = color;
    }

    public Cup(int capacity) {
        this.capacity = capacity;
    }
    
     public void fill(int volume, int calories, Color color) {
        
        this.Calories += calories;
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCalories() {
        return Calories;
    }

    public void setCalories(int Calories) {
        this.Calories = Calories;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "capacity=" + capacity + ", Calories=" + Calories + ", color=" + color ;
    }

    
}
    
    

   

    
