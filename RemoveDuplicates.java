package com.hemebiotech.correction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicates 
{

	private List<String> enterList;
	private List<String> clearedList;
	
	public RemoveDuplicates(List<String> enterList)
	{
		this.enterList= enterList;
	}
	
	public void removeDuplicates()
	{
		clearedList = new ArrayList<>();
		
		//creat a loop to add each symptom which is not yet in the cleared list and remove the duplicates
		for(String symptom : enterList)
		{
			if(!getClearedList().contains(symptom))
			{
				getClearedList().add(symptom);
			}
		}
		
		//sort the list by alphabetical order
		Collections.sort(clearedList);
	}

	public List<String> getClearedList() {
		return clearedList;
	}

	public void setClearedList(List<String> clearedList) {
		this.clearedList = clearedList;
	}
	
}
