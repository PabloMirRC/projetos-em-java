package entities;


public class Products {
		public String name;
		public double price;
		public int quantity;
		public double valorTotalNoEstoque(){
		 return  price * quantity;
		}
		public void addProd(int quantity) {
			this.quantity += quantity;
		}
		
		public void remProd(int quantity) {
			this.quantity -= quantity;
		}
		public String toString() {
			return name
			+", $ "
			+String.format("%.2f",price)
			+ " , "
			+ quantity
			+ "  units, total $" 
			+ String.format("%.2f", valorTotalNoEstoque());
			
		}
	
}
