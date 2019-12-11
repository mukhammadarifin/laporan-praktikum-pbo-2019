/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import unittes.MessageProcessor1841720128Arifin;

/**
 *
 * @author MuFin
 */
public class MessageProcessorTest1841720128Arifin {

    MessageProcessor1841720128Arifin mp;

    public MessageProcessorTest1841720128Arifin() {
        mp = new MessageProcessor1841720128Arifin();
        mp.setSenderArifin("Ronaldo");
        mp.setRecipientArifin("Rafael");
        mp.setMessageArifin("Whats up bro?");
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testShowMessageArifin() {
        String expectedResult = "Hai Rafael, you have message from Ronaldo.\nThe message as follows : Whats up bro?";
        Assert.assertEquals(expectedResult, mp.messageFormatArifin());
    }
}
