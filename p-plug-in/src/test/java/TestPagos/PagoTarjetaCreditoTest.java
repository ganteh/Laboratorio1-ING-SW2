/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestPagos;

import co.edu.unicauca.pagos.p.plug.in.PagoTarjetaCredito;
import co.edu.unicauca.pagos.p.plug.in.PasarelaPago;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Lenovo pc
 */
public class PagoTarjetaCreditoTest {
    @Test
    public void testValidar() {
        PasarelaPago pasarela = new PasarelaPago();
        PagoTarjetaCredito pago = new PagoTarjetaCredito("1234567812345678", 100.0, pasarela);
        assertTrue(pago.validar());
    }
    
    @Test
    public void testObtenerDetalle() {
        PasarelaPago pasarela = new PasarelaPago();
        PagoTarjetaCredito pago = new PagoTarjetaCredito("1234567812345678", 100.0, pasarela);
        assertEquals("Pago con tarjeta de crédito - Monto: 100.0", pago.obtenerDetalle());
    }
    
     @Test
    public void testProcesar() {
        PasarelaPago pasarela = new PasarelaPago();
        PagoTarjetaCredito pago = new PagoTarjetaCredito("1234567812345678", 100.0, pasarela);
        pago.procesar();
    }
}
