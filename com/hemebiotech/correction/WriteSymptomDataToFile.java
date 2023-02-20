package com.hemebiotech.correction;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;


public class WriteSymptomDataToFile 
{
	private Map<String, Integer> numberPerTypeOfSymptom;


	public WriteSymptomDataToFile(Map<String, Integer> numberPerTypeOfSymptom)
	{
		this.numberPerTypeOfSymptom = numberPerTypeOfSymptom;

	}

	public void register()
	{
		try {
      //the file which will receve the result
			FileWriter writer = new FileWriter("results.out");
			
      //loop to allowed to write in the file, each element of the map line by line
			for(String symptom : numberPerTypeOfSymptom.keySet())
			{
				writer.write(symptom+" = "+numberPerTypeOfSymptom.get(symptom));
				writer.write("\n");
				
			}
			
			writer.close();

		} 
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}
	}
}
