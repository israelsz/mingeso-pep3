package misha.calcularnuevospreciosservice.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import misha.calcularnuevospreciosservice.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CalcularService {

    @Autowired
    RestTemplate restTemplate;

    public List<Producto> getAllProductos(){
        //List<Producto> productos = restTemplate.getForObject("http://producto-service/producto", List.class);
        List<Producto> respuesta = restTemplate.getForObject("http://localhost:8080/producto", List.class);

        ObjectMapper mapper = new  ObjectMapper();
        List<Producto> productos = mapper.convertValue(respuesta, new TypeReference<List<Producto>>() {});
        return productos;
    }
    //public List<Producto> getAllProductos(){
    //    List<Producto> productos = productoFeignClient.getProductos();
    //    return productos;
    //}
}
