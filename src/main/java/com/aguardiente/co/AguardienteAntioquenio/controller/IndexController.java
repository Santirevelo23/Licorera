package com.aguardiente.co.AguardienteAntioquenio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String verIndex() {
        return "index";
    }

    @RequestMapping("/cart")
    public String verCarrito() {
        return "cart";
    }


    @RequestMapping("/shop")
    public String verShop() {
        return "shop";
    }

    @RequestMapping("/product-single")
    public String verProductoSingle() {
        return "product-single";
    }

    @RequestMapping("/about")
    public String verAbout() {
        return "about";
    }

    @RequestMapping("/contact")
    public String verContact() {
        return "contact";
    }

    @RequestMapping("/blog-single")
    public String verBlogSingle() {
        return "blog-single";
    }

    @RequestMapping("/checkout")
    public String vercheckout() {
        return "checkout";
    }


}
