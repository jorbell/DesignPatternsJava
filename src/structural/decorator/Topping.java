package structural.decorator;

public abstract class Topping implements Pizza{
	
	private Pizza pizza;

        public Topping(Pizza pizza){
            this.pizza = pizza;
        }

        public double getPrice() {
            return pizza.getPrice();
        }

        public String getInfo(){
            return pizza.getInfo();
        }

}
