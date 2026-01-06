package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesFileUtilities {
//public static void main(String[] args) {

	public String readDataFromPropertiesFile(String Keys) throws IOException {
	FileInputStream fis= new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\NINZACRMQSP\\src\\test\\resources\\ninzacrmqsp");
	Properties pobj= new Properties();
	pobj.load(fis);
	
	String value=pobj.getProperty(Keys);
	return value;
}
}
