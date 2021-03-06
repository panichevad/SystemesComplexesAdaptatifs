package jeuDeVie.vue;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import jeuDeVie.modele.Modele;

@SuppressWarnings("serial")
public class MainClass extends JFrame{

	public MainClass(){
		
		super("Systemes Complexes Adaptatifs - Jeu de vie");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    Modele m = new Modele();
	    //m.affichageLabyrinthe();
	    
	    VueGraphique vg = new VueGraphique(m);
	    this.add(vg, BorderLayout.NORTH);
	    
	    VueBoutons vb = new VueBoutons(m);
	    
	   
        this.add(vb, BorderLayout.CENTER);
        this.setJMenuBar(new VueMenu(m));
		
        m.miseAJour();
        
        pack() ;
        setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainClass();
	}

}
