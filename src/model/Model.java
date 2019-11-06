package model;

import java.util.ArrayList;
import java.util.Observable;

public class Model extends Observable {
	private boolean check1;
	private boolean check2;
	private boolean check3;
	private boolean check4;

	public Model() {
		
		check1 = false;
		check2 = false;
		check3 = false;
		check4 = false;
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