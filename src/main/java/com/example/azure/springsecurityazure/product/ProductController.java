package com.example.azure.springsecurityazure.product;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	//show home
	@RequestMapping("/")
	@PreAuthorize("hasRole('ROLE_group1')")
	public String home(Model m) {
		List<Product> products = productService.getProducts();
		m.addAttribute("products",products);
		return "index";
	}
	
	//show add-product form
	@RequestMapping("/add_product")
	public String addProduct(Model m) {
		m.addAttribute("title","Add Product");
		return "add_product_form";
	}
	
	//handle add-product form and return to home after adding
	@RequestMapping(value="/handle_product_add", method=RequestMethod.POST)
	public String handleProduct(@ModelAttribute Product product) {
		System.out.println(product);
		productService.createProduct(product);
		return "redirect:/";
	}
	
	//delete handler using GET request(POST request can also be used)
	@RequestMapping("/delete/{productId}")
	public String deleteProduct(@PathVariable("productId") int productId) {
		this.productService.deleteProduct(productId);
		return "redirect:/";
	}
	
	@RequestMapping("/update/{productId}")
	public String updateForm(@PathVariable("productId") int productId, Model model) {
		Optional<Product> products=this.productService.getProduct(productId);
		
		if(products.isPresent()) {
			Product product=products.get();
			model.addAttribute("title","Update Product");
			model.addAttribute("product",product);
			return "update-form";
		}
		else {
			return "error";
		}
		
	}
	
	@RequestMapping(value="/handle_product_update", method=RequestMethod.POST)
	public String handleProductUpdate(@ModelAttribute Product product) {
		System.out.println(product);
		this.productService.updateProduct(product);
		return "redirect:/";
	}

}
