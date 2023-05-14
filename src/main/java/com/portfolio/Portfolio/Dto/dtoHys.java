/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.Portfolio.Dto;

import javax.validation.constraints.NotBlank;


public class dtoHys {
    @NotBlank
    private String nombreE;
    @NotBlank
    private int porcentaje;

    public dtoHys() {
    }

    public dtoHys(String nombre, int porcentaje) {
        this.nombreE = nombreE;
        this.porcentaje = porcentaje;
    }

    public String getNombre() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
}
