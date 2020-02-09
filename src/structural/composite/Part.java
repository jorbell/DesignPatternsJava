package structural.composite;

public interface Part {
	public abstract double getPrice();
	public abstract void add(Part part);
	public abstract void remove(Part part);
	public abstract String getName();

}
