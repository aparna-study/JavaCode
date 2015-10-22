package practice.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParser {
	// String jsonResponse =
	// "{\"glossary\": {\"title\": \"example glossary\",\"GlossDiv\": {\"title\": \"S\",\"GlossList\": {\"GlossEntry\": {\"ID\": \"SGML\",\"SortAs\": \"SGML\",\"GlossTerm\": \"Standard Generalized Markup Language\",\"Acronym\": \"SGML\",\"Abbrev\": \"ISO 8879:1986\",\"GlossDef\": {\"para\": \"A meta-markup language, used to create markup languages such as DocBook.\",\"GlossSeeAlso\": [\"GML\", \"XML\"]},\"GlossSee\": \"markup\"}}}}}";
	
	static String jsonResponse = "{\"business_id\": \"vcNAWiLM4dR7D2nwwJ7nCA\", \"full_address\": \"4840 E Indian School Rd\nSte 101\nPhoenix, AZ 85018\", \"hours\": {\"Tuesday\": {\"close\": \"17:00\", \"open\": \"08:00\"}, \"Friday\": {\"close\": \"17:00\", \"open\": \"08:00\"}, \"Monday\": {\"close\": \"17:00\", \"open\": \"08:00\"}, \"Wednesday\": {\"close\": \"17:00\", \"open\": \"08:00\"}, \"Thursday\": {\"close\": \"17:00\", \"open\": \"08:00\"}}, \"open\": true, \"categories\": [\"Doctors\", \"Health & Medical\"], \"city\": \"Phoenix\", \"review_count\": 9, \"name\": \"Eric Goldberg, MD\", \"neighborhoods\": [], \"longitude\": -111.98375799999999, \"state\": \"AZ\", \"stars\": 3.5, \"latitude\": 33.499313000000001, \"attributes\": {\"By Appointment Only\": true}, \"type\": \"business\"}";

	public static void main(String[] args) throws ParseException {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		

		JSONParser jsonParser = new JSONParser();
		FileReader fileReader = null;
		JSONArray jRootObject = null;
		 JSONObject jsonObject = null;
		 BufferedReader br = null;
		 int totalBusinessCount= 0;
		 BigInteger  totalReviewCount= BigInteger.valueOf(0); //BigInteger sum = BigInteger.valueOf(0);
		

	        try {

	            String sCurrentLine;

	            br = new BufferedReader(new FileReader("C:\\Python34\\yelp_academic_dataset_review.json"));

	            while ((sCurrentLine = br.readLine()) != null) {
	                //System.out.println("Record:\t" + sCurrentLine);

	                Object obj;
	                
	                    obj = jsonParser.parse(sCurrentLine);
	                     jsonObject = (JSONObject) obj;
	                     totalReviewCount= totalReviewCount.add(BigInteger.valueOf(1));
	                     
	                	System.out.println("id= " + jsonObject.get("business_id"));
	        			//System.out.println("review= " + jsonObject.get("text"));
	            }
			
		//	fileReader = new FileReader("C:\\Python34\\yelp_academic_dataset_review.json");

		//	 jsonObject = (JSONObject) jsonParser.parse(fileReader);
			
						
		} catch (FileNotFoundException e) { 
			System.out.println("1st  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("2nd    $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			e.printStackTrace();
		}

		System.out.println("TOTAL reviews : " + totalReviewCount);
		//TOTAL reviews : 1569264
		
		
	//	System.out.println("business_id: "+jsonObject.get("business_id"));
		int cnt = 0;
		
				
			System.out.println("id= " + jsonObject.get("business_id"));
			System.out.println("review= " + jsonObject.get("text"));
			
	
	}


}
