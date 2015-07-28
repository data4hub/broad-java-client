/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest4hub.api;

import com.rest4hub.model.Banco;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author francisco
 */
public class BankApiIT {

    private BankApi instance;

    public BankApiIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new BankApi();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of findByName method, of class BankApi.
     */
    @Test
    public void testFindByName() throws Exception {
        System.out.println("\n==============================================");
        System.out.println("findByName");
        String nome = "Santander";
        List<Banco> result = instance.findByName(nome);
        System.out.println(result);
    }

    /**
     * Test of find method, of class BankApi.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("\n==============================================");
        System.out.println("find");
        String ispbOuCodigo = "033";
        Banco result = instance.find(ispbOuCodigo);
        System.out.println(result);
    }

}
