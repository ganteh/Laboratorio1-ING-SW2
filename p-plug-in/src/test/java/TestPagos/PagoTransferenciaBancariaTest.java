/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestPagos;

import co.edu.unicauca.pagos.p.plug.in.PagoTransferenciaBancaria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lenovo pc
 */
public class PagoTransferenciaBancariaTest {
    @Test
    public void testValidar() {
        PagoTransferenciaBancaria pago = new PagoTransferenciaBancaria("1234567890", 200.0);
        assertTrue(pago.validar());
    }
    
    @Test
    public void testObtenerDetalle() {
        PagoTransferenciaBancaria pago = new PagoTransferenciaBancaria("1234567890", 200.0);
        assertEquals("Pago por transferencia bancaria - Monto: 200.0", pago.obtenerDetalle());
    }
    
     @Test
    public void testProcesar() {
        PagoTransferenciaBancaria pago = new PagoTransferenciaBancaria("1234567890", 200.0);
        pago.procesar();
    }
}
