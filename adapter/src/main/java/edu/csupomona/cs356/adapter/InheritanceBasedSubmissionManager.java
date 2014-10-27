package edu.csupomona.cs356.adapter;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class InheritanceBasedSubmissionManager extends HashSet implements SubmissionManager {

	private int count = 0;	

	@Override
	public boolean add(Object e) {
		count++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection c) {
		count += c.size();
		return super.addAll(c);
	}

	public int getNumOfAttemptedSubmissions() {		
		return count;
	}
	

}
