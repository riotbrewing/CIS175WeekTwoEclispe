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
public class TestDamageAndXP {

	CharacterCreation character = new CharacterCreation();
	CharacterCreationLogic charLogic = new CharacterCreationLogic();
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public void takeDamageNotKilled() {
		character.setHealth(100);
		int damage = 15;
		int health = charLogic.takeDamage(character, damage);
		character.setHealth(health);
		int newHealth = character.getHealth();
		assertEquals(85, newHealth, 0.0);
	}
	@Test
	public void takeDamageKilled() {
		character.setHealth(100);
		int damage = 115;
		int health = charLogic.takeDamage(character, damage);
		character.setHealth(health);
		int newHealth = character.getHealth();
		assertEquals(0, newHealth, 0.0);
	}
	@Test
	public void testXPNotNull()
	{
		assertNotNull(character.getXp());
	}
	@Test
	public void testXPAdd()
	{
		character.setXp(100);
		double xpPoints = 15 + character.getXp();
		character.setXp(xpPoints);
		assertEquals(115, xpPoints, 0.0);
	}

}
