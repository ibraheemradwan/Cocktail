/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktail;
import java.util.ArrayList;
/**
 *
 * @author ibrah
 */
class Blender {
    private int capacity;
    private int volume;
    private Color color;
    private int Calories;
    private ArrayList<Ingredients> ingredients;

    public Blender(int capacity) {
        this.capacity = capacity;
        this.ingredients = new ArrayList<>();
        this.color = new Color(0,0,0);
                
    }
    public void addIngredient(Ingredients ingredient) throws Exception {
    if (ingredient.getColor() == null) {
        throw new Exception("Ingredient color is not initialized.");
    }
        
        int newVolume = this.volume + ingredient.getVolume();
        this.color.blendWith(ingredient.getColor(), ingredient.getVolume(), newVolume);

        this.volume = newVolume;
        this.Calories += ingredient.getCalories();
        this.ingredients.add(ingredient);
    }

    public void blend() {
    int totalVolume = this.ingredients.stream().mapToInt(Ingredients::getVolume).sum();
    System.out.println("Total volume before blending: " + totalVolume);
    if (totalVolume == 0) {
        throw new IllegalArgumentException("Total volume cannot be zero when blending colors.");
    }}

    public String pour(Cup cup) throws Exception {
        if (this.volume == 0) {
            throw new Exception("Blender is empty");
        }
        if (cup.getCapacity() >= this.volume) {
            cup.fill(this.volume, this.Calories, this.color);
            this.volume = 0;
            this.Calories = 0;
            return "Cocktail poured into cup.";
        } else {
            return "Cup capacity is too small to hold the cocktail.";
        }
    }

    @Override
    public String toString() {
        return "capacity=" + capacity + ", volume=" + volume + ", color=" + color + ", Calories=" + Calories + ", ingredients=" + ingredients ;
    }

}
