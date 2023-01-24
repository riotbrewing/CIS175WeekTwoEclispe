package test.java;

import model.CharacterCreation;
import model.CharacterCreationLogic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Andrew Steele - aesteele
 * CIS175 - Spring 2023
 * 01/22/2023
 */
public class TestDamageAndXP {

    CharacterCreation character = new CharacterCreation();
    CharacterCreationLogic charLogic = new CharacterCreationLogic();

    @Before
    public void setUp() throws Exception {

    }
    /*
        @Test set health level, set damage level, set health by calling take damage method
        set the new health level and test that new level matches the predicted
     */
    @Test
     public void takeDamageNotKilled() {
        character.setHealth(100);
        int damage = 15;
        int health = charLogic.takeDamage(character, damage);
        character.setHealth(health);
        int newHealth = character.getHealth();
        assertEquals(85, newHealth, 0.0);
    }
    /*
        @Test set health level, set damage level(greater than the health level), set health by calling take damage method
        set the new health level and test that new level matches 0
     */
    @Test
    public void takeDamageKilled() {
        character.setHealth(100);
        int damage = 115;
        int health = charLogic.takeDamage(character, damage);
        character.setHealth(health);
        int newHealth = character.getHealth();
        assertEquals(0, newHealth, 0.0);
    }
    /*
        @Test to make sure the xp value is not null
     */
    @Test
    public void testXPNotNull()
    {
        assertNotNull(character.getXp());
    }
    /*
        @Test set xp level, set new xp level by adding a number ot the current level, set the new
        level and test that the new level matched the expected amount
     */
    @Test
    public void testXPAdd()
    {
        character.setXp(100);
        double xpPoints = 15 + character.getXp();
        character.setXp(xpPoints);
        assertEquals(115, xpPoints, 0.0);
    }

}
