package menu;
import java.awt.*;
import java.awt.event.*;
public class menuExample extends Frame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	menuExample(){
		Frame f = new Frame("Clg page");
		MenuBar mb = new MenuBar();
		Menu C = new Menu("Clg deps");
		Menu CSE = new Menu("CSE");
		Menu AIML = new Menu("AIML");
		Menu IT = new Menu("IT");
		Menu ECE = new Menu("ECE");
		Menu EEE = new Menu("EEE");
		
		MenuItem CSE1 = new MenuItem("CSE1");
		MenuItem CSE2 = new MenuItem("CSE2");
		MenuItem CSE3 = new MenuItem("CSE3");
		MenuItem CSE4 = new MenuItem("CSE4");
		
		MenuItem AIML1 = new MenuItem("AIML1");
		MenuItem AIML2 = new MenuItem("AIML2");
		MenuItem AIML3 = new MenuItem("AIML3");
		MenuItem AIML4 = new MenuItem("AIML4");
		
		MenuItem IT1 = new MenuItem("IT1");
		MenuItem IT2 = new MenuItem("IT2");
		MenuItem IT3 = new MenuItem("IT3");
		MenuItem IT4 = new MenuItem("IT4");
		
		MenuItem ECE1 = new MenuItem("ECE1");
		MenuItem ECE2 = new MenuItem("ECE2");
		MenuItem ECE3 = new MenuItem("ECE3");
		MenuItem ECE4 = new MenuItem("ECE4");
		
		MenuItem EEE1 = new MenuItem("EEE1");
		MenuItem EEE2 = new MenuItem("EEE2");
		MenuItem EEE3 = new MenuItem("EEE3");
		MenuItem EEE4 = new MenuItem("EEE4");
		
		CSE.add(CSE1);
		CSE.add(CSE2);
		CSE.add(CSE3);
		CSE.add(CSE4);
		
		AIML.add(AIML1);
		AIML.add(AIML2);
		AIML.add(AIML3);
		AIML.add(AIML4);
		
		IT.add(IT1);
		IT.add(IT2);
		IT.add(IT3);
		IT.add(IT4);
		
		ECE.add(ECE1);
		ECE.add(ECE2);
		ECE.add(ECE3);
		ECE.add(ECE4);
		
		EEE.add(EEE1);
		EEE.add(EEE2);
		EEE.add(EEE3);
		EEE.add(EEE4);
		
		mb.add(CSE);
		mb.add(AIML);
		mb.add(IT);
		mb.add(ECE);
		mb.add(EEE);
		
		f.setMenuBar(mb);
		f.setVisible(true);
		f.setSize(500, 500);
		f.setLayout(null);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we ) {
				System.exit(0);
			}
		});
	}
	public static void main(String args[]) {
		new menuExample();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
