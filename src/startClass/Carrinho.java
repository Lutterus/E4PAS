package startClass;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

public class Carrinho {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Carrinho window = new Carrinho();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
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
	protected void createContents() {
		shell = new Shell();
		shell.setSize(953, 565);
		shell.setText("SWT Application");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("foi");
			}
		});
		btnNewButton.setBounds(10, 10, 643, 42);
		btnNewButton.setText("FINALIZAR");
		
		Label nomes = new Label(shell, SWT.NONE);
		nomes.setText("Nomes:");
		nomes.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		nomes.setBounds(10, 58, 643, 42);
		
		Label total = new Label(shell, SWT.NONE);
		total.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		total.setBounds(10, 106, 643, 42);
		total.setText("Total: ");
		
		Button bt1 = new Button(shell, SWT.RADIO);
		bt1.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		bt1.setBounds(10, 154, 169, 42);
		bt1.setText("cart\u00E3o de d\u00E9bito");
		
		Button bt2 = new Button(shell, SWT.RADIO);
		bt2.setText("cart\u00E3o de cr\u00E9dito");
		bt2.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		bt2.setBounds(10, 202, 169, 42);
		
		Button bt3 = new Button(shell, SWT.RADIO);
		bt3.setText("boleto banc\u00E1rio");
		bt3.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		bt3.setBounds(10, 250, 169, 42);
		
		Button bt4 = new Button(shell, SWT.RADIO);
		bt4.setText("paypal");
		bt4.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		bt4.setBounds(10, 298, 169, 42);

	}
}
