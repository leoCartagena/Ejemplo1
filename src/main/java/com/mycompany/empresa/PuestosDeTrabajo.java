package com.mycompany.empresa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leodc
 */
public class PuestosDeTrabajo {
    public void gerente (float salario, float descuentos, String funciones ){
        float Sueldog= salario-descuentos;
        System.out.println(Sueldog+" "+funciones);
    }
    public void AnalistaLider(float salario, float descuentos, String funciones){
        float SueldoAL= salario-descuentos;
        System.out.println(SueldoAL+" "+funciones);
    }    
    public void AnalistaB(float salario, float descuentos, String funciones){
        float SueldoAB= salario-descuentos;
        System.out.println(SueldoAB+" "+funciones);
    }
}
