import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class anaArayuz extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField isimal;
	private JTextField soyisimal;
	private JTextField serino;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					anaArayuz frame = new anaArayuz();
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
	public anaArayuz() {
		setTitle("BusFirmaX");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 471);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton duzenle = new JButton("S\u0130L");
		
		duzenle.setFont(new Font("Tahoma", Font.BOLD, 30));
		duzenle.setBounds(395, 98, 191, 59);
		contentPane.add(duzenle);
		
		serino = new JTextField();
		serino.setColumns(10);
		serino.setBounds(116, 117, 253, 20);
		contentPane.add(serino);
		isimal = new JTextField();
		isimal.setBounds(116, 31, 253, 20);
		contentPane.add(isimal);
		isimal.setColumns(10);

		JLabel lblAd = new JLabel("Ad\u0131:");
		lblAd.setForeground(Color.WHITE);
		lblAd.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAd.setBounds(29, 34, 77, 14);
		contentPane.add(lblAd);
		
		JLabel lblSoyad = new JLabel("Soyad\u0131:");
		lblSoyad.setForeground(Color.WHITE);
		lblSoyad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSoyad.setBounds(29, 61, 77, 14);
		contentPane.add(lblSoyad);
		
		soyisimal = new JTextField();
		soyisimal.setColumns(10);
		soyisimal.setBounds(116, 58, 253, 20);
		contentPane.add(soyisimal);
		
		JLabel lblehir = new JLabel("\u00DCcret");
		lblehir.setForeground(Color.WHITE);
		lblehir.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblehir.setBounds(29, 90, 77, 14);
		contentPane.add(lblehir);
		
		JLabel KoltukNo = new JLabel("KoltukNo:");
		KoltukNo.setForeground(Color.WHITE);
		KoltukNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		KoltukNo.setBounds(29, 143, 77, 14);
		contentPane.add(KoltukNo);
		
		JComboBox<String> koltuksec = new JComboBox<String>();
		koltuksec.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46"}));
		koltuksec.setBounds(116, 142, 253, 20);
		contentPane.add(koltuksec);
		
		JComboBox<String> sehirsec = new JComboBox<String>();
		sehirsec.setModel(new DefaultComboBoxModel<String>(new String[] {"20", "40", "60", "80"}));
		sehirsec.setBounds(116, 89, 253, 20);
		contentPane.add(sehirsec);
		
		JLabel lblCinsiyet = new JLabel("SeriNo");
		lblCinsiyet.setForeground(Color.WHITE);
		lblCinsiyet.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCinsiyet.setBounds(29, 118, 77, 14);
		contentPane.add(lblCinsiyet);
		
		JButton btnEkle = new JButton("EKLE");
		
		btnEkle.setIcon(null);
		btnEkle.setFont(new Font("Tahoma", Font.BOLD, 33));
		btnEkle.setBounds(395, 38, 191, 59);
		contentPane.add(btnEkle);
		
		JLabel lblCreatedBySgt = new JLabel("Created By SGT");
		lblCreatedBySgt.setForeground(new Color(204, 204, 255));
		lblCreatedBySgt.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblCreatedBySgt.setBounds(293, 407, 122, 14);
		contentPane.add(lblCreatedBySgt);
		
		JPanel panel_48 = new JPanel();
		panel_48.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_48.setBounds(125, 174, 461, 76);
		contentPane.add(panel_48);
		panel_48.setLayout(null);
		
		JButton ucretegore = new JButton("\u00DCcret");
		    
		
		/////////////////////////Yolcularý Almaya Basliyorum\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		Vector<yolcu>yolcular = new Vector<yolcu>(46);
		btnEkle.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				yolcu eklenen = new yolcu();
				eklenen.isim = isimal.getText();
				eklenen.soyisim = soyisimal.getText();
				eklenen.serino = Integer.valueOf(serino.getText());
				eklenen.ucret =  Integer.valueOf((String) sehirsec.getSelectedItem());
				eklenen.KoltukNo = (String) koltuksec.getSelectedItem();
				yolcular.add(eklenen);
				//Ekledikten sonra textfield temizleme iþlemi
				isimal.setText(" ");
				soyisimal.setText(" ");
				serino.setText(null);
				
				
				
			}
			
		});
