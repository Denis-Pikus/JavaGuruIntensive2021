package dpdev.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private List<Product> productList = new ArrayList<>();

    public Shop() {
    }

    public Shop(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        if (product == null) return;
        else productList.add(product);
    }

    public void removeProduct(Product product) {
        if (product == null) return;
        Iterator<Product> productIterator = productList.iterator();
        while (productIterator.hasNext()) {
            Product product1 = productIterator.next();
            if (product1.equals(product)) {
                productList.remove(product);
            }
        }
    }

    public Product findProductByName(String nameProduct) {
        if (nameProduct == "") return null;
        return productList.stream()
                .filter(p -> p.getName().toLowerCase().equals(nameProduct.toLowerCase()))
                .findFirst().orElse(null);
    }

// сравнение чисел BigDecimal: compareTo(BigDecimal other): сравнивает два числа. Возвращает -1,
// если текущий объект меньше числа other, 1 - если текущий объект больше и 0 - если числа равны

    public List<Product> findProductByRangeOfPrice(BigDecimal minPriceRange, BigDecimal maxPriceRange) {
        return productList.stream()
                .filter(p -> p.getPrice().compareTo(minPriceRange) != 1
                        || p.getPrice().compareTo(maxPriceRange) != -1)
                .collect(Collectors.toList());
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
