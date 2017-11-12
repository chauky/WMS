import java.awt.Dimension;
import java.time.LocalDate;

public class SKU {
    private Dimension dimension;

    public Dimension getDimension() {
        return dimension;
    }

    public double getWeigh() {
        return weigh;
    }

    public LocalDate getDeliveryTime() {
        return deliveryTime;
    }

    public int getLowVolumeMark() {
        return lowVolumeMark;
    }

    public int getMaxVolumeMark() {
        return maxVolumeMark;
    }

    private double weigh;
    private LocalDate deliveryTime;
    private int lowVolumeMark;
    private int maxVolumeMark;

    public SKU(Dimension dimension, double weigh, LocalDate deliveryTime, int lowVolumeMark, int maxVolumeMark) {
        this.dimension = dimension;
        this.weigh = weigh;
        this.deliveryTime = deliveryTime;
        this.lowVolumeMark = lowVolumeMark;
        this.maxVolumeMark = maxVolumeMark;
    }
}
