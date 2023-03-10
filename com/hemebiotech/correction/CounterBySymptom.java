package com.hemebiotech.correction;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *Class which count the number of symptoms in the data list and implement a Map 
 */

public class CounterBySymptom 
{
	private List<String> listOfAllSymptomFromFile;
	private List<String> listOfTypeOfSymptomCleared;


	//The result will be a map which will take in key the type of symptom and on value the number of this one 
	private Map<String, Integer> numberPerTypeOfSymptom;


	public CounterBySymptom(List<String> listOfAllSymptomFromFile, List<String> listOfTypeOfSymptomCleared)
	{
		this.listOfAllSymptomFromFile= listOfAllSymptomFromFile;
		this.listOfTypeOfSymptomCleared = listOfTypeOfSymptomCleared;
	}

	public void count()
	{
		numberPerTypeOfSymptom = new LinkedHashMap<>();

		//add to the map every keys
		for(String typeOfSymptom : listOfTypeOfSymptomCleared)
		{
			getNumberPerTypeOfSymptom().put(typeOfSymptom, 0);

		}

		//count the number of times each symptom appears
		for(String symptom : listOfAllSymptomFromFile)
		{
			int x = numberPerTypeOfSymptom.get(symptom);
			
			x++;

			//replace the value of the selected key
			numberPerTypeOfSymptom.replace(symptom, x);
			
		}
	}
	



	public Map<String, Integer> getNumberPerTypeOfSymptom() {
		return numberPerTypeOfSymptom;
	}

	public void setNumberPerTypeOfSymptom(Map<String, Integer> numberPerTypeOfSymptom) {
		this.numberPerTypeOfSymptom = numberPerTypeOfSymptom;
	}


}