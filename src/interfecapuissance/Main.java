/*
 * copyright 2015 ; devloppŽe en java ,c ,c++  ;
 *   EditŽs par chabli mohammed yassine et astaoui mohamed  
 *     
 *   Classe :main.java ;
 *   
 *   Defenition:cette classe permette de gestionner les composantes java swing ;
 *   			il s'interesse pour l'interface  de l'aplication;
 * 
 * 
 *   Projet C++ pour MR FARHAOUI Youssef;
 *  
 *   Jeu:PUISSANCE 4 ;
 *  
 *   
 * 
 */


package interfecapuissance;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;

import java.awt.Color;

import javax.swing.JFormattedTextField;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Dialog.ModalExclusionType;

import javax.swing.JButton;
import javax.swing.JSplitPane;

import java.awt.FlowLayout;

import javax.swing.JScrollPane;

import com.sun.istack.internal.FragmentContentHandler;

import algorithmepuissance.joueur;

import java.awt.SystemColor;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main extends JFrame {
	

	
	public static void main(String[] args) {
		 


			
     //_______________frame (l'interface)_____________________
	   JFrame frame=new JFrame();
			frame.setSize(900, 500); 
			frame.setResizable(false);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(new BorderLayout());

			
     //__________________menu de l'interface_________________
			
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 255));
		frame.setJMenuBar(menuBar);
		
		JMenu mnFichier = new JMenu("Fichier");
		menuBar.add(mnFichier);
		
		JMenuItem mntmRejouer = new JMenuItem("Rejouer");
		mnFichier.add(mntmRejouer);
		
		JMenuItem mntmQuitter = new JMenuItem("quitter");
		mnFichier.add(mntmQuitter);

		
		JMenu mnAide = new JMenu("Aide");
		menuBar.add(mnAide);
		
		JMenuItem mntmCommentJouer = new JMenuItem("Comment jouer ?");
		mnAide.add(mntmCommentJouer);
		
		JMenuItem mntmAProposDe = new JMenuItem("A propos de nous");
		mnAide.add(mntmAProposDe);
		
		

		//____________Fin MENU___________________
		
		
		
		//____________Gridlayout qui contient les composantes des labels___________________
		
		   GridLayout t=new GridLayout(7,7);
			   t.setHgap(5);
			   t.setVgap(5);
				
	   //____________Jpanel qui contient les labels sont GRidlayout est t defini avant___________________
				
		   JPanel jp=new JPanel();
			  jp.setLayout(t);
			  jp.setBackground(new Color(145,205,251));
			  
			  
			   
			  
			  
			  
			//____________Jpanel du gauche___________________
				
				
				JPanel jpr=new JPanel();
			    jpr.setLayout(new GridLayout(2,2));
			    JLabel pseudo1l = new JLabel("Pseudo:");
			    JLabel pseudo1 = new JLabel(MyLabel.b.getPseudo());

				JLabel score1l = new JLabel("score du :");
				scorelabel.b.setText(""+MyLabel.b.getScore());
                 jpr.add(pseudo1l);
                 jpr.add(pseudo1);
                 jpr.add(score1l);
                 jpr.add(scorelabel.b);
                 
			    jpr.setBackground(new Color(203,30,28));
			    
			    
			    
			    
			//____________Jpanel du droit___________________
				
		        JPanel jpright=new JPanel();
				jpright.setLayout(new GridLayout(2,2));
				JLabel pseudo2l = new JLabel("Pseudo:");
				JLabel pseudo2 = new JLabel(MyLabel.a.getPseudo());
				JLabel score2l = new JLabel("score du : ");
				scorelabel.a.setText(""+MyLabel.a.getScore());

				jpright.add(pseudo2l);
				jpright.add(pseudo2);
		    	jpright.add(score2l);
				jpright.add(scorelabel.a);
				jpright.setBackground(new Color(248,230,53));
		   
                				
				
				//____________Jpanel du bas___________________
                JPanel jpbottom=new JPanel();
                JLabel lbotttom=new JLabel("copyrightª 2015 all rights reserved ");
				jpbottom.add(lbotttom);
				


			
				//____________ajout des labels gris___________________
				
				
		           for(int i=0;i<6;i++){
		        	   for(int j=0;j<7;j++){
		        		   MyLabel d=new MyLabel(i,j,Color.DARK_GRAY,"");
		        		   
		        		   gestion.ajouter(d,i,j);
		        		   
		        		   jp.add(d);
			   
		        	   }
		   			
		           }
		           
			
         //____________ajout des labels orange en bas qui difinissent la colonnes ou le joueurs veut remplir___________________
   		 
    	   for(int j=0;j<7;j++){
               MyLabel o=new MyLabel(6,j,Color.ORANGE,""+j);
               o.evenement_de_click();
               gestion.ajouter(o,6,j);
    		   jp.add(o);
    	   }
            
			
    	 //____________ajout des composantes jpanel a la frame (interface)___________________
   			
		    frame.getContentPane().add(jp,BorderLayout.CENTER);
		    frame.getContentPane().add(jpright,BorderLayout.WEST);	
		    
		    frame.getContentPane().add(jpr, BorderLayout.EAST);
		    frame.getContentPane().add(jpbottom, BorderLayout.SOUTH);
		    
		    
		    //_______les evenements__________________________
		    
		    mntmQuitter.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
					System.exit(0);
					
				}
			});
		    
		    mntmAProposDe.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null,"Puissance 4 :copyrights 2015 par:\n CHABLI mohammed yassine \nASTAOUI Mohamed \n"
							+ "A: MR FARHAOUI","A propos du puissance 4", JOptionPane.INFORMATION_MESSAGE);
	            			  
					
				}
			});
		    
		    
		    mntmRejouer.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
					gestion.rejouer();
				}
			});
		    
		    
		    mntmCommentJouer.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
					JOptionPane.showMessageDialog(null,"pour chaque utilisateur , il faut qu'il rempli 4 cases suivies horizontale,verticale,"
							+ "\ndiagonale droit ou gauche  "
							+ " pour chaqu'un de vous , vous avez une couleur diffirente pour joueur \nc tous, amusez vous de jouer","comment jouer  puissance 4", JOptionPane.INFORMATION_MESSAGE);

					
					
				}
			});
		    
		    
    
	frame.setVisible(true);
	}
	
	
 
}
