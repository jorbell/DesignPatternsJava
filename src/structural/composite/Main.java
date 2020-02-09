package structural.composite;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer = new Computer();
		computer.buildComputer();
		
		System.out.println("Total price of the computer is "+computer.getPrice()+" euro");
	}

}
