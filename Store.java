package provider;

import java.util.ArrayList;
import java.util.List;

public class Store {

	public static final Integer MAX_BREAD = 5;
	private List<Bread> reserve;
	
	public Store() {
		reserve = new ArrayList<>();
	}
	
	public void getBread(Factory factory) {
		if(count() < MAX_BREAD) {
			reserve.add(factory.createBread("Chisinau", factory.getName()));
		} else {
			System.out.println("Reserve is full.");
		}
	}
	
	public Integer count() {
		return reserve.size();
	}
	
	public List<Bread> getReserve(){
		return reserve;
	}
}
