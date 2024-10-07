package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/proveedores")
public class ProveedoresController {

    // Respuesta para todos los proveedores - GET
    @GetMapping
    public String listarProveedores() {
        return "Listado de todos los proveedores - GET";
    }

    // Respuesta para un proveedor por id - GET
    @GetMapping("/{id}")
    public String listarProveedor(@PathVariable int id) {
        return "Obtener un proveedor por id - GET id: " + id;
    }

    // Agrega un proveedor - POST
    @PostMapping
    public String agregarProveedor(@RequestBody String proveedor) {
        return "Proveedor agregado - POST: " + proveedor;
    }

    // Actualizar un proveedor - PUT
    @PutMapping("/{id}")
    public String actualizarProveedor(@PathVariable int id, @RequestBody String proveedor) {
        return "Proveedor actualizado: " + proveedor + " con id: " + id;
    }

    // Eliminar un proveedor - DELETE
    @DeleteMapping("/{id}")
    public String eliminarProveedor(@PathVariable int id) {
        return "Eliminar un proveedor - DELETE: " + id;
    }
}
