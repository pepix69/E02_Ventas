package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/clientes/{id}/facturas")
public class FacturasController {

    // Respuesta para todas las facturas - GET
    @GetMapping
    public String listarFacturas() {
        return "Listado de todas las facturas - GET";
    }

    // Respuesta para una factura por id - GET
    @GetMapping("/{id_factura}")
    public String listarFactura(@PathVariable int id_factura) {
        return "Obtener una factura por id - GET id: " + id_factura;
    }

    // Agrega una factura - POST
    @PostMapping
    public String agregarFactura(@RequestBody String factura) {
        return "Factura agregada - POST: " + factura;
    }

    // Actualizar una factura - PUT
    @PutMapping("/{id_factura}")
    public String actualizarFactura(@PathVariable int id, @RequestBody String factura) {
        return "Factura actualizada: " + factura + " con id: " + id;
    }

    // Eliminar una factura - DELETE
    @DeleteMapping("/{id_factura}")
    public String eliminarFactura(@PathVariable int id) {
        return "Eliminar una factura - DELETE: " + id;
    }
}
