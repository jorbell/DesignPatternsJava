package creational.abstractfactory;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Customer customer = new Customer();
        AbstractFactory factory = new AdidasFactory();
        //Puetaan customer Adidakseen
        customer.setPants(factory.createPants());
        customer.setShoes(factory.createShoes());
        customer.setShirt(factory.createShirt());
        customer.setHat(factory.createHat());

        System.out.println("The customer is wearing"+customer.getHat().toString()+", "+customer.getShirt().toString()+", "+
               customer.getPants().toString()+" and "+customer.getShoes().toString());

        factory = new BossFactory();
        customer.setPants(factory.createPants());
        customer.setShoes(factory.createShoes());
        customer.setShirt(factory.createShirt());
        customer.setHat(factory.createHat());

        System.out.println("The customer is wearing"+customer.getHat().toString()+", "+customer.getShirt().toString()+", "+
               customer.getPants().toString()+" and "+customer.getShoes().toString());
        
    }

}
