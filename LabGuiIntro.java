package guiIntro;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.Component;

/**
 * Displays a graphical user interface for a user to enter their name and click a button. 
 * 
 * @author Brittany Pruneau
 */

public class LabGuiIntro extends JFrame
{
	private JPanel contentPane;
	private JTextField textField;

	/*
	 * Launch's the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					LabGuiIntro frame = new LabGuiIntro();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * Creates the frame and gives instructions for how the GUI application should look.
	 */
	public LabGuiIntro()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblTitle = newLblTitle();
		contentPane.add(lblTitle, BorderLayout.NORTH);

		newSimpleButton();
		newTextPanel();
		newRedLabel();
	}

	/*
	 * Gives instructions for what the red label should look like.
	 */
	private void newRedLabel()
	{
		{
			JLabel lblRedLabel = new JLabel("Hi");
			lblRedLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblRedLabel.setHorizontalTextPosition(SwingConstants.CENTER);
			lblRedLabel.setOpaque(true);
			lblRedLabel.setForeground(new Color(255, 255, 0));
			lblRedLabel.setBackground(new Color(255, 0, 0));
			lblRedLabel.setFont(new Font("Tahoma", Font.BOLD, 71));
			contentPane.add(lblRedLabel, BorderLayout.CENTER);
		}
	}

	/*
	 * Describes how the button on the application should look. 
	 */
	private void newSimpleButton()
	{
		JButton btnSimpleButton = new JButton("WEST");
		contentPane.add(btnSimpleButton, BorderLayout.WEST);
	}

	/*
	 * Describes how the text panel on the application should look. 
	 */
	private void newTextPanel()
	{
		JPanel textPanel = new JPanel();
		textPanel.setBackground(new Color(192, 192, 192));
		textPanel.setPreferredSize(new Dimension(50, 50));
		textPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		textPanel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textPanel, BorderLayout.SOUTH);
		{
			JLabel lblNewLabel = new JLabel("Name: ");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel.setLabelFor(textPanel);
			textPanel.add(lblNewLabel);
		}
		{
			textField = new JTextField();
			textField.setPreferredSize(new Dimension(100, 30));
			textField.setSize(new Dimension(50, 16));
			textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textPanel.add(textField);
			textField.setColumns(16);
		}
	}

	/*
	 * Describes how the title of the application "My First Gui" should look. 
	 */
	private JLabel newLblTitle()
	{
		JLabel lblTitle = new JLabel("My First Gui");
		lblTitle.setOpaque(true);
		lblTitle.setBackground(new Color(0, 0, 255));
		lblTitle.setForeground(new Color(0, 250, 154));
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		return lblTitle;
	}
}
