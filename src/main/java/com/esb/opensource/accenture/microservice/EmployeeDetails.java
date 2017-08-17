/**
 * 
 */
package com.esb.opensource.accenture.microservice;

public class EmployeeDetails {

	private long id;
	private String firstName;
	private String lastName;
	private long age;
	private String address;
	private String email;

	/*
	 * public EmployeeDetails(String firstName, String lastName, long age,
	 * String address, String email, long id) { this.firstName = firstName;
	 * this.lastName = lastName; this.age = age; this.address = address;
	 * this.email = email; this.id = id; }
	 */

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the age
	 */
	public long getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(long age) {
		this.age = age;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return String
				.format("Employee[id=%d, firstName='%s', lastName='%s', age=%d, address='%s', email='%s']",
						id, firstName, lastName, age, address, email);
	}

}