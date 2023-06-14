package ConverttoJsontoJava;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;

public class JsontoJava{
	
public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
	

		
		ObjectMapper om = new ObjectMapper() {
			
			public Object serialize(ObjectMapperSerializationContext context) {
				
				return null;
			}
			
			public Object deserialize(ObjectMapperDeserializationContext context) {
				
				return null;
			}
		};
		File jsonfile = new File("C:\\Users\\NAGAR\\Documents\\workspace-spring-tool-suite-4-4.17.1.RELEASE\\Restassured\\target\\Accounting&SalesInformation.json");
		
		MainClass cla = om.readValue(jsonfile,MainClass.class);
		System.out.println(cla.getAccounting());
		System.out.println(cla.getSales());
		String Accountdetails = cla.getAccounting().toString();
		List<Sales> Salesdetails = cla.getSales();
		
	}
		
		
		
		
		
}

