package edu.handong.csee.java.lab09.prob1;	//package name

/**
 * Class
 * This class defines a SalesMan object.
 * This class has getter and setter methods. 
 * 
 * Methods
 * getmName():return name
 * getSales():return sales
 * setmName(String mName):inputs value of mName into class variable mName
 * setSales(double sales):inputs value of sales into class variable sales
 * 
 * @author YuKyeongPark
 *
 */

public class SalesMan {	// Class SalesMan is a blueprint to create object
	private String mName;	//instantiates variable
	private double sales;	//instantiates variable
	
	//right mouse -> Source -> Generate getter and setter
	public String getmName() {	//gets name
		return mName;	//return name
	}
	public double getSales() {	//gets sales
		return sales;	//return sales
	}
	public void setmName(String mName) {	//sets name
		this.mName = mName;	//inputs value of mName into class variable 
	}
	
	public void setSales(double sales) {	//sets sales
		this.sales = sales;	//inputs value of mName into class variable 
	}

	
}
