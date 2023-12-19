package entities;

public class Produto {
	private String name;
	private int quantity;
	private Double price;
	
	public Produto() {
		
	}
	public Produto(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public Produto(String name, int quantity, Double price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double totalValue() {
		return price * quantity;
	}
	public int totalQuantity(int quantity) {
		return this.quantity += quantity;
	}
	public String toString() {
		return "name product: "+name+", quantity: "+quantity+", total value: "+totalValue();
	}
	//Feito como uma segunda sobrecarga do método toString(),sobrecarregando o quantity.
	public String Apresentacao() {
		return "name product: "+name+", quantity: "+totalQuantity(quantity)+", total value: "+totalValue();
	}
}
