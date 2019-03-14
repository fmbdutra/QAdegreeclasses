/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcelo.soares
 */
public class CalculadoraTest {
    
    
    @Test
    public void testSomar(){
        Calculadora cal =new Calculadora();
        Assert.assertEquals(5, cal.soma(2, 3));
    }
            
}
