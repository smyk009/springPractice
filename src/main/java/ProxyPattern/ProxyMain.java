package ProxyPattern;

public class ProxyMain {
	public static void main(String[] args) {
		Shape shape = new ProxyShape("Circle");
		shape.draw();
	}

}
