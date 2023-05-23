package homeWork_Java_3;

public class Wall {
    double width;
    double height;

    Wall() {
    }

    Wall(double width, double height) {

        if (width < 0) {
            width = 0;
        } else if (height < 0) {
            height = 0;
        } else {
            this.width = width;
            this.height = height;
        }
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }

    }

    public double getArea() {
        return width * height;
    }
    public static void main(String[] args) {

        Wall wal = new Wall(5, 4);
        System.out.println("area= " + wal.getArea());
        wal.setHeight(-1.5);
        System.out.println("width= " + wal.getWidth());
        System.out.println("height= " + wal.getHeight());
        System.out.println("area= " + wal.getArea());
    }
}
