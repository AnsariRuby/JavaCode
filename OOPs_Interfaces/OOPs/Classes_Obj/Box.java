package Learn_Java.OOPs_Interfaces.OOPs.Classes_Obj;

public class Box {
    double width, height, depth;
    int boxNo;

    // constructor used when no dimensions specified
    Box() {
        width = height = depth = 0.0;
    }

    // constructor used when cube is created
    Box(double value) {
        width = value;
        height = value;
        depth = value;
    }

    // constructor used when dimension should be taken from another object
    Box(Box other) {
        this.width = other.width;
        this.height = other.height;
        this.depth = other.depth;
    }

    // constructor used when all dimensions specified
    Box(double w, double h, double d, int num) {
        width = w;
        height = h;
        depth = d;
        boxNo = num;
    }

    Box(double val, int num) {
        this(val);
        boxNo = num;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}
