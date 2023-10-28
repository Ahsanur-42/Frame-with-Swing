import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.JMenuBar;

import java.awt.Font;

import javax.swing.JTree;

import java.awt.SystemColor;

import javax.swing.UIManager;
import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

import javax.swing.Action;
import javax.swing.JEditorPane;

import java.awt.event.ActionListener;


public class FirstFrame extends JFrame {
	private JTextField num11;
	private JTextField num22;
	private final Action action = new SwingAction();
	private JTextField TotalResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstFrame frame = new FirstFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FirstFrame() {
		getContentPane().setBackground(new Color(230, 230, 250));
		setTitle("Simple Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		num11 = new JTextField();
		num11.setFont(new Font("Arial", Font.PLAIN, 13));
		num11.setBackground(Color.WHITE);
		num11.setToolTipText("");
		num11.setBounds(12, 40, 116, 22);
		getContentPane().add(num11);
		num11.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter 1st Number:");
		lblNewLabel.setBounds(12, 13, 116, 16);
		getContentPane().add(lblNewLabel);
		
		num22 = new JTextField();
		num22.setBounds(304, 39, 116, 22);
		getContentPane().add(num22);
		num22.setColumns(10);
		
		JLabel lblEnterndNumber = new JLabel("Enter 2nd Number:");
		lblEnterndNumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEnterndNumber.setBounds(304, 13, 116, 16);
		getContentPane().add(lblEnterndNumber);
		
		JButton textSUM = new JButton("Sum");
		textSUM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ans;
				try{
					num1= Integer.parseInt(num11.getText());
					num2= Integer.parseInt(num22.getText());
					ans= num1+num2;
					TotalResult.setText(Integer.toString(ans));
				}catch (Exception ex){
					System.out.println(ex);
				}
			}
		});
		textSUM.setBounds(12, 101, 81, 25);
		getContentPane().add(textSUM);
		
		JButton btnSub = new JButton("Sub");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try{
					num1= Integer.parseInt(num11.getText());
					num2= Integer.parseInt(num22.getText());
					ans= num1-num2;
					TotalResult.setText(Integer.toString(ans));
				}catch (Exception ex){
					System.out.println(ex);
				}
			}
		});
		btnSub.setBounds(115, 101, 81, 25);
		getContentPane().add(btnSub);
		
		JButton btnMulti = new JButton("Multi");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try{
					num1= Integer.parseInt(num11.getText());
					num2= Integer.parseInt(num22.getText());
					ans= num1*num2;
					TotalResult.setText(Integer.toString(ans));
				}catch (Exception ex){
					System.out.println(ex);
				}
			}
		});
		btnMulti.setBounds(220, 101, 81, 25);
		getContentPane().add(btnMulti);
		
		JButton btnNewButton_1 = new JButton("Div");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try{
					num1= Integer.parseInt(num11.getText());
					num2= Integer.parseInt(num22.getText());
					ans= num1/num2;
					TotalResult.setText(Integer.toString(ans));
				}catch (Exception ex){
					System.out.println(ex);
				}
			}
		});
		btnNewButton_1.setBounds(323, 101, 81, 25);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblMakeYourChoice = new JLabel("Make Your Choice:");
		lblMakeYourChoice.setBounds(12, 75, 125, 16);
		getContentPane().add(lblMakeYourChoice);
		
		JLabel lblNewLabel_1 = new JLabel("The Result is:");
		lblNewLabel_1.setBounds(12, 139, 116, 16);
		getContentPane().add(lblNewLabel_1);
		
		TotalResult = new JTextField();
		TotalResult.setBounds(12, 157, 116, 22);
		getContentPane().add(TotalResult);
		TotalResult.setColumns(10);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
