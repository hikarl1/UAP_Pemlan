/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uap.bases;

/**
 *
 * @author Aurel
 */
public abstract class Shape {
    private String name;//simpan nama bentuk
    public Shape(){}//constructor default
     public void setName(String inputName){
        this.name = inputName;//untuk menetapkan/mengisi nama bentuk
    }
    
    public String getName(){
        return name;//mengambil atau mengembalikan nama bentuk
    }
    
    public abstract void printInfo();//method cetak informasi
}