/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.examenm5pauvizcainoluna;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PauVizcaino
 */
public class SumaTest {

    public SumaTest() {
    }

    @Test
    public void testSumar() {
        Suma Sumar = new Suma(0, 0);
        int numero = Sumar.suma(5, 10);
        assertEquals(15, numero);
    }

    @Test
    public void testGetNum1() {
        Suma getNum1 = new Suma(0,0);
        int numero = getNum1.getNum1(5);
        assertEquals(5, numero);
    }

    @Test
    public void testSumaValorAbsolut() {

        Suma sumaAbsolut = new Suma(0,0);
        int numero = sumaAbsolut.sumaValorAbsolut(-7, -10);
        assertEquals(17,numero);
    }
}
