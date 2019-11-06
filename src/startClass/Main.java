package startClass;

public class Main {
	public static void main(String[] args) {
		Model m = new Model();
		Carrinho car = new Carrinho();
		Controller c = new Controller(m, car);
		View v = new View(c);
		v.open();
	}
}
