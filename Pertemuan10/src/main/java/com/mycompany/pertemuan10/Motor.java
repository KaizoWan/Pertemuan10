/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pertemuan10;

/**
 *
 * @author A-15
 */
public class Motor implements KendaraanBermotor{

    @Override
    public void gasPol() {
        System.out.println("Gas sampai 100 km/jam");
    }

    @Override
    public void remSir() {
        System.out.println("sampai kendaraan berhenti");
    }
    
}