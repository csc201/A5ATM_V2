import javax.swing.*;

import java.awt.*;

public class PinPad extends JFrame {
	JPanel jplControlPanel = new JPanel();
	JPanel jplLabelPanel = new JPanel();
	JPanel jplButtonPanel = new JPanel();
	JLabel jlbPasscode = new JLabel("Enter Passcode");
	JPasswordField jpwPasscode = new JPasswordField(4);
	JButton jbtNumber;
	public PinPad() {
		
		jplLabelPanel.setLayout(new BorderLayout());
		jplButtonPanel.setLayout(new GridLayout(4,3));
		
		jplLabelPanel.add(jlbPasscode, BorderLayout.CENTER);
		jplLabelPanel.add(jpwPasscode, BorderLayout.SOUTH);
		
		for (int i=1; i<10; i++) {
			jbtNumber = new JButton(i+"");
			jplButtonPanel.add(jbtNumber);
		}
		jbtNumber = new JButton(" ");
		jplButtonPanel.add(jbtNumber);
		jbtNumber = new JButton(0+"");
		jplButtonPanel.add(jbtNumber);
		jbtNumber = new JButton("C");
		jplButtonPanel.add(jbtNumber);
		
		jplControlPanel.setLayout(new BorderLayout());
		jplControlPanel.add(jplLabelPanel, BorderLayout.CENTER);
		jplControlPanel.add(jplButtonPanel, BorderLayout.SOUTH);

		add(jplControlPanel);

		/*// set application to full screen
		Toolkit tk = Toolkit.getDefaultToolkit();
		int xSize = ((int) tk.getScreenSize().getWidth());
		int ySize = ((int) tk.getScreenSize().getHeight());*/
		setPreferredSize(new Dimension(150, 180));
		setVisible(true);
		pack();
	}
}