/////////////////////////////////Yolcularý Alma Ýsi Bitti\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		
/////////////////////////Silme Ýslemine Basliyorum\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		
		duzenle.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e) 
			{
				sil silme = new sil();
				silme.setVisible(true);
				
				silme.btnSil.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e) 
					{
						Double silinen = Double.valueOf(silme.serigir.getText());
						int bul = 0;
						for(int i =0; i<yolcular.size();i++)
						{
							if(yolcular.get(i).serino == silinen)
							{
								bul++;
								yolcular.remove(i);
								JOptionPane.showMessageDialog(null,"Ýþleminiz Baþarýyla Gerçekleþtirildi","Ýþlem Yapýldý", JOptionPane.PLAIN_MESSAGE);
								silme.setVisible(false);
							}
						}
						if(bul == 0)
						{
						JOptionPane.showMessageDialog(null,"Bulunamadý", "bulamadýk", JOptionPane.PLAIN_MESSAGE);
						}
					}
				});
			}
		});
		
		
/////////////////////////Silme Ýslemine Basliyorum\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		
/////////////////////////Yolcularý Gosterme Ýsine Basliyorum\\\\\\\\\\\\\\\\\\\\\\\\\\\
		String[]sutunlar = new String[5];
		sutunlar[0]="Ad";
		sutunlar[1]="Soyad";
		sutunlar[2]="Ücret";
		sutunlar[3]="SeriNo";
		sutunlar[4]="KoltukNo";
		
		ucretegore.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
				
/////////////////////////////////Ucrete Gore Gösterim \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
				
 				int yolcusayisi = yolcular.size();
				Object[][] tablomodeli = new Object[yolcusayisi][5];
				
				for(int i=0 ; i<yolcusayisi ;i++)
				{
					for(int j=0 ; j<5 ;j++)
					{
						if(j==0)
						{
							tablomodeli[i][j] = yolcular.get(i).isim;
						}
						if(j==1)
						{
							tablomodeli[i][j] = yolcular.get(i).soyisim;
						}
						if(j==2)
						{
							tablomodeli[i][j] = Integer.valueOf(yolcular.get(i).ucret);
						}
						if(j==3)
						{
							tablomodeli[i][j] = String.valueOf(yolcular.get(i).serino);
						}
						if(j==4)
						{
							tablomodeli[i][j] = yolcular.get(i).KoltukNo;
						}
						
					}
				}
				TableModel tablemodel=new DefaultTableModel(tablomodeli,sutunlar);
				sirala ismegore = new sirala();
				ismegore.setVisible(true);
				JTable panelim = new JTable();
				panelim.setBounds(98, 70, 340, 200);
				// 93, 23, 323, 200
				panelim.setModel(tablemodel);
				ismegore.contentPane.add(panelim);
				ismegore.setTitle("Yolcularý Goster");
				  JScrollPane scrollPane = new JScrollPane();
			      scrollPane.setBounds(98, 70, 340, 200);
			      ismegore.contentPane.add(scrollPane);
			      scrollPane.setViewportView(panelim);
				
			}
		});
/////////////////////////Yolcularý Gosterme ÝsinÝ Bitirdim\\\\\\\\\\\\\\\\\\\\\\\\\\\\\	
		

		
		ucretegore.setBounds(10, 42, 129, 23);
		panel_48.add(ucretegore);
		ucretegore.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton koltukagore = new JButton("Koltu\u011Fa G\u00F6re");
		koltukagore.setBounds(322, 42, 129, 23);
		panel_48.add(koltukagore);
		koltukagore.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton Serinoyagore = new JButton("SeriNo");
		Serinoyagore.setBounds(175, 42, 129, 23);
		panel_48.add(Serinoyagore);
		Serinoyagore.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblYolcularGoster = new JLabel("Yolcular\u0131 Goster");
		lblYolcularGoster.setBounds(121, 6, 219, 25);
		panel_48.add(lblYolcularGoster);
		lblYolcularGoster.setForeground(SystemColor.textInactiveText);
		lblYolcularGoster.setBackground(SystemColor.menu);
		lblYolcularGoster.setFont(new Font("Swis721 Blk BT", Font.PLAIN, 16));
		lblYolcularGoster.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label = new JLabel("");
		label.setFocusTraversalKeysEnabled(false);
		label.setIcon(new ImageIcon("C:\\Users\\Natgho\\workspace\\BusFirmaX\\img\\arkaplan2.jpg"));
		label.setBounds(0, 0, 718, 442);
		contentPane.add(label);
	}
	class yolcu
	{
		
		public String isim;
		public String soyisim;
		public int  ucret;
		public int serino;
		public String KoltukNo;
		public yolcu()
		{
			isim = "girilmedi";
			soyisim = "girilmedi";
			ucret=0;
			serino=0;
			KoltukNo="girilmedi";
		}
	}
}
	
