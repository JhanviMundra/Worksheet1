package com.worksheet1;

public class Address {
	private String Street;
	private String city;
	private String country;
	/**
	 * @return the street
	 */
	public String getStreet() {
		return Street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
//		System.out.println("Setter injection");
		Street = street;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	public Address(String street, String city, String country) {
		super();
		Street = street;
		this.city = city;
		this.country = country;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", city=" + city + ", country=" + country + "]";
	}
	
	
}
