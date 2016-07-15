package sam.tools.vid.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement (name="vehicle")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"id", "frame", "wheels", "powertrain"})
public class Vehicle {
	private String id;
	
	private Frame frame;
	
	@XmlElementWrapper(name = "wheels")
	@XmlElement(name = "wheel")
	private List<Wheel> wheels;
	
	private Powertrain powertrain;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Frame getFrame() {
		return frame;
	}
	public void setFrame(Frame frame) {
		this.frame = frame;
	}
	public List<Wheel> getWheels() {
		return wheels;
	}
	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}
	public Powertrain getPowertrain() {
		return powertrain;
	}
	public void setPowertrain(Powertrain powertrain) {
		this.powertrain = powertrain;
	}
	
	@Override
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("Vehicle Id: ");
		sb.append(id);
		sb.append("\n");
		sb.append("Frame Material: ");
		sb.append(frame.toString());
		sb.append("\n");
		sb.append("Wheel Material: ");
		
		int counter = 1;
		for(Wheel wheel:wheels){
			sb.append(wheel.toString());
			if(wheels.size() != counter){
				sb.append(", ");
			}
			counter++;
		}
		sb.append("\n");
		
		return sb.toString();
	}
}
