package com.pbl.ecommerce;

import java.io.InputStream;

public class Product {

    private int no;
    private String name;
    private int price;
    private int stock;
    private byte[] image;
    
    //public Product(){}
    
    public Product(int no, String name, int price,  int stock,  byte[] image){
    
        this.no = no;
        this.name = name;
        this.price = price;
        this.stock=stock;
        this.image = image;
        
       
    }
    
    
    public int getID(){
      return no;
    }
    
    public void setID(int no){
        this.no = no;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
   
    
    public int getPrice(){
        return price;
    }
    
    public void setPrice(int price){
        this.price = price;
    }
    
    
    public int getStock(){
        return stock;
    }
    
    public void getStock(int stock){
        this.stock = stock;
    }
    
    public byte[] getMyImage(){
        return image;
    }
}
