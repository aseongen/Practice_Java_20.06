class Product {
	private String name;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

public class TEST04 {
	public static void main(String[] args) {

		Product pd = new Product();
		pd.setName("나나");
		pd.setPrice(150);
		
		System.out.println(pd.getName() + pd.getPrice());
		
	}
}
