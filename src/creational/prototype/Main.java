package creational.prototype;

public class Main {
    public static void main (String[] args) {
        CloneFactory factory = new CloneFactory();
        Sheep sally = new Sheep();
        Sheep clonedSheep = (Sheep) factory.getClone(sally);
        System.out.println(sally);
        System.out.println(clonedSheep);
        System.out.println("Sally Hashcode: " + System.identityHashCode(System.identityHashCode(sally)));
        System.out.println("Clonedsheep Hashcode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));
    }
}

