/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uap.models;
import uap.bases.Shape;
import uap.interfaces.ThreeDimensional;
import uap.interfaces.PiRequired;
import uap.interfaces.MassCalculable;
import uap.interfaces.ShippingCostCalculator;
import uap.interfaces.MassConverter;
/**
 *
 * @author Aurel
 */
public class Sphere extends Shape implements ThreeDimensional, PiRequired, MassCalculable, ShippingCostCalculator, MassConverter{
    private double radius;//inisialisasi nilai radius
    
    public Sphere(){}//constructor 
    
    public Sphere(double radius){
        this.radius = radius;//menetapkan nilai radius
    }
    
    //method hitung volume bola
    @Override
    public double getVolume(){
        return 4.0/3 * (double)PI * Math.pow(radius, 3);
    }
    
     //method hitung luas permukaan bola
    @Override
    public double getSurfaceArea(){
        return 4 * (double)PI * Math.pow(radius, 2);
    }
    
    //method hitung massa bola
    @Override
    public double getMass(){
        return DENSITY * getSurfaceArea() * THICKNESS;
    }
    
    //cetak info terkait bola (volume, luas permukaan, massa)
    @Override
    public void printInfo(){
        System.out.printf("%-16s: %s%n%-16s: %s%n%-16s: %s%n",
                "Volume", getVolume(),
                "Luas Permukaan", getSurfaceArea(),
                "Massa", getMass());
    }
    
    //method mengonversi massa bola dari gram ke kilogram 
    @Override
    public double gramToKilogram(){
        return getMass() / DENOMINATOR ; 
    }
    
    //method menghitung tarif ongkir untuk bola
    @Override
    public double calculateCost(){
        return (int)gramToKilogram() * PRICE_PER_KG;
    }
}
