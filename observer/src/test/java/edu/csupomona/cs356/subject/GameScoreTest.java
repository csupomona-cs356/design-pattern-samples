package edu.csupomona.cs356.subject;

import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.csupomona.cs356.observer.CPPNewsPaper;
import edu.csupomona.cs356.observer.ESPNMobile;
import edu.csupomona.cs356.observer.Observer;

public class GameScoreTest {

	private GameScore gameScore;
	
	@Before
	public void setup() {
		System.out.println("Test setup");
		gameScore = new GameScore();
		gameScore.setName("LAK vs BOS");
		gameScore.setScore("12:23");
	}
	
	@Test
	public void testGetName() {
				
		String result = gameScore.getName();
		Assert.assertEquals("LAK vs BOS", result);
	}
	
	@Test
	public void testGetScore() {		
		
		Assert.assertTrue(gameScore.getScore().equals("12:23"));
	}
	
	@Test
	public void testObserversList() {
		ESPNMobile espn = new ESPNMobile();
		CPPNewsPaper cpp = new CPPNewsPaper();
		
		Assert.assertEquals(0, gameScore.getObservers().size());
		Assert.assertFalse(gameScore.getObservers().contains(espn));
		Assert.assertTrue(!gameScore.getObservers().contains(cpp));
		
		gameScore.attach(espn);
		
		Assert.assertEquals(1, gameScore.getObservers().size());
		Assert.assertTrue(gameScore.getObservers().contains(espn));
		Assert.assertTrue(!gameScore.getObservers().contains(cpp));
		
		gameScore.attach(cpp);
		
		Assert.assertEquals(2, gameScore.getObservers().size());
		Assert.assertTrue(gameScore.getObservers().contains(espn));
		Assert.assertTrue(gameScore.getObservers().contains(cpp));
		
		gameScore.detach(espn);
		
		Assert.assertEquals(1, gameScore.getObservers().size());
		Assert.assertTrue(!gameScore.getObservers().contains(espn));
		Assert.assertTrue(gameScore.getObservers().contains(cpp));
	}
	
	@Test
	public void testNotifyObservers() {
		ESPNMobile espn = mock(ESPNMobile.class);
		CPPNewsPaper cpp = mock(CPPNewsPaper.class);
		
		gameScore.attach(espn);
		gameScore.attach(cpp);
		
		gameScore.setName("BOS vs LAK");
		gameScore.setScore("23:34");
		
		verify(espn, times(2)).update(any(Subject.class));
		verify(cpp, times(2)).update(any(Subject.class));
	}	
}
