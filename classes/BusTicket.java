package classes;

import java.lang.*;

public class BusTicket extends Product
{
	private int size;
	
	public BusTicket(){}
	public BusTicket(String productName, Buyer buyer, int totalProduct, int size)
	{
		super(productName, buyer, totalProduct);
		this.size = size;
	}
	
	public void setSize(int size){this.size = size;}
	public int getSize(){return size;}
	
	public void showDetails()
	{
		System.out.println("**** Cheap Product Information ****");
		this.getBuyer().showDetails();
		System.out.println(" Ticket Name: " + this.getProductName());
		System.out.println("Total Ticket: " + this.getTotalProduct());
		System.out.println("Ticket number : " + size);
		System.out.println();
	}
}