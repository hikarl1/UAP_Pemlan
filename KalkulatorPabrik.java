/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uap.mains;
import uap.bases.*;
import uap.interfaces.*;
import uap.models.*;
import java.util.Scanner;
/**
 *
 * @author Aurel
 */
public class KalkulatorPabrik {
    public static void main(String[] args){
        //scanner
        Scanner main = new Scanner(System.in);
        //format input
        
        String garis = "======================================";
        String majorRadius = String.format("%-16s%-2s", "Isikan Radius", ":");
        String minorRadius = String.format("%-16s%-2s", "Isikan radius", ":");
        String radius = String.format("%-16s%-2s", "Isikan radius", ":");
        
        String kgTorus = String.format("%-16s%-2s", "Massa dalam kg", ":");
        String costTorus = String.format("%-16s%-2s", "Biaya kirim", ":");
        
        String kgBola = String.format("%-16s%-2s", "Massa dalam kg", ":");
        String costBola = String.format("%-16s%-2s", "Biaya kirim", ":");
        
        //Menampilkan header program
        System.out.println(garis);
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("AURELIA CALLYSTA MAMAHIT");
        System.out.println("245150700111024");
        System.out.println(garis);
        
        //TORUS 
        System.out.println("Donat dengan lubang");
        System.out.println(garis);
        System.out.print(majorRadius);//menampilkan format input major radius torus
        double major = main.nextDouble();//input minor radius torus
        System.out.print(minorRadius);//menampilkan format input minor radius torus
        double minor = main.nextDouble();//input minor radius torus
        Torus torus = new Torus(major, minor);//membuat objek torus
        System.out.println(garis);
        torus.printInfo();//menampilkan info torus
        System.out.print(kgTorus);//menampilkan format output utk massa torus dlm kg
        System.out.println(torus.gramToKilogram()); //menampilkan nilai massa torus dlm kg
        System.out.print(costTorus+ "Rp");//menampilkan format output utk tarif ongkir torus 
        System.out.println(torus.calculateCost());//menampilkan nilai ongkir 
        System.out.println(garis);
        
        //SPHERE 
        System.out.println("Donat tanpa lubang");
        System.out.println(garis);
        System.out.print(radius);//menampilkan format input  radius bola
        double radbola = main.nextDouble();//input radius bola
        Sphere sphere = new Sphere(radbola);//membuat objek bola
        System.out.println(garis);
        sphere.printInfo();//menampilkan info sphere
        System.out.print(kgBola);//menampilkan format output utk massa sphere dlm kg
        System.out.println(sphere.gramToKilogram()); //menampilkan nilai massa sphere dlm kg
        System.out.print(costBola + "Rp ");//menampilkan format output utk tarif ongkir sphere 
        System.out.println(sphere.calculateCost());//menampilkan nilai ongkir 
        System.out.println(garis);
    }
}
