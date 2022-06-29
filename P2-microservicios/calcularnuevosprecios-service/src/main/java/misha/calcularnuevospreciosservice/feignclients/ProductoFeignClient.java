package misha.calcularnuevospreciosservice.feignclients;

import misha.calcularnuevospreciosservice.model.Producto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "producto-service")
@RequestMapping("/producto")
public interface ProductoFeignClient {
    @GetMapping("/")
    List<Producto> getProductos();
}
