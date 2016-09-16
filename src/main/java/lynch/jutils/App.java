package lynch.jutils;

import lynch.jutils.file.PropertiesUtil;

public class App 
{
	private final static String fileName="config/test.properties";
    public static void main( String[] args )
    {
    	PropertiesUtil.printPropertiesFile(fileName);
		System.out.println("weight="+PropertiesUtil.getValueByKey(fileName, "weight","72"));
    }
}
