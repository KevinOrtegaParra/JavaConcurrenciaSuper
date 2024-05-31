/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iudigital.simuladorcobrosupe.Domain;

import java.util.List;

/**
 * @author kevin
 * Clase que representa a un cliente y sus productos comprados.
 */
public class ClienteProducto {
    
    private final String nombre;// Nombre del cliente
    private final List<Producto> productos;// Lista de productos comprados por el cliente

    //Constructor de la clase ClienteProducto.
    public ClienteProducto(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    // Getters 
    public String getNombre() {
        return nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }
    
}
