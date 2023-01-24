package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.CharacterCreation;
import model.CharacterCreationLogic;

/**
 * @author  Andrew Steele aeste - aesteele
 * CIS175 - Fall 2021
 * Jan 22, 2023
 */
public class TestHealthAndName {
	
	CharacterCreation character = new CharacterCreation();
	CharacterCreationLogic charLogic = new CharacterCreationLogic();
	
	@Before
	public void setUp() throws Exception {

	}
	
	@Test
	public void checkHealth() {
		character.setHealth(900);
		int health =  character.getHealth();
		assertEquals(900, health, 0.0);
	}
	
	@Test
	public void checkNameIsNotNull()
	{
		character.setName("Testy McTesterpants");
		String name = character.getName();
		assertNotNull(name);
	}
	@Test
	public void checkNameIsNull()
	{
		assertNull(character.getName());
	}

}
