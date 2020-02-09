package behavioral.visitor;
public class Main{
    public static void main (String[] args) {
        TaxVisitor taxCalc = new TaxVisitor();
        TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();


        Necessity milk = new Necessity(3.53);
        Liquor vodka = new Liquor(15.03);
        Tobacco marlboro = new Tobacco(9.35);

        System.out.println("Regular taxes");
        System.out.println(milk.accept(taxCalc));
        System.out.println(vodka.accept(taxCalc));
        System.out.println(marlboro.accept(taxCalc));

        System.out.println("HOLIDAY TAXES");
        System.out.println(milk.accept(taxHolidayCalc));
        System.out.println(vodka.accept(taxHolidayCalc));
        System.out.println(marlboro.accept(taxHolidayCalc));


        
    }
}
