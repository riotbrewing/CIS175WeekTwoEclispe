package model;

/**
<<<<<<< HEAD
 * @author Andrew Steele - aesteele
 * CIS175 - Spring 2023
 * 01/22/2023
 */
public class CharacterCreation {
    //variables
    private String name;
    private int health;
    private double xp;
    //default constructor
    public CharacterCreation()
    {

    }
    //default constructor with arguments
    public CharacterCreation(String name, int health, double xp) {
        super();
        this.name = name;
        this.health = health;
        this.xp = xp;
    }
    //setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }
}
