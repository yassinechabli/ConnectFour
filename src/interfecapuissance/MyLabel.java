package interfecapuissance;


import java.awt.Color;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import algorithmepuissance.joueur;


public class MyLabel extends Label {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int x;
	int y;
	Color c;
	  static  joueur a=new joueur("joueur 1", 0, new Color(243,214,50));
      static joueur b=new joueur("joueur 2", 0,new Color(223,91,72));
	static int role=0;
  

	//constructors with 4 parameters (String text)
	
	public MyLabel(int x,int y ,Color c,String txt) {
	    super(txt);
	    this.x=x;
	    this.y=y;
	    this.c=c;
	    this.setBackground(c);
	    	  	 
	    
   }
	

	
	
	
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public Color getC() {
	return c;
}
public void setC(Color c) {
	this.c = c;
	this.setBackground(c);
}
public String ToString(){
	
	return "("+this.x+","+this.y+")"+":"+this.c;
	
	
}





public void evenement_de_click(){
	
	this.addMouseListener(new MouseListener() {
		
  		@Override
  		public void mouseReleased(MouseEvent arg0) {
  			// TODO Auto-generated method stub

  			
  		}
  		
  		@Override
  		public void mousePressed(MouseEvent arg0) {
  			// TODO Auto-generated method stub
  			
  		}
  		
  		@Override 
  		public void mouseExited(MouseEvent arg0) {
  			// TODO Auto-generated method stub
  			
  		}
  		
  		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
  
  		
  		@Override
  		public void mouseClicked(MouseEvent e) {
  			// TODO Auto-generated method stub
  			gestion.lister();
  			boolean etat=false;
 			 System.out.println("label is clecked"+"("+getX()+","+getY()+")");
             
  			if((getC()==Color.ORANGE)){
  		     
  	             int colon=getY();

  		     System.out.println("vous avez cliquez sur la colonne"+colon); 
  		     
              for(int i=5;i>=0;i--){
            		  if(gestion.tab[i][colon].getY()==colon && gestion.tab[i][colon].getC()==Color.DARK_GRAY){
            			  if(role%2==0){
            			
            			  gestion.tab[i][colon].setC(a.getColor());
            			  gestion.tab[i][colon].setBackground(a.getColor());
            			  
            			  gestion.verification_horizontale(a);
            			  gestion.verification_verticale(a);
            			  gestion.verification_diagonale_bas_droit_vers_haut_gauche(a);
            			  gestion.verification_diagonale_bas_gauche_vers_haut_droite(a);
            			 

            			  if(a.isGagne()==true){
            			  JOptionPane.showMessageDialog(null, a.getPseudo()+"a gagné", "Information",
            			  JOptionPane.INFORMATION_MESSAGE);
            			  a.setGagne(false);
            			  a.setScore(a.getScore()+1);
            			  scorelabel.a.setText(a.getScore()+"");
            			  for( i=0;i<6;i++){
            				  for(int j=0;j<=6;j++){
            					  gestion.tab[i][j].setC(Color.DARK_GRAY);
            					  gestion.tab[i][j].setBackground(Color.DARK_GRAY);
            					  
            				  }
            			  }
            			  
            			  }
            			  }
            			  else{
            				  gestion.tab[i][colon].setC(b.getColor());
                			  gestion.tab[i][colon].setBackground(b.getColor());
                			  gestion.verification_horizontale(b);
                			  gestion.verification_verticale(b);
                			  gestion.verification_diagonale_bas_droit_vers_haut_gauche(b);
                			  gestion.verification_diagonale_bas_gauche_vers_haut_droite(b);
                			 
                			 
                			  
                			  if(b.isGagne()==true){
                			  JOptionPane jop1 = new JOptionPane();
                			  JOptionPane.showMessageDialog(null, b.getPseudo()+"a gagné", "Information",
                			  JOptionPane.INFORMATION_MESSAGE);
                			  b.setGagne(false);
                			  b.setScore(b.getScore()+1);
                			  scorelabel.b.setText(b.getScore()+"");

                			  for( i=0;i<6;i++){
                				  for(int j=0;j<=6;j++){
                					  gestion.tab[i][j].setC(Color.DARK_GRAY);
                					  gestion.tab[i][j].setBackground(Color.DARK_GRAY);
                					  
                				  }
                			  }

                			  }
                			  
            			  }
            			  role++;
            			  break;
            		  }
            		  
            	  
            	  
              }
              gestion.lister();
  		     
  		  
		
  		     }	 
  			
  		 
  		}
  		
  		
		
		
  	});
	
}


  
}
