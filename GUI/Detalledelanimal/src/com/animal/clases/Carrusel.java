/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.animal.clases;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Vicma
 */
public class Carrusel {
    
    private List<ImageIcon> images;
    private int index = 0;
    
    public Carrusel(){
    
          images = new ArrayList<>();  
    }
    
    public Carrusel(List<ImageIcon> images){
     this.images = new ArrayList<> (images);
    }
    
    public List<ImageIcon> getImages(){
        return images;
    }
    
    public ImageIcon getCurrentImage(){
        if (images.isEmpty()) return null;
        return  images.get(index);
    }
    
    public int getIndex(){
        return index;
    }
    
    public void setImages(List<ImageIcon>images){
    
        this.images= new ArrayList<>(images);
        this.index = 0;
    }
    
    public void addImage(ImageIcon img){
        images.add(img);
    }
    
    public void removeImage(int i){
    
        if(i>=0 && i <images.size()){
        images.remove(i);
        if(index >= images.size())index=images.size()-1;
        }    
    }
    
    public void next(){

        if(!images.isEmpty()){
            index = (index+1)% images.size();
        } 
    }  
    
    public void previous(){

        if(!images.isEmpty()){
            index = (index-1 + images.size())% images.size();
        } 
    }  
    
    public void goTo(int i){
        if(i>=0 && i <images.size()) index =i;
    
    }
    
}
