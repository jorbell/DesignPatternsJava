package creational.singleton;

public class Main {

	public static void main(String[] args) {

            User john = new User("john");
            User jane = new User("jane");
            User doe = new User("doe");
            Singleton x = Singleton.getInstance();
            Singleton y = Singleton.getInstance();
            Singleton z = Singleton.getInstance();

            x.currentUser = john;
            System.out.println(x.currentUser.getUsername());
            System.out.println(y.currentUser.getUsername());
            System.out.println(z.currentUser.getUsername());

            y.currentUser = jane;
            System.out.println(x.currentUser.getUsername());
            System.out.println(y.currentUser.getUsername());
            System.out.println(z.currentUser.getUsername());

            z.currentUser = doe;
            System.out.println(x.currentUser.getUsername());
            System.out.println(y.currentUser.getUsername());
            System.out.println(z.currentUser.getUsername());

	}

}
