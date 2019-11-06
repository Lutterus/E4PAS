package startClass;

import controller.Controller;
import model.Carrinho;
import model.Model;
import view.Confirmacao;
import view.List;

public class Main {
	public static void main(String[] args) {
		Model model = new Model();
		Carrinho carrinho= new Carrinho();
		Confirmacao confirmacaoTela = new Confirmacao();
		Controller c = new Controller(model, confirmacaoTela, carrinho);
		List list = new List(c);
		list.open();
	}
}
