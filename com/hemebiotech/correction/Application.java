package com.hemebiotech.correction;

import java.util.List;
import java.util.Map;

//class wich allowed to organised each method
public class Application 
{

	public Application()
	{
		//inform the name of data file
				String symptomFile = "symptoms.txt";

				//create a variable to received the list of symptom from the file
				List<String> listOfAllSymptomFromFile;

				//read this one, complete a list with it
				ReadSymptomFromFile readSymptomFromFile = new ReadSymptomFromFile(symptomFile);

				readSymptomFromFile.creatSymptomList();

				listOfAllSymptomFromFile= readSymptomFromFile.getListOfSymptom();

				//remove the symptoms which are duplicated
				RemoveDuplicates removeDuplicates = new RemoveDuplicates(listOfAllSymptomFromFile);

				removeDuplicates.removeDuplicates();

				List<String> listOfTypeOfSymptomCleared = removeDuplicates.getClearedList();


				//Use the two lists (data and list of type of symptoms) and count the number of each symptom
				CounterBySymptom counterBySymptom = new CounterBySymptom(listOfAllSymptomFromFile, listOfTypeOfSymptomCleared);

				counterBySymptom.count();

				Map<String, Integer> numberPerTypeOfSymptom = counterBySymptom.getNumberPerTypeOfSymptom();


				//Recording the results of the count in the file result.ods
				WriteSymptomDataToFile writeSymptomDataToFile = new WriteSymptomDataToFile(numberPerTypeOfSymptom);

				writeSymptomDataToFile.register();	
	}
}
