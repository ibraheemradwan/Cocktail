/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktail;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author ibrah
 */
public class Color {

   private int r;
    private int g;
   private int b;

    private static final Map<String, Color> colorMap = new HashMap<>();
    static 
    {
        colorMap.put("red", new Color(255, 0, 0));
        colorMap.put("green", new Color(0, 255, 0));
        colorMap.put("blue", new Color(0, 0, 255));
        colorMap.put("yellow", new Color(255, 255, 0));
        colorMap.put("pink", new Color(255,0,255));
        colorMap.put("skyblue", new Color(0,255,255));
        colorMap.put("grey", new Color(192,192,192));    
    }

    public Color(int r, int g, int b) 
    {
        this.r = r;
        this.g = g;
        this.b = b;
    }
    public static Color fromName(String colorName) throws IllegalArgumentException {
    Color color = colorMap.get(colorName.toLowerCase());
    if (color == null) {
        throw new IllegalArgumentException("Unknown color: " + colorName);
    }
    
    return new Color(color.r, color.g, color.b);
}
    
    public void blendWith(Color other, int otherVolume, int totalVolume) 
    {
    if (other == null) 
    {
        throw new IllegalArgumentException("Attempt to blend with null color.");
    }
    if (totalVolume == 0) {
        throw new IllegalArgumentException("Total volume cannot be zero when blending colors.");
    }
        
        this.r = (this.r * (totalVolume - otherVolume) + other.r * otherVolume) / totalVolume;
        this.g = (this.g * (totalVolume - otherVolume) + other.g * otherVolume) / totalVolume;
        this.b = (this.b * (totalVolume - otherVolume) + other.b * otherVolume) / totalVolume;
    }

    @Override
    public String toString() {
        return "r=" + r + ", g=" + g + ", b=" + b ;
    }

}

