package misha.productoservice.controller;

import misha.productoservice.entity.Producto;
import misha.productoservice.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping
    public ResponseEntity<List<Producto>> getAll(){
        List<Producto> productos = productoService.getAll();
        if(productos.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(productos);
    }
}
