package provider;

public class Factory {

	public static Integer counter = 0;
	private String name;
	
	public Factory(String name) {
	this.setName(name);		
	}
	
	public Bread createBread(String type, String name) {
		return Bread.getBread(type, ++counter, name);
	}
	
	@Override
	public String toString() {
		return "Factory [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
}
