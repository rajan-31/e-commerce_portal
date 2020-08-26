package com.pbl.ecommerce;

import java.io.InputStream;

public class ProductOrder {

    private int no;
    private String name;
    private int price;
    private byte[] image;
    
    public ProductOrder(){}
    
    public ProductOrder(int no, String name, int price,    byte[] image){
    
        this.no = no;
        this.name = name;
        this.price = price;
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
    

    public byte[] getMyImage(){
        return image;
    }
}
