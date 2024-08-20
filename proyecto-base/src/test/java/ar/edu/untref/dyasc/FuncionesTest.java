package ar.edu.untref.dyasc;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class FuncionesTest {
	// 0 1 1 2 3 5 8 13 21
    @Test
    public void testFibonacciEnPosicion2() {
        assertThat(Funciones.fibonacciEnPosicionN(2)).isEqualTo(1);
    }
    @Test
    public void testFibonacciEnPosicion4() {
    	assertThat(Funciones.fibonacciEnPosicionN(4)).isEqualTo(3);
    }
    @Test
    public void testFibonacciEnPosicion8() {
    	assertThat(Funciones.fibonacciEnPosicionN(8)).isEqualTo(21);
    }
    
    @Test
    public void testSerieDeFibonacciDeLargo3() {
    	assertThat(Funciones.serieFibonacci(3)).isEqualTo("0 1 1");
    }
    @Test
    public void testSerieDeFibonacciDeLargo6() {
    	assertThat(Funciones.serieFibonacci(6)).isEqualTo("0 1 1 2 3 5");
    }
    @Test
    public void testSerieDeFibonacciDeLargo9() {
    	assertThat(Funciones.serieFibonacci(9)).isEqualTo("0 1 1 2 3 5 8 13 21");
    }
}
