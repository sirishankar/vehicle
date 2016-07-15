package sam.tools.vid.model;

public class Wheel {
	private String position;
	private String material;
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	@Override
	public String toString(){
		return position +": "+material;
	}
}
