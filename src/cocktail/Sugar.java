/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktail;

/**
 *
 * @author ibrah
 */
public class Sugar extends Ingredients{
    private Color color;

    public Sugar(String name, int calories, int volume, Color color) {
        super(name,calories,volume,color);
        this.color = color;
    }

   

    @Override
    public String toString() {
        return "color=" + color ;
    }
    
}
