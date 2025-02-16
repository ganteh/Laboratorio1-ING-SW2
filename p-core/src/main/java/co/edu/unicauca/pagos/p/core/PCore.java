/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.unicauca.pagos.p.core;

import co.edu.unicauca.pagos.p.common.Pago;
import co.edu.unicauca.pagos.p.plug.in.*;


/**
 *
 * @author Lenovo pc
 */
public class PCore {
    public static void main(String[] args) {
        PasarelaPago pasarela = new PasarelaPago();
        SimuladorBlockchain blockchain = new SimuladorBlockchain();
        
        Pago pago1 = new PagoTarjetaCredito("1234567812345678", 250.00, pasarela);
        Pago pago2 = new PagoTransferenciaBancaria("1234567890", 500.00);
        Pago pago3 = new PagoCriptomoneda("0xabcdef1234567890", 0.05, blockchain);
        
        pago1.procesar();
        pago2.procesar();
        pago3.procesar();
    }
}
