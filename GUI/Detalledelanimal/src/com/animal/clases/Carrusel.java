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
    
    // Lista donde se guardan todas las imágenes del carrusel
    private List<ImageIcon> images;

    // Índice de la imagen actual que se está mostrando
    private int index = 0;
    
    // -------------------------------------------------------------
    // CONSTRUCTOR 1: Crea un carrusel vacío sin imágenes
    // -------------------------------------------------------------
    public Carrusel() {
        // Inicializa la lista vacía para luego agregar imágenes
        images = new ArrayList<>();  
    }
    
    // -------------------------------------------------------------
    // CONSTRUCTOR 2: Crea un carrusel con una lista de imágenes ya cargada
    // -------------------------------------------------------------
    public Carrusel(List<ImageIcon> images) {
        // Crea una copia de la lista recibida para evitar modificar la original
        this.images = new ArrayList<>(images);
    }
    
    // -------------------------------------------------------------
    // GETTER: Devuelve todas las imágenes del carrusel
    // -------------------------------------------------------------
    public List<ImageIcon> getImages() {
        return images;
    }
    
    // -------------------------------------------------------------
    // GETTER: Devuelve la imagen que está seleccionada actualmente
    // -------------------------------------------------------------
    public ImageIcon getCurrentImage() {
        // Si no hay imágenes, devuelve null para evitar errores
        if (images.isEmpty()) return null;
        
        // Retorna la imagen correspondiente al índice actual
        return images.get(index);
    }
    
    // -------------------------------------------------------------
    // GETTER: Devuelve el índice actual (posición dentro del carrusel)
    // -------------------------------------------------------------
    public int getIndex() {
        return index;
    }
    
    // -------------------------------------------------------------
    // SETTER: Reemplaza las imágenes del carrusel con una nueva lista
    // -------------------------------------------------------------
    public void setImages(List<ImageIcon> images) {
        // Crea una copia de la nueva lista
        this.images = new ArrayList<>(images);

        // Reinicia el índice a la primera imagen
        this.index = 0;
    }
    
    // -------------------------------------------------------------
    // Agrega una imagen individual al carrusel
    // -------------------------------------------------------------
    public void addImage(ImageIcon img) {
        images.add(img);
    }
    
    // -------------------------------------------------------------
    // Elimina una imagen del carrusel dada su posición
    // -------------------------------------------------------------
    public void removeImage(int i) {
        
        // Verifica que el índice esté dentro de los límites
        if (i >= 0 && i < images.size()) {
            
            images.remove(i);  // Elimina la imagen
            
            // Si el índice actual queda fuera de rango, ajustarlo
            if (index >= images.size())
                index = images.size() - 1;
        }    
    }
    
    // -------------------------------------------------------------
    // Avanza a la siguiente imagen del carrusel
    // -------------------------------------------------------------
    public void next() {
        if (!images.isEmpty()) {
            
            // Avanza y vuelve al inicio cuando llega al final (efecto loop)
            index = (index + 1) % images.size();
        } 
    }  
    
    // -------------------------------------------------------------
    // Retrocede a la imagen anterior
    // -------------------------------------------------------------
    public void previous() {
        if (!images.isEmpty()) {
            
            // Retrocede y vuelve al final cuando está al inicio
            index = (index - 1 + images.size()) % images.size();
        } 
    }  
    
    // -------------------------------------------------------------
    // Salta directamente a una imagen específica
    // -------------------------------------------------------------
    public void goTo(int i) {
        
        // Verifica que la posición exista dentro de la lista
        if (i >= 0 && i < images.size())
            index = i;
    }
}
