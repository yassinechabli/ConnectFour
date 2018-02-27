/*
 * copyright 2015 ; devloppée en java ,c ,c++  ;
 *   Edités par chabli mohammed yassine et astaoui mohamed  
 *     
 *   Classe :joueur.java ;
 *   
 *   Defenition:la classe "joueur" avec les getters et setters 
 * 
 *   Projet C++ pour MR FARHAOUI Youssef;
 *  
 *   Jeu:PUISSANCE 4 ;
 *  
 *   
 * 
 */

package algorithmepuissance;


import java.awt.Color;


public class joueur {
	
	String pseudo;
	int score;
	boolean gagne;
    Color c;
	
	//contructeurs de la classe joueur
	public joueur(){
		this.pseudo="iconnu";
		this.score=0;
		this.gagne=false;
		this.c=Color.white;
		
	}
	
	public joueur(String nom, int score,Color c) {
		this.pseudo = nom;
		this.score = score;
		this.gagne=false;
		this.c=c;
		
	}

	
	//getters and setters

	public String getPseudo() {
		return pseudo;
	}


	public void setPseudo(String nom) {
		this.pseudo = nom;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public boolean isGagne() {
		return gagne;
	}

	public void setGagne(boolean gagne) {
		this.gagne = gagne;
	}

	public void setColor(Color c) {
		this.c = c;
	}


	public Color getColor() {
		return c;
	}
// la fonction tostring
	
	public String toString(){
		return this.pseudo+"   "+this.score+"   "+this.gagne;
		
	}

}
