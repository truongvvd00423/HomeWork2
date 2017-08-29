/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconsole.entity;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Customer {
    private String id;
    private String name;
    private String email;
    private String birthday;
    private String balance;
    private String avatar;
    private String status;
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
     
    public void productName(){
        System.out.println("Nhập tên sản phẩm");
        Scanner scanner = new Scanner(System.in);
        String Product = scanner.nextLine();
        
        System.out.println(" Khách hàng đã chọn sản phẩm: "  + Product);
    
    
    }
    
    public void checkout(){
        System.out.println("Người dùng chọn thanh toán hóa đơn");
    }
    
    
    
    
    @Override
    public String toString() {
        return  "Id: " + id + ",\n Tên khách hàng: " + name + ",\n Email: " + email + ",\n Sinh ngày: " + birthday + ",\n Số tiền đang có trong tài khoản: " + balance + "\nẢnh đại diện: " + avatar + ",\n Trạng thái: " + status + '}';
    }
    
    public void printString(){
        System.out.println(toString());
    }
    
    
      
    
}
