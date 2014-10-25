package edu.csupomona.cs356;

import edu.csupomona.cs356.observer.CPPNewsPaper;
import edu.csupomona.cs356.observer.ESPNMobile;
import edu.csupomona.cs356.subject.BreakingNews;
import edu.csupomona.cs356.subject.GameScore;

public class Driver {

	public static void main(String[] args) throws InterruptedException {
		ESPNMobile espn = new ESPNMobile();
		
		CPPNewsPaper cpp = new CPPNewsPaper();
		
		GameScore gameScore = new GameScore();
		gameScore.attach(espn);
		gameScore.attach(cpp);
		
		BreakingNews breakingNews = new BreakingNews();
		breakingNews.attach(cpp);
		
		Thread.sleep(2000);
		
		breakingNews.setNews("Canada shooting");
		
		gameScore.setName("LAK vs OKC");
		
		Thread.sleep(2000);
		
		gameScore.setScore("12:10");
		
		Thread.sleep(2000);
		
		breakingNews.setNews("Apple Pay is Good");
	}

}
