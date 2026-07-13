/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas_Arrays;

/**
 *
 * @author Maria Eduarda
 */
public class User {
    private int code;
    private String name;
    
        public int getCode(){
            return this.code;
        }
        
        public void setCode( int code){
            this.code = code;
        }
        
        public String getName(){
            return this.name;
        }
        
        public void setName(String name){
            this.name = name;
        }
        
        public User(){
        
        }
        
        public User(int code,String name){
            this.name = name;
            this.code = code;
        
        }
}
