/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconsole.entity;

/**
 *
 * @author DELL
 */
public class MainThread extends Customer{
    public void Giaodich(){
        productName();
        checkout();
        printString();        
        
        
    }
        

     public static void main(String[] args) {
        MainThread customer01 = new MainThread();
        customer01.setId("01");
        customer01.setName("Truong");
        customer01.setEmail("truongvvd00423@fpt.edu.vn");
        customer01.setBirthday("14/02/1998");
        customer01.setBalance("2000000");
        customer01.setAvatar("null");
        customer01.setStatus("null");
    
        customer01.Giaodich();
              
}
}
