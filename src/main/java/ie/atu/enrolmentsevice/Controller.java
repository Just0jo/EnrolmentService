package ie.atu.enrolmentsevice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final EnrolService enrolService;
    public Controller(EnrolService enrolService)
    {
        this.enrolService = enrolService;
    }
    @PostMapping("/ProductPost")
    public String addProduct(@RequestBody Product product){
        return enrolService.addProduct(product);
    }
    @GetMapping("/ProductGet")
    public String studentDetails(@RequestBody Product Product) {
        String getProducts = "received"+ product.getstudentId() + pruduct.getfirstName() + product.getlastName + product.getemail + product.getdateOfBirth;
        return getProducts;
    }

}
