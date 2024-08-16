/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empresa;

/**
 *
 * @author leodc
 */
public class Empresa {

    public static void main(String[] args) {
        PuestosDeTrabajo tp = new PuestosDeTrabajo();
        tp.gerente(40000, 1500, "Administrar");
        tp.AnalistaLider(20000, 700, "Gestionar");
        tp.AnalistaB(10000, 550, "Operador de turno");
    }
}
