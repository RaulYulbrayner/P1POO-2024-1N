package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class CirculoTest {

    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Preuba para verificar que el area del circulo sea positiva
     */
    @Test
    public void areaRadioCirculoPositivo() {
        LOG.info("Iniciado test shouldAnswerWithTrue");

        Circulo circulo = new Circulo(10);

        assertEquals(314.1592653589793, circulo.calcularArea(), App.PRECISION);


        LOG.info("Finalizando test areaRadioCirculoPositivo");
    }
    
}
