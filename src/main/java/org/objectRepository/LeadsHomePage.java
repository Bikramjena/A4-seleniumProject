package org.objectRepository;

public class LeadsHomePage {
	public String stdDetails(String name) {
		return name;
	}
	public int stdDetails(int id) {
		return id;
	}
	public long stdDetails(long phone) {
		return phone;
	}
	public static void main(String[] args) {
		LeadsHomePage s = new LeadsHomePage();
		s.stdDetails("bikram");
		s.stdDetails(10);
		s.stdDetails("837348728383993");
	
	}
}