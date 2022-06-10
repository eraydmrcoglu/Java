package Products;

public interface MyProduct extends Comparable<MyProduct> {

    public String toString();

    public int getPrice();
    public void setPrice(int price);
    public String getProductName();
    public Products.ProductType getProductType();
    public void setProductName(String productName);
    public void setID(int id);
    public int getID();

}