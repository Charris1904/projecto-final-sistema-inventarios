/**
 * 
 */
package com.ucreativa.products;

import com.ucreativa.contact.Contact;

/**
 * @author Idania
 *
 */
public class Product {

	/**
	 * 
	 */
	
	//Atributes
	private int idProduct;
	private String name;
	private String description;
	private double subTotal;
	private double taxes;
	private double total;
	private int sku;
	private int invoiceCode;
	private int barCode;
	private double weight;
	private int stock;
	private Contact provider;
	private double cost;
	private double totalTax;
	
	//Constructor
	public Product() {}

	public Product(int idProduct, String name, String description, double subTotal, double taxes, double total, int sku,
				   int invoiceCode, int barCode, double weight, int stock, Contact provider, double cost, double totalTax) {
		this.idProduct = idProduct;
		this.name = name;
		this.description = description;
		this.subTotal = subTotal;
		this.taxes = taxes;
		this.total = total;
		this.sku = sku;
		this.invoiceCode = invoiceCode;
		this.barCode = barCode;
		this.weight = weight;
		this.stock = stock;
		this.provider = provider;
		this.cost = cost;
		this.totalTax = totalTax;
	}
	
	//Methods Get and Set
	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public double getTaxes() {
		return taxes;
	}

	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getSku() {
		return sku;
	}

	public void setSku(int sku) {
		this.sku = sku;
	}

	public int getInvoiceCode() {
		return invoiceCode;
	}

	public void setInvoiceCode(int invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Contact getProvider() {
		return provider;
	}

	public void setProvider(Contact provider) {
		this.provider = provider;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
	}
	
	/*
	 * This method will alert when the stock is empty
	 * */
	public void StockAlert(){}

	//Method ToString
	@Override
	public String toString() {
		return "Product [name=" + name + ", description=" + description + ", subTotal=" + subTotal + ", taxes=" + taxes
				+ ", total=" + total + ", sku=" + sku + ", invoiceCode=" + invoiceCode + ", barCode=" + barCode
				+ ", weight=" + weight + ", stock=" + stock + ", provider=" + provider + ", cost=" + cost
				+ ", totalTax=" + totalTax + ", toString()=" + super.toString() + "]";
	}
	
}
