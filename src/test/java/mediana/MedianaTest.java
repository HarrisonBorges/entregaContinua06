/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the tor.
 */
package mediana;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Harrison
 */
public class MedianaTest {
    
    @Test
    public void testeVetorOrdenadoImpar() {
        double[] v = {1,2,3,4,5};
        Mediana m = new Mediana();
        double res = m.getMediana(v);
        assertEquals(3, res, 0.01);
  
    }
}