package structural.decorator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza hawaii = new Pineapple(new Pepper(new Kebab(new Dough())));
		Pizza vege = new Pineapple(new Pepper(new Cheese(new Dough())));
		Pizza lihakas = new Ham(new Kebab(new Cheese(new Dough())));
		
		System.out.println("1. Hawaii");
		System.out.println(hawaii.getInfo()+ "  " + hawaii.getPrice());
		
		System.out.println("2. Vegetariana");
		System.out.println(vege.getInfo()+ "   " + vege.getPrice());
		
		System.out.println("3. Lihakas");
		System.out.println(lihakas.getInfo()+ "   " + lihakas.getPrice());
		

	}

}
