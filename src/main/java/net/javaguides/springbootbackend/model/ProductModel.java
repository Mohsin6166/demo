package net.javaguides.springbootbackend.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

@Service
@Document(collection = "Table")
public class ProductModel {

    String product_name;

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    String product_description;

}
