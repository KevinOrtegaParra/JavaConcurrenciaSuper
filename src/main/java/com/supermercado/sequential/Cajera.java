/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.supermercado.sequential;

import com.iudigital.simuladorcobrosupe.Domain.ClienteProducto;
import com.iudigital.simuladorcobrosupe.Domain.Producto;

/**
 *
 * @author kevin
 */
public class Cajera {

    private String nombre; // Nombre de la cajera
    private ClienteProducto cliente;// Cliente cuya compra se procesará
    private long timeStang; // Tiempo de inicio de procesamiento

    public Cajera(String nombre, ClienteProducto cliente, long timeStang) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.timeStang = timeStang;
    }

    /**
     * Método que se ejecuta cuando se inicia el hilo de la cajera.
     */
    public void procesamiento() {
        // Mensaje de inicio de procesamiento del cliente
        System.out.println("\nLa cajera " + this.nombre + " Comiensa a procesar la compra del cliente "
                + cliente.getNombre() + " en el tiempo " + (System.currentTimeMillis() - timeStang) / 1000 + " seg ");
        System.out.println("____________________________________________________________________________________");
        int conCliente = 1;
        double precioTotal = 0;

        // Procesamiento de cada producto del cliente
        for (Producto producto : cliente.getProductos()) {
            this.esperar(); // Método para simular tiempo de procesamiento
            // Mensaje de procesamiento del producto
            precioTotal += producto.getCantidad() * producto.getPrecio();
            System.out.println("\nProcesando el producto " + conCliente + " nombre del producto " + producto.getNombre()
                    + " precio del producto " + producto.getPrecio() + " Cantidad de producto " + producto.getCantidad()
                    + " Costo Total: " + producto.getCantidad() * producto.getPrecio() + "Time: " + (System.currentTimeMillis() - timeStang) / 1000 + " seg ");
            conCliente++;
            System.out.println("____________________________________________________________________________________");
        }

        // Mensaje de finalización de procesamiento del cliente
        System.out.println("\nLa cajera " + this.nombre + " ha terminado de procesar al cliente " + cliente.getNombre()
                + "\nTotal: " + precioTotal + "\nTiempo:" + (System.currentTimeMillis() - timeStang) / 1000 + " seg ");
        System.out.println("____________________________________________________________________________________");
    }

    /**
     * Método privado para simular el tiempo de procesamiento de cada producto.
     */
    private void esperar() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}
