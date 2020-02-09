package creational.abstractfactory;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Jasper jasper = new Jasper();
        AbstractFactory factory = new AdidasFactory();
        //Puetaan jasper Adidakseen
        jasper.setPants(factory.createPants());
        jasper.setShoes(factory.createShoes());
        jasper.setShirt(factory.createShirt());
        jasper.setHat(factory.createHat());

        System.out.println("Jasperilla on "+jasper.getHat().toString()+", "+jasper.getShirt().toString()+", "+
               jasper.getPants().toString()+" sekä "+jasper.getShoes().toString());

        //Puetaan jasper Bossiin
        factory = new BossFactory();
        //Puetaan jasper Adidakseen
        jasper.setPants(factory.createPants());
        jasper.setShoes(factory.createShoes());
        jasper.setShirt(factory.createShirt());
        jasper.setHat(factory.createHat());

        System.out.println("Jasperilla on "+jasper.getHat().toString()+", "+jasper.getShirt().toString()+", "+
               jasper.getPants().toString()+" sekä "+jasper.getShoes().toString());
        
    }

}
