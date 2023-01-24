package model;

/**
<<<<<<< HEAD
 * @author Andrew Steele - aesteele
 * CIS175 - Spring 2023
 * 01/22/2023
 */
public class CharacterCreationLogic {
    /*
        @ double take the passed in parameters and increase the characters xp level
     */
    public double addXP(CharacterCreation character, double xp)
    {
        double newXP = xp + character.getXp();
        character.setXp(newXP);
        return character.getXp();
    }
    /*
        @ int take the passed in parameters and decrease the characters health level
     */
    public int takeDamage(CharacterCreation character, int damage)
    {
        int healthAfterDamage = character.getHealth() - damage;
        if(healthAfterDamage > 0)
        {
            character.setHealth(healthAfterDamage);
            return character.getHealth();
        }
        else
        {
            return 0;
        }

    }
    /*
        @ String take the parameters and change the characters name
     */
    public String changeName(CharacterCreation character, String Name)
    {
        character.setName(Name);
        return character.getName();
    }
}
