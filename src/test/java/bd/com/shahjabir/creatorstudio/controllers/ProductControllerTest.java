package bd.com.shahjabir.creatorstudio.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductControllerTest {

    @Test
    void getProductsMappingIncludesTrailingSlash() throws Exception {
        RequestMapping classMapping = ProductController.class.getAnnotation(RequestMapping.class);
        assertArrayEquals(new String[]{"/api/products"}, classMapping.value());

        Method method = ProductController.class.getDeclaredMethod("getProducts");
        GetMapping getMapping = method.getAnnotation(GetMapping.class);
        assertArrayEquals(new String[]{"", "/"}, getMapping.value());

        assertEquals(2, getMapping.value().length);
    }
}
