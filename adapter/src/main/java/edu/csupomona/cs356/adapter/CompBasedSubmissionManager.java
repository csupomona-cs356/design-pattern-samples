package edu.csupomona.cs356.adapter;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CompBasedSubmissionManager implements SubmissionManager {

	private int count = 0;
	
	private Set delegateSet = new HashSet();
	
	public boolean add(Object obj) {
		count++;
		return delegateSet.add(obj);
	}

	public boolean addAll(Collection obj) {
		count += obj.size();
		return delegateSet.addAll(obj);
	}

	public int getNumOfAttemptedSubmissions() {

		return count;
	}

}
