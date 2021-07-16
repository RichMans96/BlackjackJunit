package com.qa.blackjack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BlackjackTest {
	
	@Test
	public void dealerWinsTest() {
		int dealerNum = 10;
		int playerNum = 8;
		
		int expected = 10;
		int actual = Blackjack.play(dealerNum, playerNum);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void dealerAndPlayerGreaterThan21Test() {
		int dealerNum = 22;
		int playerNum = 22;
		
		int expected = 0;
		int actual = Blackjack.play(dealerNum, playerNum);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void dealerGreaterThan21Test() {
		int dealerNum = 22;
		int playerNum = 20;
		
		int expected = playerNum;
		int actual = Blackjack.play(dealerNum, playerNum);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void playerGreaterThan21Test() {
		int dealerNum = 20;
		int playerNum = 22;
		
		int expected = dealerNum;
		int actual = Blackjack.play(dealerNum, playerNum);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void constructorTest() {
		Blackjack blackjack = new Blackjack();
		
		assertTrue(blackjack instanceof Blackjack);
	}

}
