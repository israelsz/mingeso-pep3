package misha.calcularnuevospreciosservice.controller;

import misha.calcularnuevospreciosservice.model.Producto;
import misha.calcularnuevospreciosservice.service.CalcularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/calcularnuevosprecios")
public class calcularController {

    @Autowired
    CalcularService calcularService;

    double precioDolar = 911.18;
    double precioEuro = 958.19;

    @GetMapping
    public ResponseEntity<List<Producto>> getAll() {
        List<Producto> productos = calcularService.getAllProductos();
        if(productos.isEmpty())
            return ResponseEntity.noContent().build();
        //Calculo del precio
        for(int i = 0; i < productos.size(); i++){
            double precioCLP = productos.get(i).getPrecio();
            productos.get(i).setPrecioUsd(precioCLP/precioDolar);
            productos.get(i).setPrecioEuro(precioCLP/precioEuro);
        }
        return ResponseEntity.ok(productos);
    }
}
