package com.hackathon.asapcardConsumer.cvsreader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONArray;
import org.json.JSONObject;

public class CSVFILEREADER {
	public static void main(String[] args) {
		String delimeter = ";";
		String lineData;
		File csvFile = new File("conciliation-data.csv");
		
		try {
			BufferedReader read = new BufferedReader(new FileReader(csvFile));
			JSONArray arrayOfJSONObjects = new JSONArray();
			
			while((lineData = read.readLine()) != null) {
				String[] moeda = lineData.split(delimeter);
				
				System.out.println("[ID Transição = " + moeda[0]
						+ " , Data Transição = "      + moeda[1]
						+ " , Documento = "           + moeda[2]
						+ " , Status = "                + moeda[3]
						+ "]");
				
				JSONObject jsonObj = new JSONObject();
				jsonObj.put("ID Transição",   moeda[0]);
				jsonObj.put("Data Transição", moeda[1]);
				jsonObj.put("Documento",      moeda[2]);
				jsonObj.put("Status",           moeda[3]);
				
				arrayOfJSONObjects.put(jsonObj);
				
			}
			
			try(PrintWriter out = new PrintWriter(new FileWriter("dadosJSON2.txt"))){
				out.write(arrayOfJSONObjects.toString());
			} catch(IOException e) {
				e.printStackTrace();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}

	}
}
