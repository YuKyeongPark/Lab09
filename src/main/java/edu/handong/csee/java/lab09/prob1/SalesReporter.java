package edu.handong.csee.java.lab09.prob1;	//package name
import java.util.Scanner;	//import Scanner class

/**
 * Class
 * This class defines a SalesReporter object.
 * This class has SalesReporter(), SalesReporter(int num), getData(), cal_average(), higthestSales(), printOutResults() and main method.
 * There is a overloading method. 
 * 
 * Methods
 * SalesReporter():constructor instantiates class
 * SalesReporter(int num):constructor, value setting
 * getData():gets values of name and sales from users and stores in array
 * cal_average():calculates average
 * highestSales():calculates highest sales
 * 
 * printOutResults():prints result in console
 * main:calls getData(), cal_average(), highestSales(), printOutResults()
 * 
 * @author YukyeongPark
 *
 */

public class SalesReporter {	//Class is a blueprint to create object
	
	private double highestSales=0;	//declares variable highestSales
	private double averageSales=0;	//declares variable averageSales
	private SalesMan[] team ;	//team is SalesMan type and has number of salesman
	private int numOfSalesman;	//declares variable numOfSalesman
	//	private int numberOfAssociates; 	//Same as team.length

	//when class is instantiated, this text is printed.
	public SalesReporter() {	//constructor: instantiates class
		System.out.println("Enter number of associates:");	//prints text
		Scanner myScanner = new Scanner(System.in);	//user can input data
		
		numOfSalesman = myScanner.nextInt();	//this variable can be used any other method in class
		
	}
	
	public SalesReporter(int num) {	//constructor, occurs overloading
		numOfSalesman = num;	//the value of parameter num inputs into numOfSalesman
	}
	
	public static void main(String[] args) {	//main method
		SalesReporter myReporter = new SalesReporter();	//creating object myReporter and type is SalesReporter
		
		myReporter.getData();	//calls myReporter's method getData
		myReporter.cal_average();	//calls myReporter's method cal_average
		myReporter.cal_highestSales();	//calls myReporter's method highestSales
		myReporter.printOutResults();	//calls myReporter's method printOutResults
	
	}

	public void getData() {	//void method don't need return data
		
		team = new SalesMan[numOfSalesman];	//initialize
		
		for(int i = 0; i < team.length; i++)	//for loop continues until value of numOfSalesman
		{
			Scanner myScanner = new Scanner(System.in);	//user can input data
			System.out.println("Enter data for associate number " + (i+1));	//prints number of index
			
			System.out.print("Enter name of sales associate: ");	//prints text
			String name = myScanner.nextLine(); //user could input variable name into name variable
			
			System.out.print("Enter associate's sales: $"); //prints text
			double sales = myScanner.nextDouble(); //user could input variable sales into sales variable
			
			SalesMan mySalesman = new SalesMan();	//because of local value, so value of mySalesman is gone-> store in array
			mySalesman.setmName(name);	//calls mySalesman's method setmName and sets name
			mySalesman.setSales(sales); //calls mySalesman's method setSales and sets sales
			
			//same as inputing value in the int array 
			team[i] = mySalesman;	//array is also kind of type. array must be instantiated before the loop.
			
		}
	}
	
	public void cal_average() {	//method to calculate average
		
		double sum = 0;	//declare and initiate sum variable 
		
		for(int i = 0; i < team.length; i++)	//for loop is executed until value of team.length
		{
			double sales = team[i].getSales();	//sets value of sales of team array into sales
			sum = sum + sales;	//sum is sum + sales
		}
		
		averageSales = sum/team.length;	//averageSale is division of sum and team.length
	}

	public void cal_highestSales() {	//method to compare value and search highest sales
		for(int i = 0; i< team.length; i++)	//for loop is executed until value of team.length-1
		{
			if(team[i].getSales() > highestSales)	//if highestSales is smaller than sales, 
			{
				highestSales = team[i].getSales();	//changes value of highestSales
			}	
		}
	}
	
	public void printOutResults() {	//method to print result
		System.out.println("Average sales per associate is " + averageSales);	//prints average sales
		System.out.println("The hightest sales figure is " + highestSales);	//prints highest sales
		
		//highest sales
		System.out.println("The following had the highest sales:");	//prints text
		for(int i=0; i<team.length; i++)	//for loop is executed until value of team.length
		{
			if(team[i].getSales() == highestSales) {	//if highestSales is same as value of team sales
				
				System.out.println("Name: " + team[i].getmName());	//prints name which has highest sales
				System.out.println("Sales: " + team[i].getSales());	//prints sales which has highest sales
				System.out.println(team[i].getSales() - averageSales + " above the average.");	//prints whether or not the value of sales is higher than average 
			}
			
		}
		for(int i=0; i<team.length; i++)	//for loop is executed until value of team.length
		{
			if(team[i].getSales() != highestSales)	//if highestSales isn't same was sales
			{
				if(team[i].getSales() < averageSales)	//if averageSales is bigger than value of sales
				{
					System.out.println("Name: " + team[i].getmName());	//prints name which has highest sales
					System.out.println("Sales: " + team[i].getSales());	//prints sales which has highest sales
					System.out.println(averageSales -team[i].getSales()  + " below the average.");	//prints whether or not the value of sales is higher than average 
				}else	//if averageSales is smaller than value of sales
				{
					System.out.println("Name: " + team[i].getmName());	//prints name which has highest sales
					System.out.println("Sales: " + team[i].getSales());	//prints sales which has highest sales
					System.out.println(team[i].getSales() - averageSales + " above the average.");	//prints text
				}
			}
		}	
	
		
	
	}
}

