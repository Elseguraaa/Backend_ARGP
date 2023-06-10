/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Lucas
 */
public class DtoExperiencia {
    @NotBlank
    private String nombreEx;
    @NotBlank
    private String descripcionEx;
    
    //Constructor

     public DtoExperiencia() {
    }
 public DtoExperiencia(String nombreEx, String descripcionEx) {
        this.nombreEx = nombreEx;
        this.descripcionEx = descripcionEx;
    }
     
    //Getters & Setters

    public String getNombreEx() {
        return nombreEx;
    }

    public void setNombreEx(String nombreEx) {
        this.nombreEx = nombreEx;
    }

    public String getDescripcionEx() {
        return descripcionEx;
    }

    public void setDescripcionEx(String descripcionEx) {
        this.descripcionEx = descripcionEx;
    }

   

   
    
    
}
