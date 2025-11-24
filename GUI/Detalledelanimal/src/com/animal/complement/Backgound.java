/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.animal.complement;


import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;


/**
 *
 * @author Vicma
 */
public class Backgound extends javax.swing.JPanel {

  
    public Backgound() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

 @Override
    protected void paintComponent(Graphics grphcs){
        
         super.paintComponent(grphcs);
        // Llamamos primero al método original de Swing para asegurar
        // que el panel se repinte correctamente (borra artefactos).
    
        
        Graphics2D g2= (Graphics2D) grphcs;
        // Convertimos el objeto Graphics estándar a Graphics2D.
        // Graphics2D permite dibujar degradados, curvas y efectos avanzados.
        
        
        GradientPaint gra=new GradientPaint
        (0,0, new Color(255, 255, 191), // Color en la parte superior del panel
                
        0 , getHeight(),new Color(174, 198, 207) // Color en la parte inferior del panel
        
        );
        // Creamos un degradado vertical usando GradientPaint.
        // El degradado va desde la posición (0,0) hasta (0, getHeight()).
        // Color superior: amarillo muy claro  -> new Color(255, 255, 191)
        // Color inferior: azul grisáceo suave -> new Color(174, 198, 207)
        // Este gradient produce una transición suave entre ambos colores.
        
        
        
        g2.setPaint(gra);
    // Establecemos el degradado como la pintura activa de Graphics2D.
    // Todo lo que se dibuje a partir de ahora lo utilizará.
    
    
    
        g2.fillRect(0,0,getWidth(),getHeight());
        // Rellenamos un rectángulo del tamaño completo del panel.
        // Esto pinta el fondo completo con el degradado vertical.
    }
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

          
