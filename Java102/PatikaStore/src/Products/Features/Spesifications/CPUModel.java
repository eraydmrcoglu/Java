package Products.Features.Spesifications;

public enum CPUModel {
    AMD_5950X("AMD Ryzen R9 5950X"),
    INTEL_10900K("Intel Core i9-10900K Processor"),
    Intel_10900KF("Intel Core i9-10900KF Processor"),
    Intel_10850K("Intel Core i9-10850K Processor"),
    AMD_5900X("AMD Ryzen 9 5900X");

    private final String CPUModel = null;

    CPUModel(String s) {
    }

    @Override
    public String toString(){
        return this.CPUModel;
    }
}