package project.suzieqcraft.Model;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class ProductArrayList extends ArrayList<Product> {

    ArrayList<Product> productList = new ArrayList();


    public ProductArrayList(){
        super();
    }


    public ArrayList getProductList() {
        return productList;
    }

    public ArrayList setProductList(ArrayList productList) {
        this.productList = productList;
        return this;
    }
}

