package bot;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.TextArea;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JTextArea;
import java.awt.Scrollbar;
import java.awt.event.ActionListener;

public class GUI {

	private JFrame frame;
	private JTextField tFMessage;
	private final Action action = new SwingAction();
	public static String userInput;
	static JTextArea textArea;
	int countForFirst = 0; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
		chatBot.welcome();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Arial", Font.PLAIN, 12));
		frame.setBounds(100, 100, 785, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tFMessage = new JTextField();
		tFMessage.setFont(new Font("Arial", Font.PLAIN, 13));
		tFMessage.setColumns(10);
		
		JButton btnSendMsg = new JButton("SEND");
		btnSendMsg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userInput = tFMessage.getText();
				textArea.append(chatBot.printTextInput());
				if ( countForFirst == 0 ) {
					chatBot.name = GUI.userInput;
					GUI.textArea.append("Greetings " + chatBot.name + ". My name is Tee-Tee the T-Rex!!");
					GUI.textArea.append("If you are curious type \"help\" to get a list of topics I will talk to you about!");
					//feel free to change later, just did this so i could access code from main area
					countForFirst += 1 ;
				}else {
					chatBot.inputfield(userInput);
				}
				tFMessage.removeAll();
			}
		});
		btnSendMsg.setAction(action);
		btnSendMsg.setFont(new Font("Arial", Font.PLAIN, 13));
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(textArea, Alignment.LEADING)
						.addComponent(tFMessage, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 619, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSendMsg, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(tFMessage, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSendMsg, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addGap(18))
		);
		frame.getContentPane().setLayout(groupLayout);
		
		textArea.setText(chatBot.welcome());
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Send Message");
			
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
