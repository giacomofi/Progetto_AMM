/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.Classi;

import java.util.ArrayList;

/**
 *
 * @author Giacomo
 */
public class GruppiFactory {
    
    private static GruppiFactory singleton;
    
    public static GruppiFactory getInstance(){
        if(singleton==null){
            singleton = new GruppiFactory();
        }
         return singleton;
    }
    private ArrayList<Gruppi> listaGruppi = new ArrayList<Gruppi>();
    
    public GruppiFactory(){
    
        Gruppi gruppo1 = new Gruppi();
        gruppo1.setId(100);
        gruppo1.setMembers(3);
        gruppo1.setGroup_name("Orsi di Yellowstone");
        
        Gruppi gruppo2 = new Gruppi();
        gruppo2.setId(101);
        gruppo2.setMembers(4);
        gruppo2.setGroup_name("Pitagorici");
    
    }
    
    public Gruppi getGruppoById(int id) {
        for (Gruppi gruppo : this.listaGruppi) {
            if (gruppo.getId() == id) {
                return gruppo;
            }
        }
        return null;
    }
}
