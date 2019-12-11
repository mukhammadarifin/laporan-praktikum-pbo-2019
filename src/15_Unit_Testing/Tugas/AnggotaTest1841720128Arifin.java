/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.anggota;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MuFin
 */
public class AnggotaTest1841720128Arifin extends TestCase{
    
    Anggota1841720128Arifin instance;
    
    public AnggotaTest1841720128Arifin() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Anggota1841720128Arifin("fanani", "jomabang", "098092831");
        System.out.format("Start Testing : %s \n", this.getName());
    }
    
    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    @Test
    public void testSearch() {
        System.out.println("search test");
        String keyword = "iqbal";
        ArrayList<Anggota1841720128Arifin> result = instance.search(keyword);
        ArrayList<Anggota1841720128Arifin> expResult = instance.getByNamaAlamatAndTelepon("iqbal", "","");
        assertEquals(expResult.size(), result.size());
    }

    @Test
    public void testSave() {
       System.out.println("save test");
        this.instance.save();
        ArrayList<Anggota1841720128Arifin> expResult = instance.getByNamaAlamatAndTelepon(instance.getNamaArifin(), instance.getAlamatArifin(), instance.getTeleponArifin());
        assertTrue(expResult.size()>0);
    }
    
}
