package model;

/**
 * Created by Arka on 20-Nov-18.
 */
public class Product {
    private String productName;
    private ProductDetails productDetails;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductDetails getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(ProductDetails productDetails) {
        this.productDetails = productDetails;
    }
}
