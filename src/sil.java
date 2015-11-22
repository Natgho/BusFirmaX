import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;


public class sil extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField serigir;
	public JButton btnSil = new JButton("Sil");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sil frame = new sil();
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
	public sil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDzenlemekIstediinizKiinin = new JLabel("D\u00DCZENLEMEK \u0130STED\u0130\u011E\u0130N\u0130Z K\u0130\u015E\u0130N\u0130N SER\u0130 NOSUNU G\u0130R\u0130N\u0130Z:");
		lblDzenlemekIstediinizKiinin.setHorizontalAlignment(SwingConstants.CENTER);
		lblDzenlemekIstediinizKiinin.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDzenlemekIstediinizKiinin.setBounds(47, 24, 484, 63);
		contentPane.add(lblDzenlemekIstediinizKiinin);
		
		serigir = new JTextField();
		serigir.setFont(new Font("Tahoma", Font.BOLD, 19));
		serigir.setBounds(47, 104, 484, 63);
		contentPane.add(serigir);
		serigir.setColumns(10);
		
		
		btnSil.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSil.setBounds(154, 182, 254, 45);
		contentPane.add(btnSil);
	}
}
