package misha.productoservice.service;

import misha.productoservice.entity.Producto;
import misha.productoservice.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    public List<Producto> getAll(){
        return productoRepository.findAll();
    }
}
