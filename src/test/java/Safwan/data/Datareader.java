package Safwan.data;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Datareader {
	
	public List<HashMap<String, String>> getJsonDataToMap() throws IOException
	{
		//Read josn to String
		String jsonContent = FileUtils.readFileToString(new File(System.getProperty("user.dir")+ "\\src\\test\\java\\Safwan\\data\\Purchaseorder.json"),StandardCharsets.UTF_8);
		
		//String to Hashmap Jackson Databind
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(jsonContent,new TypeReference<List<HashMap<String, String>>>() 
		{
		});
		
		return data;

	}

}
