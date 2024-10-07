package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductosController {

    // Respuesta para todos los productos - GET
    @GetMapping
    public String listarProductos() {
        return "Listado de todos los productos - GET";
    }

    // Respuesta para un producto por id - GET
    @GetMapping("/{id}")
    public String listarProducto(@PathVariable int id) {
        return "Obtener un producto por id - GET id: " + id;
    }

    // Agrega un producto - POST
    @PostMapping
    public String agregarProducto(@RequestBody String producto) {
        return "Producto agregado - POST: " + producto;
    }

    // Actualizar un producto - PUT
    @PutMapping("/{id}")
    public String actualizarProducto(@PathVariable int id, @RequestBody String producto) {
        return "Producto actualizado: " + producto + " con id: " + id;
    }

    // Eliminar un producto - DELETE
    @DeleteMapping("/{id}")
    public String eliminarProducto(@PathVariable int id) {
        return "Eliminar un producto - DELETE: " + id;
    }
}
