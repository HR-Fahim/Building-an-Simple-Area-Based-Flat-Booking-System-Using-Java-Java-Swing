import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Toolkit;

public class Confirm {

	public JFrame frmConfirmationWindow;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Confirm window = new Confirm();
					window.frmConfirmationWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Confirm() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmConfirmationWindow = new JFrame();
		frmConfirmationWindow.setTitle("Confirmation Window");
		frmConfirmationWindow.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java Project\\Icons\\2.png"));
		frmConfirmationWindow.getContentPane().setBackground(new Color(188, 143, 143));
		frmConfirmationWindow.setBounds(100, 100, 465, 257);
		frmConfirmationWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConfirmationWindow.setLocationRelativeTo(null);
		
		JButton btnConfirm = new JButton("CONFIRM");
		btnConfirm.setForeground(Color.WHITE);
		btnConfirm.setBackground(new Color(128, 0, 0));
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConfirm.setBounds(96, 139, 108, 25);
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Book b = new Book();
                b.main(null);
				
                frmConfirmationWindow.setVisible(false);
				
				
				
				
//				FileWriter myWriter;
//				
//				try {  
//					
//				
//                  String path = "C://Java Project//FamilySelection//Common.txt";
//					
//					FileReader fr = new FileReader(path);
//		            BufferedReader br = new BufferedReader(fr);
//		            
//		            String line, fArea,fFlat;
//		            boolean isLoginSuccess = false;
//		            
//		          
//		            while ((line = br.readLine()) != null) {
//		            	
//		            	fArea = line.split(" ")[0];
//		                fFlat = line.split(" ")[1];
//		                
//		                
//		                
//		                
//		                if (fArea.equals("Mirpur") && fFlat.equals("flat1")) {
//		                    isLoginSuccess = true;
//		                    
//		                    Sold s = new Sold();
//			        		s.main(null);
//			        		
//		                    
//		                    
//		    				
//		    				break;
//		                } 
//		                if (fArea.equals("Mirpur") && fFlat.equals("Flat")) {
//		                    isLoginSuccess = true;
//		                    
//		                    Sold s = new Sold();
//			        		s.main(null);
//			        		
//		                    
//		                    
//		    				
//		    				break;
//		                } 
//		            }
//		        	if(!isLoginSuccess) {
//		        		FileWriter myWriter1 = new FileWriter("C://Java Project//FamilySelection//Common.txt",true);
//			        	  myWriter1.write(" "+"done");
//			        	  myWriter1.close();
//		        		Book b = new Book();
//		                b.main(null);
//		        	}
//		        	
//		        	
//	                frame.setVisible(false);
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
			}
		});
		frmConfirmationWindow.getContentPane().setLayout(null);
		frmConfirmationWindow.getContentPane().add(btnConfirm);
		
		JLabel lblNewLabel = new JLabel("Do you confirm?");
		lblNewLabel.setFont(new Font("Tekton Pro Cond", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(49, 51, 344, 56);
		frmConfirmationWindow.getContentPane().add(lblNewLabel);
		
		JButton btnNo = new JButton("NO");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmConfirmationWindow.setVisible(false);
			}
		});
		btnNo.setForeground(Color.WHITE);
		btnNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNo.setBackground(new Color(128, 0, 0));
		btnNo.setBounds(233, 139, 108, 25);
		frmConfirmationWindow.getContentPane().add(btnNo);
	}
}
