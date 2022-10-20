/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts;

/**
 * created by 21343065_PUTI ZAFANIA
 * @author cocaa
 */

import javax.swing.JOptionPane;

public class UTSno3 {
    public static void main(String[] args) {
        int angka;
        
        angka = Integer.parseInt (JOptionPane.showInputDialog("Masukkan Nilai :"));
        
         if(angka>=0)
     {
         JOptionPane.showMessageDialog(null," Bernilai positif\n"+angka );
     }
     else
        {
           JOptionPane.showMessageDialog(null," Bernilai negatif\n"+angka );
            
        }
    }
}
