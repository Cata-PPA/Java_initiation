package oop;

import java.util.Date;

public class Product {
    private String name;
    private String category;
    private double price;

    private int stock;
    private String brand;
    private String image;



    //constructorul                                   constructorul
        public Product(String name,
                       String category,
                       double price,

                       int stock,
                       String brand,
                       String image){
            this.name=name;
            this.category=category;
            this.price=price;

            this.stock=stock;
            this.brand=brand;
            this.image=image;



        }

//getters                                    getters
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }
    public double getPrice(){
        return price;
    }

    public int getStock(){
        return stock;
    }
    public String getBrand(){
        return brand;
    }
    public String getImage(){
        return image;
    }

// setters                                          setters
    public void setName(String name){
            this.name=name;
    }
    public void setCategory(String category){
            this.category=category;
    }
    public void setPrice(double price){
        this.price=price;
    }

    public void setStock(int stock){
            this.stock=stock;
    }
    public void setBrand(String brand){
            this.brand=brand;
    }
    public void setImage(String image){
            this.image=image;
    }







}
