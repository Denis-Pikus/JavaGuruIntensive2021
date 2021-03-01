package dpdev.shop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shop {
    private List<Product> productList = new ArrayList<>();

    public Shop(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public void removeProduct(Product product){
        Iterator<Product> productIterator = productList.iterator();
        while (productIterator.hasNext()){
            Product product1 = productIterator.next();
            if (product1.equals(product)){
                productList.remove(product);
            }
        }
    }



}
