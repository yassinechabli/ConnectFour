/*
 * copyright 2015 ; devloppée en java ,c ,c++  ;
 *   Edités par chabli mohammed yassine et astaoui mohamed  
 *     
 *   Classe :gestion.java ;
 *   
 *   Defenition:les traitment de cette classes possede plusieurs fonctions dont chacune permette de realiser un but précis
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

import java.awt.Color;
import java.awt.Label;
import java.awt.color.ColorSpace;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import algorithmepuissance.joueur;

public class gestion {
	
	//tableau qui contient les labels a remplir par les joueurs
static MyLabel[][] tab=new MyLabel[7][7];



// getters et setters
public static MyLabel[][] getTab() {
	return tab;
}

public static void setTab(MyLabel[][] tab) {
	gestion.tab = tab;
}

/*
 * ____________________________________________________________
 */


/*
 * fonction d'ajout d'un label dans le tableu . en faite c'un un tableau de type Mylabels qui possede tous les elements 
 */
public static  void ajouter(MyLabel l, int i,int j){
	tab[i][j]=l;
	
	
}

/*
 * fontion lister() permet de lister la labels du tableau au console juste pour suiver le chemain du jeu 
 */
public  static void lister(){
	for(int i=0;i<=6;i++){
  	  for(int j=0;j<=6;j++){
  		  System.out.println(tab[i][j].getX()+" "+tab[i][j].getY()+" "+tab[i][j].getC());
  	  }
	}
}

/*
 * dans cette etape , a chaque fois que le joueur fait un clique ; on doit chercher s'il est gagné ou pas
 *  pour cela on fait 4 verification ; les fonctions contient des prototypes comprehensible
 *   au traitement de chacune pour savoir qu'est ce qu'elle faite
 */

public static void verification_horizontale(joueur a) 
{
	
	for(int i=5;i>=0;i--)
    {
        for(int j=0;j<=3;j++)
        {
            if(tab[i][j].getC()==a.getColor() && tab[i][j+1].getC()==a.getColor() && tab[i][j+2].getC()==a.getColor() && tab[i][j+3].getC()==a.getColor()){
            	
            	try {
					Thread.sleep(200);
					tab[i][j].setBackground(Color.WHITE);
					Thread.sleep(200);
					tab[i][j+1].setBackground(Color.WHITE);
					Thread.sleep(200);
					tab[i][j+2].setBackground(Color.WHITE);
					Thread.sleep(200);
					tab[i][j+3].setBackground(Color.WHITE);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                a.setGagne(true);
				a.setScore(a.getScore()+1);
            }
        }
    }
}

public static void verification_verticale(joueur a) {
	   for(int j=0;j<=6;j++){
		   for(int i=5;i>=3;i--){
			   if(tab[i][j].getC()==a.getColor() && tab[i-1][j].getC()==a.getColor() &&tab[i-2][j].getC()==a.getColor() && tab[i-3][j].getC()==a.getColor()){
				   try {
						Thread.sleep(200);
						tab[i][j].setBackground(Color.WHITE);
						Thread.sleep(200);
						tab[i-1][j].setBackground(Color.WHITE);
						Thread.sleep(200);
						tab[i-2][j].setBackground(Color.WHITE);
						Thread.sleep(200);
						tab[i-3][j].setBackground(Color.WHITE);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				   a.setGagne(true);
					a.setScore(a.getScore()+1);
			   }
		   }	   
	   }
	
	    }


public static void verification_diagonale_bas_gauche_vers_haut_droite(joueur a){
	for(int i=5;i>=3;i--){
		
		for(int j=0;j<=3;j++){
			if(tab[i][j].getC()==a.getColor() && tab[i-1][j+1].getC()==a.getColor() &&tab[i-2][j+2].getC()==a.getColor() && tab[i-3][j+3].getC()==a.getColor()){ 
				try {
					Thread.sleep(200);
					tab[i][j].setBackground(Color.WHITE);
					Thread.sleep(200);
					tab[i-1][j+1].setBackground(Color.WHITE);
					Thread.sleep(200);
					tab[i-2][j+2].setBackground(Color.WHITE);
					Thread.sleep(200);
					tab[i-3][j+3].setBackground(Color.WHITE);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				a.setGagne(true);
				a.setScore(a.getScore()+1);

			}
		}
	}
	
}




public static void verification_diagonale_bas_droit_vers_haut_gauche(joueur a){
	
for(int i=5;i>=3;i--){
		
		for(int j=6;j>=3;j--){
			if(tab[i][j].getC()==a.getColor() && tab[i-1][j-1].getC()==a.getColor() &&tab[i-2][j-2].getC()==a.getColor() && tab[i-3][j-3].getC()==a.getColor()){
				
				try {
					Thread.sleep(200);
					tab[i][j].setBackground(Color.WHITE);
					Thread.sleep(200);
					tab[i-1][j-1].setBackground(Color.WHITE);
					Thread.sleep(200);
					tab[i-2][j-2].setBackground(Color.WHITE);
					Thread.sleep(200);
					tab[i-3][j-3].setBackground(Color.WHITE);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				a.setGagne(true);
				a.setScore(a.getScore()+1);
			}
			
		}
}
	
	
	
	
}

public static void rejouer(){

	  for(int  i=0;i<6;i++){
		  for(int j=0;j<=6;j++){
			  gestion.tab[i][j].setC(Color.DARK_GRAY);
			  gestion.tab[i][j].setBackground(Color.DARK_GRAY);
			  
		  }
		  MyLabel.a.setScore(0);
		  MyLabel.b.setScore(0);
		  scorelabel.a.setText("0");
		  scorelabel.a.setText("0");
		   
	  }
}























	
	
	
	
	

	


}
