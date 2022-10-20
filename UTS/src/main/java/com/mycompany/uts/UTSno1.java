/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts;

/**
 * created by 21343065_PUTI ZAFANIA
 * @author cocaa
 */
public class UTSno1 {
    public static void main(String[]args){
        int whitespace,i;
        int totalnum = 9;
        int currentnum = 4;
        int totalnum2 = 9;
        int currentnum2 = 9;

        while(currentnum<9){
            whitespace = (totalnum - currentnum) / 4;
            for(i=0;i<whitespace;i++){
                System.out.print(" ");
            }
            for(i=whitespace+1;i<currentnum/2+whitespace+1;i++){
                System.out.print(i);
            }
            for(i=0;i<whitespace;i++){
                System.out.print(" ");
            }
            System.out.print(" ");
            for(i=0;i<whitespace;i++){
                System.out.print(" ");
            }
            for(i=whitespace+1+currentnum/2;i<currentnum/2+whitespace+1+currentnum/2;i++){
                System.out.print(i);
            }
            System.out.println(" ");
            currentnum = currentnum * 2;
        }

        while(currentnum2>0){
            whitespace = (totalnum2-currentnum2) / 2;
            for(i=0;i<whitespace;i++){
                System.out.print(" ");
            }
            for(i=1;i<currentnum2+1;i++){
                System.out.print(i);
            }
            for(i=0;i<whitespace;i++){
                System.out.print(" ");
            }
            System.out.println(" ");
            currentnum2 = currentnum2-2;
        }
    }
}


