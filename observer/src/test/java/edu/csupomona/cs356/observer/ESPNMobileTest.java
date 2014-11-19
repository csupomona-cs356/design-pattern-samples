package edu.csupomona.cs356.observer;


import org.junit.Assert;
import org.junit.Test;

import edu.csupomona.cs356.subject.GameScore;

public class ESPNMobileTest {

	@Test
	public void testUpdate() {
		GameScore gameScore = new GameScore();
		gameScore.setName("LAK vs BOS");
		gameScore.setScore("12:23");
		
		ESPNMobileForTest espn = new ESPNMobileForTest();
		gameScore.attach(espn);
		
		gameScore.setScore("22:23");
		
		Assert.assertEquals(1, espn.getScoreBoard().size());
		Assert.assertEquals("22:23", espn.getScoreBoard().get("LAK vs BOS"));
	}
}
