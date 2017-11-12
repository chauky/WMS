public class Dimension {
    private int lenght;

    public int getLenght() {
        return lenght;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    private int width;
    private int height;

    public Dimension(int lenght, int width, int height) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }


}
