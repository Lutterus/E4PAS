package startClass;

public class Controller {
	private Model model;
	private Carrinho car;

	public Controller(Model model, Carrinho car) {
		this.model = model;
		this.car = car;
	}

	public void button() {
		car.open();
	}

	public void check1() {
		if (model.isCheck1()) {
			model.setCheck1(false);
			model.removeNome("Guilds of Ravnica");
			model.removeValor("582,99");
		} else {
			model.setCheck1(true);
			model.addNome("Guilds of Ravnica");
			model.addValor("582,99");
		}
	}

	public void check2() {
		if (model.isCheck1()) {
			model.setCheck1(false);
			model.removeNome("Ravnica Allegiance");
			model.removeValor("548,90");
		} else {
			model.setCheck1(true);
			model.addNome("Ravnica Allegiance");
			model.addValor("548,90");
		}
	}

	public void check3() {
		if (model.isCheck1()) {
			model.setCheck1(false);
			model.removeNome("War Of The Spark");
			model.removeValor("613,99");
		} else {
			model.setCheck1(true);
			model.addNome("War Of The Spark");
			model.addValor("613,99");
		}
	}

	public void check4() {
		if (model.isCheck1()) {
			model.setCheck1(false);
			model.removeNome("Throne Of Eldraine");
			model.removeValor("598,99");
		} else {
			model.setCheck1(true);
			model.addNome("Throne Of Eldraine");
			model.addValor("598,99");
		}
	}

}