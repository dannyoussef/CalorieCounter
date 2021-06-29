package caloriecounter;

import java.util.Scanner;

/* Programmer: Daniel Youssef
 * Description: This is Java program that calculates how many calories were from
 * carbohydrates, fat, and/or proteins.
 */

public class CalorieCounter {
    Scanner keyboard = new Scanner(System.in);
    
    int carbs, fats, proteins, userInput;
            
    public static void main(String[] args) {
        CalorieCounter calorieCounter = new CalorieCounter();
        calorieCounter.run();
    }
    
    // Runs the program
    public void run() {
        System.out.println("Calorie Counter");
        System.out.println("----");
        
        System.out.print("Enter the amount of fat consumed"
                        + " (in grams): ");
        userInput = keyboard.nextInt();
        
        while (userInput <= 0) {
            System.out.print("Invalid number. Please try again: ");
            userInput = keyboard.nextInt();
        }
        setFats(userInput);
        System.out.println("----");
        
        System.out.print("Enter the amount of carbohydrates consumed"
                        + " (in grams): ");
        userInput = keyboard.nextInt();
        
        while (userInput <= 0) {
            System.out.print("Invalid number. Please try again: ");
            userInput = keyboard.nextInt();
        }
        setCarbs(userInput);
        System.out.println("----");
        
        System.out.print("Enter the amount of protein consumed"
                        + " (in grams): ");
        userInput = keyboard.nextInt();
        
        while (userInput <= 0) {
            System.out.print("Invalid number. Please try again: ");
            userInput = keyboard.nextInt();
        }
        setProteins(userInput);
        System.out.println("----");
        
        calorieReport();
        
        
    }
    
    // No-arg constructor for the CalorieCounter class
    public void CalorieCounter() {
        carbs = 0;
        fats = 0;
        proteins = 0;
    }
    
    // Returns the value of carbs
    public int getCarbs() {
        return carbs;
    }
    
    // Returns the value of fats
    public int getFats() {
        return fats;
    }
    
    // Returns the value of proteins
    public int getProteins() {
        return proteins;
    }
    
    // Assigns carbs a new value
    public void setCarbs(int newCarbs) {
        carbs = newCarbs;
    }
    
    // Assigns fats a new value
    public void setFats(int newFats) {
        fats = newFats;
    }
    
    // Assigns proteins a new value
    public void setProteins(int newProteins) {
        proteins = newProteins;
    }
    
    // Calculates the amount of calories consumed from carbohydrates
    public int amountCarbs() {
        carbs = carbs * 4;
        
        return carbs;
    }
    
    // Calculates the amount of calories consummed from fats
    public int amountFats() {
        fats = fats * 9;
        
        return fats;
    }
    
    // Calculates the amount of calories consummed from protein
    public int amountProteins() {
        proteins = getProteins() * 4;

        return proteins;
    }
    
    // Displays a report of the macronutrients
    public void calorieReport() {
        System.out.println("\nCalorie Report");
        System.out.println("----");
        System.out.println("Calories from Fats: " + amountFats());
        System.out.println("Calories from Carbohydrates: " + amountCarbs());
        System.out.println("Calories from Protein: " + amountProteins());
        System.out.println("\nTotal Calories: " + (getFats() + getCarbs() + getProteins()));
    }   
}