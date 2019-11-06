package startClass;

import java.util.ArrayList;
import java.util.Observable;

public class Model extends Observable {
	private boolean check1;
	private boolean check2;
	private boolean check3;
	private boolean check4;
	ArrayList<String> nomes;
	ArrayList<String> valores;

	public Model() {
		nomes = new ArrayList<String>();
		valores = new ArrayList<String>();
		check1 = false;
		check2 = false;
		check3 = false;
		check4 = false;
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

	public boolean isCheck1() {
		return check1;
	}

	public void setCheck1(boolean check1) {
		this.check1 = check1;
	}

	public boolean isCheck2() {
		return check2;
	}

	public void setCheck2(boolean check2) {
		this.check2 = check2;
	}

	public boolean isCheck3() {
		return check3;
	}

	public void setCheck3(boolean check3) {
		this.check3 = check3;
	}

	public boolean isCheck4() {
		return check4;
	}

	public void setCheck4(boolean check4) {
		this.check4 = check4;
	}

}