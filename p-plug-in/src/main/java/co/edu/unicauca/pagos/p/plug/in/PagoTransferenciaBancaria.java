/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.pagos.p.plug.in;

import co.edu.unicauca.pagos.p.common.Pago;

/**
 *
 * @author Lenovo pc
 */
public class PagoTransferenciaBancaria implements Pago {
    private String numeroCuenta;
    private double monto;
    
    public PagoTransferenciaBancaria(String numeroCuenta, double monto) {
        this.numeroCuenta = numeroCuenta;
        this.monto = monto;
    }
    
    @Override
    public boolean validar() {
        return numeroCuenta != null && numeroCuenta.length() == 10;
    }
    
    @Override
    public void procesar() {
        if (validar()) {
            System.out.println("Procesando transferencia bancaria de: " + monto);
        } else {
            System.out.println("Número de cuenta inválido.");
        }
    }
    
    @Override
    public String obtenerDetalle() {
        return "Pago por transferencia bancaria - Monto: " + monto;
    }
}

