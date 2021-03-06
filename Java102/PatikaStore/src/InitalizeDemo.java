import Products.Features.Spesifications.CPUModel;
import Products.Features.Spesifications.Ram;
import Products.ReadyTypes.CellPhone;
import Products.ReadyTypes.Notebook;

import static Products.ProductType.CellPhone;

public class InitalizeDemo {
    Shop shop;
    public InitalizeDemo(Shop shop){
        shop.addBrand("HP");
        shop.addBrand("ASUS");
        shop.addBrand("XIAOMI");
        shop.addBrand("SAMSUNG");

        CellPhone cellphone = new CellPhone("Mi9T", 3000);
        cellphone.setRam(Ram.GB6);
        shop.addProduct("XIAOMI", cellphone);


        Notebook notebook = new Notebook("Omen", 3400);
        notebook.setCpuModel(CPUModel.AMD_5900X);
        notebook.setRam(Ram.GB16);
        notebook.setDisc("2TB Nvme m2 ssd");
        shop.addProduct("HP", notebook);


        cellphone = new CellPhone("Note9", 5000);
        cellphone.setRam(Ram.GB6);
        shop.addProduct("SAMSUNG", cellphone);

    }
}