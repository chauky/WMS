public class Location {
    private SKU sku;
    private String buildingName;
    private String aisle;

    public SKU getSku() {
        return sku;
    }

    public void setSku(SKU sku) {
        this.sku = sku;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getAisle() {
        return aisle;
    }

    public void setAisle(String aisle) {
        this.aisle = aisle;
    }

    public String getPalletRack() {
        return palletRack;
    }

    public void setPalletRack(String palletRack) {
        this.palletRack = palletRack;
    }

    public int getFloorStack() {
        return floorStack;
    }

    public void setFloorStack(int floorStack) {
        this.floorStack = floorStack;
    }

    private String palletRack;
    private int floorStack;


    public Location(SKU sku, String buildingName, String aisle, String palletRack, int floorStack) {
        this.sku = sku;
        this.buildingName = buildingName;
        this.aisle = aisle;
        this.palletRack = palletRack;
        this.floorStack = floorStack;
    }
}
