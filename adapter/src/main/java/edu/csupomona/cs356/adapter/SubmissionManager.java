package edu.csupomona.cs356.adapter;

import java.util.Collection;

public interface SubmissionManager {

	public boolean add(Object obj);
	
	public boolean addAll(Collection obj);
	
	public int getNumOfAttemptedSubmissions();
}
