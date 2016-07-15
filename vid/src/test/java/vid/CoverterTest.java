package vid;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.junit.Test;

import sam.tools.vid.action.Converter;
import sam.tools.vid.model.Vehicles;

/**
 * Junit testcase to test Xml to java object binding.
 * @author vsnk
 *
 */
public class CoverterTest {
	private String fileName = "c:\\sankar\\test.xml";
	
	@Test
	public void unmarshalXml() throws JAXBException, IOException{
		Converter conv = new Converter();
		Vehicles vehicles = conv.convertXmlToObject(fileName);

		assertTrue(vehicles.getVehicles().size() > 0);
	}

}
