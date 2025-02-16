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
import co.edu.unicauca.pagos.p.common.Pago;

public class PagoTarjetaCredito implements Pago {
    private String numeroTarjeta;
    private double monto;
    private PasarelaPago pasarela;

    public PagoTarjetaCredito(String numeroTarjeta, double monto, PasarelaPago pasarela) {
        this.numeroTarjeta = numeroTarjeta;
        this.monto = monto;
        this.pasarela = pasarela;
    }
    
    @Override
    public boolean validar() {
        return numeroTarjeta != null && numeroTarjeta.length() == 16;
    }
    
    @Override
    public void procesar() {
        if (validar()) {
            pasarela.procesarPago(numeroTarjeta, monto);
        } else {
            System.out.println("Número de tarjeta inválido.");
        }
    }
    
    @Override
    public String obtenerDetalle() {
        return "Pago con tarjeta de crédito - Monto: " + monto;
    }
}

