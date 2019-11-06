package view;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;

import controller.Controller;
import model.Model;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class List {

	protected Shell shell;
	private Controller c;

	public List(Controller c) {
		this.c = c;
	}

	/**
	 * Launch the application.
	 * 
	 * @param args
	 * @wbp.parser.entryPoint
	 
	public static void main(String[] args) {
		try {
			Model m = new Model();
			Carrinho car = new Carrinho();
			Controller c = new Controller(m, car);
			List v = new List(c);
			v.open();;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents(c);
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents(Controller c) {
		shell = new Shell();
		shell.setSize(953, 562);
		shell.setText("SWT Application");

		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("aaa");
			}
		});
		btnNewButton.setBounds(10, 10, 643, 42);
		btnNewButton.setText("COMPRAR");

		Label image1 = new Label(shell, SWT.NONE);
		image1.setImage(
				SWTResourceManager.getImage("C:\\Users\\16111210\\Desktop\\E4PAS\\assets\\81YBMaJlCpL._SX425_.jpg"));
		image1.setBounds(10, 72, 200, 200);

		Label nome1 = new Label(shell, SWT.NONE);
		nome1.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		nome1.setBounds(216, 72, 231, 49);
		nome1.setText("Guilds of Ravnica");

		Label valor1 = new Label(shell, SWT.NONE);
		valor1.setText("582,99");
		valor1.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		valor1.setBounds(216, 127, 231, 49);

		Button check1 = new Button(shell, SWT.CHECK);
		check1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				c.check1();
			}
		});
		check1.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		check1.setBounds(216, 182, 231, 49);
		check1.setText("Adicionar ao carrinho");

		Label image2 = new Label(shell, SWT.NONE);
		image2.setImage(
				SWTResourceManager.getImage("C:\\Users\\16111210\\Desktop\\E4PAS\\assets\\819RjgaYFfL._SX425_.jpg"));
		image2.setBounds(10, 278, 200, 200);

		Label nome2 = new Label(shell, SWT.NONE);
		nome2.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		nome2.setBounds(216, 278, 231, 49);
		nome2.setText("Ravnica Allegiance");

		Label valor2 = new Label(shell, SWT.NONE);
		valor2.setText("548,90");
		valor2.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		valor2.setBounds(216, 333, 231, 49);

		Button check2 = new Button(shell, SWT.CHECK);
		check2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				c.check2();
			}
		});
		check2.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		check2.setBounds(216, 388, 231, 49);
		check2.setText("Adicionar ao carrinho");

		Label image3 = new Label(shell, SWT.NONE);
		image3.setImage(
				SWTResourceManager.getImage("C:\\Users\\16111210\\Desktop\\E4PAS\\assets\\81FiGpIjEEL._SL1500_ .jpg"));
		image3.setBounds(453, 72, 200, 200);

		Label nome3 = new Label(shell, SWT.NONE);
		nome3.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		nome3.setBounds(657, 72, 231, 49);
		nome3.setText("War Of The Spark");

		Label valor3 = new Label(shell, SWT.NONE);
		valor3.setText("613,99");
		valor3.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		valor3.setBounds(657, 127, 231, 49);

		Button check3 = new Button(shell, SWT.CHECK);
		check3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				c.check3();
			}
		});
		check3.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		check3.setBounds(657, 182, 231, 49);
		check3.setText("Adicionar ao carrinho");

		Label image4 = new Label(shell, SWT.NONE);
		image4.setImage(
				SWTResourceManager.getImage("C:\\Users\\16111210\\Desktop\\E4PAS\\assets\\81PLaKLB-0L._SX425_.jpg"));
		image4.setBounds(453, 278, 200, 200);

		Label nome4 = new Label(shell, SWT.NONE);
		nome4.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		nome4.setBounds(655, 278, 231, 49);
		nome4.setText("Throne Of Eldraine");

		Label valor4 = new Label(shell, SWT.NONE);
		valor4.setText("598,99");
		valor4.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		valor4.setBounds(655, 333, 231, 49);

		Button check4 = new Button(shell, SWT.CHECK);
		check4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				c.check4();
			}
		});
		check4.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		check4.setBounds(657, 388, 231, 49);
		check4.setText("Adicionar ao carrinho");
	}
}
