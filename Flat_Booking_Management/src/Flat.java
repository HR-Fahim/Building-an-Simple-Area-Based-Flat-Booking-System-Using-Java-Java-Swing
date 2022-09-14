import java.awt.EventQueue;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Font;

public class Flat {

	private JFrame frmFlatSelection;
	private JTextField SELECTION;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Flat window = new Flat();
					window.frmFlatSelection.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Flat() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFlatSelection = new JFrame();
		frmFlatSelection.getContentPane().setBackground(Color.DARK_GRAY);
		frmFlatSelection.setResizable(false);
		frmFlatSelection.setType(Type.POPUP);
		frmFlatSelection.setTitle("Flat Selection");
		frmFlatSelection.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java Project\\Icons\\1.png"));
		frmFlatSelection.setBounds(100, 100, 686, 607);
		frmFlatSelection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFlatSelection.setLocationRelativeTo(null);

		JButton btnRoom_1 = new JButton("flat1");
		btnRoom_1.setBounds(0, 126, 126, 126);
		btnRoom_1.setIcon(new ImageIcon("C:\\Java Project\\RoomPic\\1.jpg"));
		btnRoom_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				try{	 boolean Success = true;
//				
//				if(Success) {
//					FileWriter myWriter = new FileWriter("C://Java Project//FamilySelection//Common.txt",true);
//				
//	        	  myWriter.write("flat1"+" "+Success);
//	        	  myWriter.close();
//				  
//	        	  Confirm c = new Confirm();
//	        	  c.main(null);
//	        	  Success = false;
//	        	  myWriter.write("flat1"+" "+Success);
//	        	  myWriter.close();
//	        	
//				}}
//			catch (IOException ep) {
//			      
//			      ep.printStackTrace();
//			}
			}
		});
		frmFlatSelection.getContentPane().setLayout(null);

		JLabel lblRoom = new JLabel("FLT1");
		lblRoom.setForeground(Color.WHITE);
		lblRoom.setBounds(10, 255, 90, 26);
		lblRoom.setHorizontalAlignment(SwingConstants.CENTER);
		frmFlatSelection.getContentPane().add(lblRoom);

		JLabel lblFlt = new JLabel("FLT2");
		lblFlt.setForeground(Color.WHITE);
		lblFlt.setBounds(159, 255, 90, 26);
		lblFlt.setHorizontalAlignment(SwingConstants.CENTER);
		frmFlatSelection.getContentPane().add(lblFlt);

		JLabel lblFlt_1 = new JLabel("FLT3");
		lblFlt_1.setForeground(Color.WHITE);
		lblFlt_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFlt_1.setBounds(296, 255, 90, 26);
		frmFlatSelection.getContentPane().add(lblFlt_1);

		JLabel lblFlt_2 = new JLabel("FLT4");
		lblFlt_2.setForeground(Color.WHITE);
		lblFlt_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblFlt_2.setBounds(437, 255, 90, 26);
		frmFlatSelection.getContentPane().add(lblFlt_2);

		JLabel lblFlt_3 = new JLabel("FLT5");
		lblFlt_3.setForeground(Color.WHITE);
		lblFlt_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblFlt_3.setBounds(580, 252, 90, 26);
		frmFlatSelection.getContentPane().add(lblFlt_3);

		JLabel lblFlt_4 = new JLabel("FLT6");
		lblFlt_4.setForeground(Color.WHITE);
		lblFlt_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblFlt_4.setBounds(10, 418, 90, 26);
		frmFlatSelection.getContentPane().add(lblFlt_4);

		JLabel lblFlt_5 = new JLabel("FLT7");
		lblFlt_5.setForeground(Color.WHITE);
		lblFlt_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblFlt_5.setBounds(159, 418, 90, 26);
		frmFlatSelection.getContentPane().add(lblFlt_5);

		JLabel lblFlt_6 = new JLabel("FLT8");
		lblFlt_6.setForeground(Color.WHITE);
		lblFlt_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblFlt_6.setBounds(296, 418, 90, 26);
		frmFlatSelection.getContentPane().add(lblFlt_6);

		JLabel lblFlt_7 = new JLabel("FLT9");
		lblFlt_7.setForeground(Color.WHITE);
		lblFlt_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblFlt_7.setBounds(437, 418, 90, 26);
		frmFlatSelection.getContentPane().add(lblFlt_7);

		JLabel lblFlt_8 = new JLabel("FLT10");
		lblFlt_8.setForeground(Color.WHITE);
		lblFlt_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblFlt_8.setBounds(580, 418, 90, 26);
		frmFlatSelection.getContentPane().add(lblFlt_8);
		frmFlatSelection.getContentPane().add(btnRoom_1);

		JButton button = new JButton("flat1");
		button.setIcon(new ImageIcon("C:\\Java Project\\RoomPic\\2.jpg"));
		button.setBounds(137, 125, 126, 126);
		frmFlatSelection.getContentPane().add(button);

		JButton button_1 = new JButton("flat1");
		button_1.setIcon(new ImageIcon("C:\\Java Project\\RoomPic\\3.jpg"));
		button_1.setBounds(275, 126, 126, 126);
		frmFlatSelection.getContentPane().add(button_1);

		JButton button_2 = new JButton("flat1");
		button_2.setIcon(new ImageIcon("C:\\Java Project\\RoomPic\\4.jpg"));
		button_2.setBounds(415, 126, 126, 126);
		frmFlatSelection.getContentPane().add(button_2);

		JButton button_3 = new JButton("flat1");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setIcon(new ImageIcon("C:\\Java Project\\RoomPic\\5.jpg"));
		button_3.setBounds(550, 126, 126, 126);
		frmFlatSelection.getContentPane().add(button_3);

		JButton button_4 = new JButton("flat1");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_4.setIcon(new ImageIcon("C:\\Java Project\\RoomPic\\1.jpg"));
		button_4.setBounds(1, 292, 126, 126);
		frmFlatSelection.getContentPane().add(button_4);

		JButton button_5 = new JButton("flat1");
		button_5.setIcon(new ImageIcon("C:\\Java Project\\RoomPic\\6.jpeg"));
		button_5.setBounds(138, 294, 126, 126);
		frmFlatSelection.getContentPane().add(button_5);

		JButton button_6 = new JButton("flat1");
		button_6.setIcon(new ImageIcon("C:\\Java Project\\RoomPic\\7.jpg"));
		button_6.setBounds(274, 293, 126, 126);
		frmFlatSelection.getContentPane().add(button_6);

		JButton button_7 = new JButton("flat1");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_7.setIcon(new ImageIcon("C:\\Java Project\\RoomPic\\8.jpg"));
		button_7.setBounds(416, 294, 126, 126);
		frmFlatSelection.getContentPane().add(button_7);

		JButton button_8 = new JButton("flat1");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_8.setIcon(new ImageIcon("C:\\Java Project\\RoomPic\\9.jpg"));
		button_8.setBounds(550, 294, 126, 126);
		frmFlatSelection.getContentPane().add(button_8);

		SELECTION = new JTextField();
		SELECTION.setBounds(275, 478, 126, 34);
		frmFlatSelection.getContentPane().add(SELECTION);
		SELECTION.setColumns(10);

		JLabel lblNewLabel = new JLabel("Enter Selection");
		lblNewLabel.setFont(new Font("Brush Script Std", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(50, 463, 258, 69);
		frmFlatSelection.getContentPane().add(lblNewLabel);

		JButton confirm = new JButton("CONFIRM");
		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String SELECTION1 = SELECTION.getText().toString();
				String DELETE;
				boolean Success = true;
				try {
					if(!SELECTION1.isEmpty()) {
						String path = "C:\\Java Project\\FamilySelection\\Common.txt";

						FileReader fr = new FileReader(path);
						BufferedReader br = new BufferedReader(fr);
						FileReader UR = new FileReader(path);
						BufferedReader USR = new BufferedReader(UR);

						String line, fCheck;
						Success = true;

						while ((line = br.readLine()) != null) {

							fCheck = line.split(" ")[0];

							if (fCheck.equals(SELECTION1)) {

								FileWriter myWriter = new FileWriter("C://Java Project//User txt//User.txt", true);

								myWriter.write(SELECTION.getText() + " " + "selected" + "\n");
								myWriter.close();

								Confirm c = new Confirm();
								c.main(null);

								File inputFile = new File(path);
								File tempFile = new File("C:\\\\Java Project\\\\FamilySelection\\\\myTempFile.txt");

								BufferedReader reader = new BufferedReader(new FileReader(inputFile));
								BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

								String lineToRemove = SELECTION1;
								String currentLine;

								while ((currentLine = reader.readLine()) != null) {
									// trim newline when comparing with lineToRemove
									String trimmedLine = currentLine.trim();
									if (trimmedLine.equals(lineToRemove))
										continue;
									writer.write(currentLine + System.getProperty("line.separator"));
								}
								writer.close();
								reader.close();
								File inputFile1 = new File("C:\\\\Java Project\\\\FamilySelection\\\\myTempFile.txt");
								File tempFile2 = new File(path);

								BufferedReader reader1 = new BufferedReader(new FileReader(inputFile1));
								BufferedWriter writer2 = new BufferedWriter(new FileWriter(tempFile2));

								String currentLine1;

								while ((currentLine1 = reader1.readLine()) != null) {

									writer2.write(currentLine1 + System.getProperty("line.separator"));
								}
								writer2.close();
								reader1.close();

								BufferedWriter writer3 = new BufferedWriter(new FileWriter(inputFile1));
								writer3.write("");
								writer3.close();
								Success = false;

								frmFlatSelection.setVisible(false);

							}

						}
						if (Success) {
							Sold s = new Sold();
							s.main(null);
						}
						br.close();
						fr.close();
					}
					else {
						PutInfo pi = new PutInfo();
						pi.main(null);
					}
				} catch (Exception ep) {
					ep.printStackTrace();
				}
			}
		});
		confirm.setBounds(437, 484, 104, 23);
		frmFlatSelection.getContentPane().add(confirm);

		JLabel lblNewLabel_1 = new JLabel("Choose Your Flat");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Brush Script MT", Font.PLAIN, 45));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(137, 30, 404, 69);
		frmFlatSelection.getContentPane().add(lblNewLabel_1);
	}
}
