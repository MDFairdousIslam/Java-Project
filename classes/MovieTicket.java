package classes;

import java.lang.*;

public class MovieTicket extends Product
{
	private int price;
	
	public MovieTicket(){}
	public MovieTicket(String productName, Buyer buyer, int totalProduct, int price)
	{
		super(productName, buyer, totalProduct);
		this.price= price;
	}
	
	public void setPrice (int price){this.price= price;}
	public int getPrice(){return price;}
	
	public void showDetails()
	{
		//System.out.println("**** Costly Product Information ****");
		this.getBuyer().showDetails();
		System.out.println("movie Name: " + this.getProductName());
		System.out.println("Movie Genre : " + this.getTotalProduct());
		System.out.println("Price: " + price);
		System.out.println();
	}
}