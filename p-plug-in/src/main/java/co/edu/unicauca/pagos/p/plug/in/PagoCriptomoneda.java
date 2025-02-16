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
public class PagoCriptomoneda implements Pago {
    private String direccionBilletera;
    private double monto;
    private SimuladorBlockchain blockchain;
    
    public PagoCriptomoneda(String direccionBilletera, double monto, SimuladorBlockchain blockchain) {
        this.direccionBilletera = direccionBilletera;
        this.monto = monto;
        this.blockchain = blockchain;
    }
    
    @Override
    public boolean validar() {
        return direccionBilletera != null && direccionBilletera.startsWith("0x");
    }
    
    @Override
    public void procesar() {
        if (validar()) {
            blockchain.confirmarPago(direccionBilletera, monto);
        } else {
            System.out.println("Dirección de billetera inválida.");
        }
    }
    
    @Override
    public String obtenerDetalle() {
        return "Pago con criptomoneda - Monto: " + monto;
    }
}
