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
public class TestHealthAndName {

    CharacterCreation character = new CharacterCreation();
    CharacterCreationLogic charLogic = new CharacterCreationLogic();

    @Before
    public void setUp() throws Exception {

    }

    /*
        @Test set health level, and test that the level has been set correctly
     */
    @Test
    public void checkHealth() {
        character.setHealth(900);
        int health =  character.getHealth();
        assertEquals(900, health, 0.0);
    }
    /*
     @Test set name and test that the name variable is not null after it is set
    */
    @Test
    public void checkNameIsNotNull()
    {
        character.setName("Testy McTesterpants");
        String name = character.getName();
        assertNotNull(name);
    }
    /*
     @Test check that the unset name value is null
   */
    @Test
    public void checkNameIsNull()
    {
        assertNull(character.getName());
    }
}
