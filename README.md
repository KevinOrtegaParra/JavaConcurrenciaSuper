# JavaConcurrenciaSuper
Este proyecto es un simulador de cobro en un supermercado desarrollado en Java, utilizando concurrencia y hilos para mejorar la eficiencia del proceso de cobro.

## Funcionalidades

- Simulación de múltiples cajeras y clientes realizando compras simultáneamente.
- Cálculo del tiempo necesario para cada compra y tiempo total de cobro para todas las compras.
- Mostrar productos comprados, costos totales y tiempo de procesamiento de cada compra.
- Implementación de una cajera con hilos (concurrencia) y otra sin hilos (procesamiento secuencial).

## Estructura del Proyecto

- `src/com/supermercado/sequential`: Clases relacionadas con el procesamiento secuencial.
- `src/com/supermercado/concurrency`: Clases relacionadas con la concurrencia y los hilos.
- `Main.java`: Clase principal para ejecutar el programa.
- Otras clases como `Cajera`, `Cliente`, `Producto`, etc.

## Instrucciones de Uso

1. Clonar el repositorio o descargar el código fuente.
2. Abrir el proyecto en tu IDE.
3. Compilar y ejecutar `Main.java`.
4. Seguir las instrucciones en la consola para ingresar nombres de clientes, productos y precios.