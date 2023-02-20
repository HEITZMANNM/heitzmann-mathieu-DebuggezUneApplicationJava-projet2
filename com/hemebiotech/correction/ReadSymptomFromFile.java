package com.hemebiotech.correction;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadSymptomFromFile 
{
	private String symptomFile;
	private List<String> listOfSymptom;


	public ReadSymptomFromFile(String symptomFile)
	{
		this.symptomFile=symptomFile;
	}

	//method which allowed to read the file and transcribe each element in a list
	public void creatSymptomList()
	{
		listOfSymptom = new ArrayList<>();


		try
		{

			File file = new File(getSymptomFile());    
			// creat the file reader
			FileReader reader = new FileReader(file);  
			// creat the object BufferedReader        
			BufferedReader br = new BufferedReader(reader);    
			String line;

			while((line = br.readLine()) != null)
			{
				//add each element of the file in a List
				listOfSymptom.add(line);

			}

			reader.close();
		}

		catch(Exception ex)
		{

		}


	}

	public String getSymptomFile() {
		return symptomFile;
	}

	public void setSymptomFile(String symptomFile) {
		this.symptomFile = symptomFile;
	}

	public List<String> getListOfSymptom() {
		return listOfSymptom;
	}

	public void setListOfSymptom(List<String> listOfSymptom) {
		this.listOfSymptom = listOfSymptom;
	}


}