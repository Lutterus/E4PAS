package model;

import java.util.ArrayList;

public class Carrinho {
	ArrayList<String> nomes;
	ArrayList<String> valores;

	public Carrinho() {
		nomes = new ArrayList<String>();
		valores = new ArrayList<String>();
	}

	public void addValor(String d) {
		valores.add(d);
	}

	public void removeValor(String d) {
		int i = 0;
		int j = 0;
		for (String valor : valores) {
			if (valor.contentEquals(d)) {
				j = i;
			}
			i++;
		}
		valores.remove(j);
	}

	public void addNome(String n) {
		nomes.add(n);
	}

	public void removeNome(String n) {
		int i = 0;
		int j = 0;
		for (String string : nomes) {
			if (string.contentEquals(n)) {
				j = i;
			}
			i++;
		}
		nomes.remove(j);
	}
	
	public String getCarrinhoNomes() {
		String nomeConcat = "";
		int i=1;
		for (String string : nomes) {
			if(i!=nomes.size()) {
				nomeConcat = nomeConcat + string + ", ";
			}else {
				nomeConcat = nomeConcat + string;
			}
			
		}
		System.out.println("retornou: " + nomeConcat);
		return nomeConcat;
	}
	
	public String getCarrinhoValores() {
		String nomeConcat = "";
		int i=1;
		for (String string : valores) {
			if(i!=nomes.size()) {
				nomeConcat = nomeConcat + string + ", ";
			}else {
				nomeConcat = nomeConcat + string;
			}
			
		}
		return nomeConcat;
	}
}
