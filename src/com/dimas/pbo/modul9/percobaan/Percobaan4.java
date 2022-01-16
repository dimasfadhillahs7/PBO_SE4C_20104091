/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dimas.pbo.modul9.percobaan;
public class Percobaan4 {
    public static void main(String[] args) {
        int[] e = new int[2];
        
        try{
            System.out.println("Access element in three : "+e[3]);
        }
        
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Exception throm : "+ex);
        }
        
        finally{
            e[0] = 6;
            System.out.println("First element value: "+e[0]);
            System.out.println("Finally statement is executed!");
        }
    
    }
            
}
