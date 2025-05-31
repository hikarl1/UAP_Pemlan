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
public class Torus extends Shape implements ThreeDimensional, PiRequired, MassCalculable, ShippingCostCalculator, MassConverter{
    private double majorRadius;//inisialisasi nilai major radius
    private double minorRadius;//inisialisasi nilai minor radius
    
    public Torus(){}//constructor 
    
    public Torus(double majorRadius, double minorRadius){
        this.majorRadius = majorRadius;//menetapkan nilai major radius
        this.minorRadius = minorRadius;// menetapkan nilai minor radius
    }
    
    //method menghitung volume Torus
    @Override
    public double getVolume(){
        return 2 * Math.pow(PI, 2)* majorRadius * Math.pow(minorRadius, 2);
    }
    
    //method menghitung luas permukaan torus
    @Override
    public double getSurfaceArea(){
        return 4 * Math.pow(PI, 2) * majorRadius *  Math.pow(minorRadius, 2);
    }
    
    //method menghitung massa torus
    @Override
    public double getMass(){
        return DENSITY * getSurfaceArea() * THICKNESS;
    }
    
    //method menampilkan informasi torus
    @Override
    public void printInfo(){
         System.out.printf("%-16s: %s%n%-16s: %s%n%-16s: %s%n",
                "Volume", getVolume(),
                "Luas Permukaan", getSurfaceArea(),
                "Massa", getMass());
    }
    
    //method mengonversi massa torus dari gram ke kilogram 
    @Override
    public double gramToKilogram(){
        return getMass() / DENOMINATOR; 
    }
    
    //method menghitung tarif ongkir untuk torus
    @Override
    public double calculateCost(){
        return (int)gramToKilogram() * PRICE_PER_KG;
    }
}
