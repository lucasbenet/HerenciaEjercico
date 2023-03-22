/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.herencia;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */

public class Herencia {
public static void main(String[] args){
 ArrayList<Empleado> misEmpleados = new ArrayList<>();
 
 Repartidor Repartidor1 = new Repartidor("Norte","Pepe", "Pemau", 60, 1000);
 misEmpleados.add(Repartidor1);
 Repartidor Repartidor2 = new Repartidor("Oeste","Luis", "Blanco", 55, 1000);
 misEmpleados.add(Repartidor2);
 Repartidor Repartidor3 = new Repartidor("Sur","Juan", "Cavestany", 30, 1000);
 misEmpleados.add(Repartidor3);
        

 Comercial Comercial1 = new Comercial("Jose", "Estiu", 40, 1000, 40);
 misEmpleados.add(Comercial1);

for (int i=0; i<misEmpleados.size();i++){ 
//    misEmpleados.get(i).plus(300);
    System.out.println(misEmpleados.get(i));
    }

}
}



