/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestPagos;

import co.edu.unicauca.pagos.p.plug.in.PagoCriptomoneda;
import co.edu.unicauca.pagos.p.plug.in.SimuladorBlockchain;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lenovo pc
 */
import org.junit.jupiter.api.Test;

public class PagoCriptomonedaTest {
    @Test
    public void testValidar() {
        SimuladorBlockchain blockchain = new SimuladorBlockchain();
        PagoCriptomoneda pago = new PagoCriptomoneda("0xabcdef1234567890", 0.05, blockchain);
        assertTrue(pago.validar());
    }
    
    @Test
    public void testObtenerDetalle() {
        SimuladorBlockchain blockchain = new SimuladorBlockchain();
        PagoCriptomoneda pago = new PagoCriptomoneda("0xabcdef1234567890", 0.05, blockchain);
        assertEquals("Pago con criptomoneda - Monto: 0.05", pago.obtenerDetalle());
    }
    
    @Test
    public void testProcesar() {
        SimuladorBlockchain blockchain = new SimuladorBlockchain();
        PagoCriptomoneda pago = new PagoCriptomoneda("0xabcdef1234567890", 0.05, blockchain);
        pago.procesar();
    }
}

