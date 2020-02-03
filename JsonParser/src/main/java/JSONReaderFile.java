import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONReaderFile {

	public static void main(String[] args) throws IOException, ParseException {
		
		JSONParser parser=new JSONParser();
		
		FileReader reader=new FileReader(".\\jsonFiles\\jsonData.json");
		
		Object obj= parser.parse(reader);
		
		JSONObject jsonObj=(JSONObject)obj;
		
		String fname=(String) jsonObj.get("firstName");
		String lname=(String) jsonObj.get("lastName");
		
		System.out.println("Firstname is "+fname);
		System.out.println("Lastname is "+lname);
		
		JSONArray arry=(JSONArray) jsonObj.get("phoneNumbers");
		
		for(int i=0;i<arry.size();i++) {
			System.out.println("Phone numbers of "+i+"  is");
			JSONObject phone=(JSONObject)arry.get(i);
			String type=(String) phone.get("type");
			String number=(String) phone.get("number");
			System.out.println("Type of phone is "+type);
			System.out.println("Number is "+number);
			
			
		}
		
		

	}

}
