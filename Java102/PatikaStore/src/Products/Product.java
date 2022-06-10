package Products;

public abstract class Product implements Products.MyProduct{
    private Products.ProductType productType;
    private String productName;
    private int price;
    private int id;

    public Product(Products.ProductType productType, String productName, int price){
        this.productType = productType;
        this.productName = productName;
        this.price = price;
        this.id = -1;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }
    public String getProductName(){
        return this.productName;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }

    @Override
    public int compareTo(Products.MyProduct product){
        return this.id - product.getID();
    }
    @Override
    public String toString(){
        return this.productName;
    }

    @Override
    public Products.ProductType getProductType() {
        return productType;
    }

    public void setID(int id) {
        this.id = id;
    }
    public int getID(){
        return this.id;
    }
}