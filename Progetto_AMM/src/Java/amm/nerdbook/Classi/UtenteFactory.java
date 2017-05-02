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
public class UtenteFactory {
    
    private static UtenteFactory singleton;
    
    public static UtenteFactory getInstance(){
        if(singleton==null){
            singleton = new UtenteFactory();
        }
         return singleton;
    }
    
    private ArrayList<Utente> listaUtenti = new ArrayList<Utente>();
    
    private UtenteFactory(){
        
        Utente utente1 = new Utente();
        utente1.setId(0);
        utente1.setName("Jay");
        utente1.setSurname("Weinberg");
        utente1.setSex("Maschio");
        utente1.setAge(35);
        utente1.setPassword("Vermillion");
        utente1.setUrlProfileImage("M2/img/jay.jpg");
        utente1.setPresentation("We're gonna rock this world!!");
        
        Utente utente2 = new Utente();
        utente2.setId(1);
        utente2.setName("Martufello");
        utente2.setSurname("DaMartufellandia");
        utente2.setSex("Maschio");
        utente2.setAge(55);
        utente2.setPassword("MagoOthelma");
        utente2.setUrlProfileImage("M2/img/martufello.jpg");
        utente2.setPresentation("Cià");
        
        Utente utente3= new Utente();
        utente3.setId(2);
        utente3.setName("Carlo");
        utente3.setSurname("Conti");
        utente3.setSex("Maschio");
        utente3.setAge(57);
        utente3.setPassword("Vermillion");
        utente3.setUrlProfileImage("M2/img/jay.jpg");
        utente1.setPresentation("Scossa? Va beneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        
        listaUtenti.add(utente1);
        listaUtenti.add(utente2);
        listaUtenti.add(utente3);
    }
    
     public Utente getGattoById(int id) {
        for (Utente utente : this.listaUtenti) {
            if (utente.getId() == id) {
                return utente;
            }
        }
        return null;
    }
    
    public int getIdByUserAndPassword(String user, String password){
        for(Utente utente : this.listaUtenti){
            if(utente.getName().equals(user) && utente.getPassword().equals(password)){
                return utente.getId();
            }
        }
        return -1;
    }

}
