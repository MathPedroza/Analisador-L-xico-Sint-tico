/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import AnalisadorLexico.FrmAnaliseLexica;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Math Pedroza
 */
public class InterfaceTest {
    
    public InterfaceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of executar method, of class Interface.
     */
    @Test
    public void testExecutar() throws Exception {
        System.out.println("executar");
        FrmAnaliseLexica instance = new FrmAnaliseLexica();
        instance.executar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Interface.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FrmAnaliseLexica.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Gravar method, of class Interface.
     */
    @Test
    public void testGravar() throws Exception {
        System.out.println("Gravar");
        String Flex = "";
        String nomeArq = "";
        FrmAnaliseLexica instance = new FrmAnaliseLexica();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
