package sam.tools.vid.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * Vehicles is a root element. 
 * JAXB model classes allows us extend the same for 
 * persistence layer such as Hibarnate in the future.
 * @author vsnk
 *
 */
@XmlRootElement(name="vehicles")
@XmlAccessorType(XmlAccessType.FIELD)
public class Vehicles {
	@XmlElement(name = "vehicle")
	private List<Vehicle> vehicles = null;

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
}
