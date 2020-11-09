package main;

import provider.Bread;
import provider.Factory;
import provider.Store;

public class Application {

	public static void main(String[] args) {

		Factory centralFactory = new Factory("Central");
		Factory secondaryFactory = new Factory("Secondary");
		
		Store piataCentrala = new Store();
		
		piataCentrala.getBread(centralFactory);
		piataCentrala.getBread(secondaryFactory);
		piataCentrala.getBread(secondaryFactory);
		piataCentrala.getBread(centralFactory);
		piataCentrala.getBread(centralFactory);
		piataCentrala.getBread(centralFactory);
		
		System.out.println(piataCentrala.count());
				
		for (Bread bread : piataCentrala.getReserve()) {
			System.out.println(bread);
		}
		
	}
}
