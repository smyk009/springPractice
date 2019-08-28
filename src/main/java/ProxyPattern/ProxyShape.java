package ProxyPattern;

public class ProxyShape implements Shape {

	private RectangleShape rectangleShape;
	private String shapeName;

	public ProxyShape(String shapeName) {
		this.shapeName = shapeName;
	}

	@Override
	public void draw() {
		if (rectangleShape == null) {
			rectangleShape = new RectangleShape(shapeName);
		}
		rectangleShape.draw();

	}

}
