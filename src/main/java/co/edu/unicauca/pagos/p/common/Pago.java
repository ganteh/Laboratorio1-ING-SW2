/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicauca.pagos.p.common;

/**
 *
 * @author Lenovo pc
 */
public interface Pago {
    public boolean validar();
    public void procesar();
    public String obtenerDetalle();
}
