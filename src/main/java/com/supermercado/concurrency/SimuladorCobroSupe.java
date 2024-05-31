/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.supermercado.concurrency;

import com.iudigital.simuladorcobrosupe.Domain.ClienteProducto;
import com.iudigital.simuladorcobrosupe.Domain.Producto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class SimuladorCobroSupe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Producto> productosCliente1 = new ArrayList<>();
        List<Producto> productosCliente2 = new ArrayList<>();
        List<Producto> productosCliente3 = new ArrayList<>();

        // Solicitar al usuario el nombre y los productos para cada cliente
        System.out.print("\n=> Ingrese el nombre del cliente 1: ");
        String nombreCliente1 = scanner.nextLine();
        setProductos(scanner, productosCliente1, nombreCliente1);

        System.out.print("\n=> Ingrese el nombre del cliente 2: ");
        String nombreCliente2 = scanner.nextLine();
        setProductos(scanner, productosCliente2, nombreCliente2);

        System.out.print("\n=> Ingrese el nombre del cliente 3: ");
        String nombreCliente3 = scanner.nextLine();
        setProductos(scanner, productosCliente3, nombreCliente3);

        ClienteProducto cliente1 = new ClienteProducto(nombreCliente1, productosCliente1);
        ClienteProducto cliente2 = new ClienteProducto(nombreCliente2, productosCliente2);
        ClienteProducto cliente3 = new ClienteProducto(nombreCliente3, productosCliente3);

        long initialTime = System.currentTimeMillis();

        Cajera cajera1 = new Cajera("Maria", cliente3, initialTime);
        Cajera cajera2 = new Cajera("Lucy", cliente2, initialTime);
        Cajera cajera3 = new Cajera("Ana", cliente1, initialTime);

        cajera1.start();
        cajera2.start();
        cajera3.start();
    }

    private static void setProductos(Scanner scanner, List<Producto> productos, String nombre) {
        System.out.println("\n==========Ingrese los productos para el cliente " + nombre + "============");

        for (int i = 0; i < 3; i++) {
            System.out.print("\nIngrese el nombre del producto " + (i + 1) + ": ");
            String nombreProducto = scanner.nextLine();

            double precioProducto;
            while (true) {
                System.out.print("Ingrese el precio del producto " + (i + 1) + ": ");

                try {
                    precioProducto = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("\n*********************************************");
                    System.out.println("*Error: El precio debe ser un número válido.*");
                    System.out.println("*********************************************\n");
                }
            }

            System.out.print("Ingrese la cantidad del producto " + (i + 1) + ": ");
            int cantidadProducto = Integer.parseInt(scanner.nextLine());

            Producto producto = new Producto(nombreProducto, precioProducto, cantidadProducto);
            productos.add(producto);
        }

    }
}
