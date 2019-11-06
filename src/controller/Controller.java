package controller;

import model.Carrinho;
import model.Model;
import view.Confirmacao;

public class Controller {
	private Model model;
	private Confirmacao con;
	private Carrinho car;
	
	public Controller(Model model, Confirmacao con, Carrinho car) {
		this.model = model;
		this.con = con;
		this.car = car;
	}

	public void button() {
		System.out.println("aaaaaa");
		//con.open(car.getCarrinhoNomes(), car.getCarrinhoValores());
	}

	public void check1() {
		if (model.isCheck1()) {
			model.setCheck1(false);
			car.removeNome("Guilds of Ravnica");
			car.removeValor("582,99");
		} else {
			model.setCheck1(true);
			car.addNome("Guilds of Ravnica");
			car.addValor("582,99");
		}
	}

	public void check2() {
		if (model.isCheck1()) {
			model.setCheck1(false);
			car.removeNome("Ravnica Allegiance");
			car.removeValor("548,90");
		} else {
			model.setCheck1(true);
			car.addNome("Ravnica Allegiance");
			car.addValor("548,90");
		}
	}

	public void check3() {
		if (model.isCheck1()) {
			model.setCheck1(false);
			car.removeNome("War Of The Spark");
			car.removeValor("613,99");
		} else {
			model.setCheck1(true);
			car.addNome("War Of The Spark");
			car.addValor("613,99");
		}
	}

	public void check4() {
		if (model.isCheck1()) {
			model.setCheck1(false);
			car.removeNome("Throne Of Eldraine");
			car.removeValor("598,99");
		} else {
			model.setCheck1(true);
			car.addNome("Throne Of Eldraine");
			car.addValor("598,99");
		}
	}

}