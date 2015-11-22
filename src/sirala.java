import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class sirala extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sirala frame = new sirala();
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
	public sirala() 
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnKapat = new JButton("Kapat");
		btnKapat.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				dispose();
			}
		});
		btnKapat.setBounds(425, 322, 89, 23);
		contentPane.add(btnKapat);
		
		JLabel lblYolcular = new JLabel("YOLCULAR");
		lblYolcular.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblYolcular.setHorizontalAlignment(SwingConstants.CENTER);
		lblYolcular.setBounds(98, 29, 340, 40);
		contentPane.add(lblYolcular);
		
		
		//JTable panelim = new JTable();
		//panelim.setBounds(94, 76, 323, 200);
		//contentPane.add(panelim);
	}
}
