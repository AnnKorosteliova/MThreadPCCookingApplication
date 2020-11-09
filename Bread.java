package provider;

public class Bread {

	private String type;
	private Integer id;
	private String manufacturer;
	
	private Bread(String type, Integer id, String manufacturer) {
		this.setType(type);
		this.setId(id);
		this.setManufacturer(manufacturer);
	}
	
	public static Bread getBread(String type, Integer id, String manufacturer) {
		return new Bread(type, id, manufacturer);
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Bread [type=" + type + ", id=" + id + ", manufacturer=" + manufacturer + "]\n";
	}

}
