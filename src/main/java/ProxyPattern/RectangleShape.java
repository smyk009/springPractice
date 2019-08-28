package ProxyPattern;

public class RectangleShape implements Shape {
	
	private String shapeName;
	
	public RectangleShape(String shapeName) {
		this.shapeName = shapeName;
	}

	@Override
	public void draw() {
		System.out.println("Drwaing Shape: "+shapeName);

	}

}
