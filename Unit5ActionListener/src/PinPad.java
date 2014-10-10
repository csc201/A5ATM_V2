import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinPad extends JFrame implements ActionListener{
	JPanel jplControlPanel = new JPanel();
	JPanel jplLabelPanel = new JPanel();
	JPanel jplButtonPanel = new JPanel();
	JLabel jlbPasscode = new JLabel("Enter Passcode");
	JPasswordField jpwPasscode = new JPasswordField(4);
	JButton jbtNumber;
	StringBuilder inputPin= new StringBuilder("");
	Authentication auth = new Authentication();
	public PinPad() {
		
		jplLabelPanel.setLayout(new BorderLayout());
		jplButtonPanel.setLayout(new GridLayout(4,3));
		
		jplLabelPanel.add(jlbPasscode, BorderLayout.CENTER);
		jplLabelPanel.add(jpwPasscode, BorderLayout.SOUTH);
		
		for (int i=1; i<10; i++) {
			jbtNumber = new JButton(i+"");
			jbtNumber.addActionListener(this);
			jplButtonPanel.add(jbtNumber);
		}
		
		jbtNumber = new JButton("\u23CE");
		jbtNumber.addActionListener(new EnterAction());
		jplButtonPanel.add(jbtNumber);
		
		jbtNumber = new JButton(0+"");
		jbtNumber.addActionListener(this);
		jplButtonPanel.add(jbtNumber);
		jbtNumber = new JButton("C");
		jbtNumber.addActionListener(this);
		jplButtonPanel.add(jbtNumber);
		
		
		jplControlPanel.setLayout(new BorderLayout());
		jplControlPanel.add(jplLabelPanel, BorderLayout.CENTER);
		jplControlPanel.add(jplButtonPanel, BorderLayout.SOUTH);

		add(jplControlPanel);

		/*// set application to full screen
		Toolkit tk = Toolkit.getDefaultToolkit();
		int xSize = ((int) tk.getScreenSize().getWidth());
		int ySize = ((int) tk.getScreenSize().getHeight());*/
		setPreferredSize(new Dimension(160, 180));
		setVisible(true);
		pack();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("C")) {
			jpwPasscode.setText("");
			inputPin.delete(0, inputPin.length());
			System.out.println(inputPin);
		} else if(e.getActionCommand().equals(0+"")) {
			inputPin.append("0");
			jpwPasscode.setText(inputPin.toString());
			System.out.println(inputPin);
		} else if(e.getActionCommand().equals(1+"")) {
			inputPin.append("1");
			jpwPasscode.setText(inputPin.toString());
			System.out.println(inputPin);
		} else if(e.getActionCommand().equals(2+"")) {
			inputPin.append("2");
			jpwPasscode.setText(inputPin.toString());
			System.out.println(inputPin);
		} else if(e.getActionCommand().equals(3+"")) {
			inputPin.append("3");
			jpwPasscode.setText(inputPin.toString());
			System.out.println(inputPin);
		} else if(e.getActionCommand().equals(4+"")) {
			inputPin.append("4");
			jpwPasscode.setText(inputPin.toString());
			System.out.println(inputPin);
		} else if(e.getActionCommand().equals(5+"")) {
			inputPin.append("5");
			jpwPasscode.setText(inputPin.toString());
			System.out.println(inputPin);
		} else if(e.getActionCommand().equals(6+"")) {
			inputPin.append("6");
			jpwPasscode.setText(inputPin.toString());
			System.out.println(inputPin);
		} else if(e.getActionCommand().equals(7+"")) {
			inputPin.append("7");
			jpwPasscode.setText(inputPin.toString());
			System.out.println(inputPin);
		} else if(e.getActionCommand().equals(8+"")) {
			inputPin.append("8");
			jpwPasscode.setText(inputPin.toString());
			System.out.println(inputPin);
		} else if(e.getActionCommand().equals(9+"")) {
			inputPin.append("9");
			jpwPasscode.setText(inputPin.toString());
			System.out.println(inputPin);
		}
	}
	
	public class EnterAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String message =(auth.authenticate(inputPin.toString()))?"Welcome":"WrongPin";
			JOptionPane.showMessageDialog(null, message);
		}
		
	}
}
