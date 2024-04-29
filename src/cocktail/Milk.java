/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktail;

/**
 *
 * @author ibrah
 */
public class Milk extends Ingredients{
    private int volume;
    private Color color;

    public Milk(String name, int calories, int volume, Color color) {
        super(name,calories,volume,color);
        this.color = color;
        this.volume=volume;
    }

    

    @Override
    public String toString() {
        return "volume=" + volume + ", color=" + color;
    }

    

}
