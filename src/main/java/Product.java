import java.time.LocalDate;

public class Product {
    private String id;
    private String name;
    private String lotCode;
    private LocalDate manufacturerDate;

    public Product(String id, String name, String lotCode, LocalDate manufacturerDate) {
        this.id = id;
        this.name = name;
        this.lotCode = lotCode;
        this.manufacturerDate = manufacturerDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLotCode() {
        return lotCode;
    }

    public LocalDate getManufacturerDate() {
        return manufacturerDate;
    }
}
