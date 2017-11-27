package hotelSystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

public class CheckIn {
	
	static JPanel checkInPanel = new JPanel();
		
		static JLabel checkInLabel = new JLabel("Checking In: ");
		static JTextArea checkInText = new JTextArea("hello");
		static JTextArea checkOutText = new JTextArea("goodbye");
		static JScrollPane checkInScrollPane = new JScrollPane(checkInText);
		static JScrollPane checkOutScrollPane = new JScrollPane(checkOutText);
		static JSplitPane checkInSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,checkInScrollPane,checkOutScrollPane);
			
	public static void checkInPanel() {
		
		checkInPanel.setLayout(null);
		checkInPanel.setBackground(Home.myColor);
		checkInPanel.setBounds(170,100,480,480);
			
			checkInLabel.setBounds(5,5,240,25);
			checkInLabel.setFont(checkInLabel.getFont().deriveFont(20f));
			checkInSplitPane.setBounds(5,30,470,435);
			checkInSplitPane.setResizeWeight(0.5);
			
		checkInPanel.add(checkInLabel);
		checkInPanel.add(checkInSplitPane);
		checkInPanel.setVisible(false);
		
		
	}
	
	private static class myActionListener implements ActionListener {
		
		public void actionPerformed(ActionEvent event){
			
		
		}
	}
}
