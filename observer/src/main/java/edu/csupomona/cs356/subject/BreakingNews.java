package edu.csupomona.cs356.subject;

public class BreakingNews extends Subject {

	private String news;

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
		notifyObservers();
	}
	
}
