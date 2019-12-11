/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

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
public class KategoriTest1841720128Arifin extends TestCase{
    
    Kategori1841720128Arifin instance;
    
    public KategoriTest1841720128Arifin() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUpArifin() {
        instance = new Kategori1841720128Arifin("Comics", "Comic is combination words and pictures");
        System.out.format("Start Testing : %s \n", this.getName());
    }
    
    @After
    public void tearDownArifin() {
        System.out.format("Finish Test %s\n", this.getName());
    }
//
//    @Test
//    public void testGetIdkategori() {
//        System.out.println("getIdkategori");
//        Kategori instance = new Kategori();
//        int expResult = 0;
//        int result = instance.getIdkategori();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSetIdkategori() {
//        System.out.println("setIdkategori");
//        int idkategori = 0;
//        Kategori instance = new Kategori();
//        instance.setIdkategori(idkategori);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetNama() {
//        System.out.println("getNama");
//        Kategori instance = new Kategori();
//        String expResult = "";
//        String result = instance.getNama();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSetNama() {
//        System.out.println("setNama");
//        String nama = "";
//        Kategori instance = new Kategori();
//        instance.setNama(nama);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetKeterangan() {
//        System.out.println("getKeterangan");
//        Kategori instance = new Kategori();
//        String expResult = "";
//        String result = instance.getKeterangan();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSetKeterangan() {
//        System.out.println("setKeterangan");
//        String keterangan = "";
//        Kategori instance = new Kategori();
//        instance.setKeterangan(keterangan);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetById() {
//        System.out.println("getById");
//        int id = 0;
//        Kategori instance = new Kategori();
//        Kategori expResult = null;
//        Kategori result = instance.getById(id);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetAll() {
//        System.out.println("getAll");
//        Kategori instance = new Kategori();
//        ArrayList<Kategori> expResult = null;
//        ArrayList<Kategori> result = instance.getAll();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }

    @Test
    public void testSearchArifin() {
        System.out.println("search test");
        String keyword = "Comics";
        ArrayList<Kategori1841720128Arifin> result = instance.searchArifin(keyword);
        ArrayList<Kategori1841720128Arifin> expResult = instance.getByNamaAndKeteranganArifin(keyword, "");
        assertEquals(expResult.size(), result.size());
//        Kategori instance = new Kategori();
//        ArrayList<Kategori> expResult = null;
//        ArrayList<Kategori> result = instance.search(keyword);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testSaveArifin() {
        System.out.println("save test");
        this.instance.saveArifin();
        ArrayList<Kategori1841720128Arifin> expResult = instance.getByNamaAndKeteranganArifin(instance.getNamaArifin(), instance.getKeteranganArifin());
        assertTrue(expResult.size()>0);
//        Kategori instance = new Kategori();
//        instance.save();
//        fail("The test case is a prototype.");
    }

//    @Test
//    public void testDelete() {
//        System.out.println("delete");
//        Kategori instance = new Kategori();
//        instance.delete();
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Kategori instance = new Kategori();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//    
}
