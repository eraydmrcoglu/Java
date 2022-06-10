package Brands;

import Products.MyProduct;

import java.util.Collection;
import java.util.TreeSet;

public class BrandsManager {
    private TreeSet<Brands.Brand> brands;
    public BrandsManager(){
        brands = new TreeSet<>();
    }

    public Brands.Brand addBrand(String brandName){
        int id = brands.size();
        //System.out.println("Yeni marka " + brandName + ", mağazaya " + id + " id ile eklendi");
        Brands.Brand resultBrand = new Brands.Brand(brandName, id);
        brands.add(resultBrand);
        return resultBrand;
    }

    public Brands.Brand getBrand(String brandName){
        for (Brands.Brand brand : brands){
            if (brand.getBrandName().equals(brandName)){
                return brand;
            }
        }
        Brands.Brand resultBrand = addBrand(brandName);
        return resultBrand;
    }

    public TreeSet<Brands.Brand> getAllBrands(){
        return this.brands;
    }

    public TreeSet<Products.MyProduct> getAllProducts(){
        TreeSet<Products.MyProduct> products = new TreeSet<>();
        for (Brands.Brand brand : brands){
            products.addAll((Collection<? extends MyProduct>) brand.getProducts());
        }
        return products;
    }
}