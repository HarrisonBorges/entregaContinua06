/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the tor
 */
package mediana;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Harrison
 */
public class MedianaTest {

    Mediana estatistica;

    public MedianaTest() {
        estatistica = new Mediana();
    }

    //(i) Encontre a mediana dos números.
    @Test
    public void testeVetorOrdenadoImpar() {
        double[] v = {1, 2, 3, 4, 5};
        Mediana m = new Mediana();
        double res = m.getMediana(v);
        assertEquals(3, res, 0.01);
    }

    @Test(expected = NullPointerException.class)
    public void medianaTestNulo() {
        assertEquals(0.0, estatistica.estatisticaNuloVazio(null), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void medianaVaziaTest() {
        double[] vetor = {};
        assertEquals(0.0, estatistica.estatisticaNuloVazio(vetor), 0.01);
    }

    @Test
    public void medianaParQuantidadeTest() {
        double[] vetor = {3, 5, 6, 8, 9, 12, 15};
        assertEquals(8.0, estatistica.estatisticaNuloVazio(vetor), 0.01);
    }

    @Test
    public void medianaImparQuantidadeTest() {
        double[] vetor = {3, 5, 6, 8, 9, 12, 15, 16};
        assertEquals(8.5, estatistica.estatisticaNuloVazio(vetor), 0.01);
    }

}
