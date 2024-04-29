/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cocktail;
import java.util.Scanner;
/**
 *
 * @author ibrah
 */
public class Cocktail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter Blender capacity:");
            int capacity = Integer.parseInt(scanner.nextLine());
            Blender blender = new Blender(capacity);

            System.out.println("Add ingredients (name calories volume colorName) or type 'blend' to blend:");
            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                if ("blend".equals(input)) {
                    blender.blend();
                    break;
                }
                

                String[] parts = input.split(" ");
                if (parts.length < 4) {
                    System.out.println("Please enter all ingredient details correctly: name, calories, volume, and colorName.");
                    continue;
                }

                try {
                    String name = parts[0];
                    int calories = Integer.parseInt(parts[1]);
                    int volume = Integer.parseInt(parts[2]);
                    String colorName = parts[3].trim();
                    Color color = Color.fromName(colorName);
                    Ingredients ingredient = new Fruits(name, calories, volume, color);
                    blender.addIngredient(ingredient);
                    System.out.println(blender.toString());
                } catch (IllegalArgumentException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }

            System.out.println("Enter Cup capacity:");
            Cup cup = new Cup(Integer.parseInt(scanner.nextLine()));
            String result = blender.pour(cup);
            System.out.println(result);
            System.out.println(cup.toString());
        } catch (NumberFormatException e) {
            System.out.println("Error in number formatting: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


