package sam.tools.vid.action;

import java.util.Scanner;

import sam.tools.vid.model.Vehicles;
/**
 * Demo class. 
 * Accepts file name along with path (ex: c:\test.xml) from the user.
 * Then converts the XML file to Java object.
 * @author vsnk
 *
 */
public class Demo {
	
	public static void main(String[] args) throws Exception {
		Converter conv = new Converter();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter file name with path: ");
		String fileName = scan.next();
		scan.close();
		
		Vehicles vehicles = conv.convertXmlToObject(fileName);
	}

}
