import Brands.Brand;
import Brands.BrandsManager;
import Products.MyProduct;
import Products.ProductType;

import java.util.*;

public class Shop {
    private String shopName;
    private BrandsManager brandsManager;

    public Shop(String shopName){
        this.shopName = shopName;
        this.brandsManager = new BrandsManager();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public BrandsManager getBrandsManager() {
        return brandsManager;
    }

    public void setBrandsManager(BrandsManager brandsManager) {
        this.brandsManager = brandsManager;
    }

    public void addBrand(String brandName){
        brandsManager.addBrand(brandName);
    }


    private int lastID = 0;
    public void addProduct(String brandName, MyProduct product){
        Brand brand = brandsManager.getBrand(brandName);
        //System.out.println(brand.getBrandName() + " isimli markaya şu ürün ekleniyor: " + product);
        if (brand.getId() == -1){
            return;
        }
        product.setID(lastID++);
        brand.addProduct(product);
    }

    public void listProducts(){
        TreeMap<ProductType, TreeSet<String>> pairs = new TreeMap<>();
        for (ProductType types : ProductType.values()){
            pairs.put(types, new TreeSet<>());
        }

        TreeSet<Brand> brands = brandsManager.getAllBrands();

        for (Brand brand : brands){
            for (MyProduct product : brand.getProduct()){
                TreeSet<String> values = pairs.get(product.getProductType());
                values.add(brand.getBrandName() + " " + product);
            }
        }

        System.out.println("** Beginning to print products **");

        for (ProductType types : pairs.keySet()){
            TreeSet<String> values = pairs.get(types);
            System.out.println("\n" + types + "s:");
            for (String s : values){
                System.out.println(s);
            }
            System.out.println("");
        }

        System.out.println("** End of products **");

    }

    public void listProducts(ProductType type){
        TreeSet<String> products = new TreeSet<>();

        TreeSet<Brand> brands = brandsManager.getAllBrands();
        for (Brand brand : brands){
            for (MyProduct product : brand.getProducts()){
                if (product.getProductType() == type){
                    products.add(product.getID() + ", " + brand.getBrandName() + ", " + product + ", " + product.getPrice() + "TL");
                }
            }
        }
        System.out.println("\n\n\n" + type + " Listesi\n");
        System.out.println("--------------------------------------------------");
        System.out.println("ID, Marka, Model, Fiyat");
        for (String s : products){
            System.out.println(s);
        }
        System.out.println("--------------------------------------------------\n\n");

    }

    public void listBrands() {
        TreeSet<Brand> brands = brandsManager.getAllBrands();
        System.out.println("\nMarkalarımız");
        System.out.println("--------------");
        for (Brand brand : brands) {
            System.out.println("- " + brand);
        }
        System.out.println("\n\n");
    }

}