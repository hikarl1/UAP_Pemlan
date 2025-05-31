/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uap.interfaces;

/**
 *
 * @author Aurel
 */
public interface MassConverter {
    final int DENOMINATOR = 1000;//menetapkan nilai dibagi untuk mengubah gram ke kilogram
    double gramToKilogram();//mengembalikan nilai berat setelah diubah dari gram ke kilogram
}