/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.Classi;

/**
 *
 * @author Giacomo
 */
public class Utente {
    private int id;
    private String name;
    private String surname;
    private String sex;
    private int age;
    private String presentation;
    private String password;
    private String urlProfileImage;
    
    public Utente(){
        
        id = 0;
        name="";
        surname="";
        sex="";
        age=0;
        password="";
        urlProfileImage="";
        
    
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public String getUrlProfileImage() {
        return urlProfileImage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrlProfileImage(String urlProfileImage) {
        this.urlProfileImage = urlProfileImage;
    }
    
    public String getPresentation(){
        return presentation;
    }
    
    public void setPresentation(String presentation){
        this.presentation = presentation;
    }
   
    
    
    
}
