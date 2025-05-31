/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uap.interfaces;

/**
 *
 * @author Aurel
 */
public interface ShippingCostCalculator {
     final int PRICE_PER_KG = 2000;//menetapkan harga ongkir per kilogram
     double calculateCost();//mengembalikan nilai tarif setelah dihitung
}
