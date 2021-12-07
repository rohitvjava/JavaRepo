package com.collection.list;

public class Student implements Comparable <Student>{
	
	private int rollNumber;
	private String name;
	private int weight;
	
	
	
	
	
	public Student(int rollNumber, String name, int weight) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.weight = weight;
	}
	
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}


	

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", weight=" + weight + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollNumber;
		result = prime * result + weight;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNumber != other.rollNumber)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}


	


	@Override
	public int compareTo(Student o) {
		if(this.getRollNumber()<o.getRollNumber())
		{
			return 1;
		}else if(this.getRollNumber()>o.getRollNumber())
		{
			return -1;
		}else{
			return 0;
		}
		
		
	}
	
	
	
	
	

}
