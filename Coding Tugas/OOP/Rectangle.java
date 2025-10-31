package OOP;
// Method untuk buat rectangle 
public class Rectangle {
    double width;
    double height;

    public Rectangle() {
        width = 1;
        height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    } // this. digunakan kalau ada variable sama (this.width = lebar milik objek ini (yang baru dibuat).)

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
//UML
/* 
+---------------------+
|     Rectangle       |
+---------------------+
| - width : double    |
| - height : double   |
+---------------------+
| + Rectangle()       |
| + Rectangle(width,  |
|   height)           |
| + getArea(): double |
| + getPerimeter():   |
|   double            |
+---------------------+
*/
