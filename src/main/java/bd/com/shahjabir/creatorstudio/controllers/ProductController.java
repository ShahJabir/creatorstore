package bd.com.shahjabir.creatorstudio.controllers;

import bd.com.shahjabir.creatorstudio.entities.Product;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @PostMapping
    public Product createProduct(@Valid @RequestBody Product product) {
        return null;
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @Valid @RequestBody Product product) {
        return null;
    }

    @GetMapping
    public List<Product> getProducts() {
        return null;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
    }
}
