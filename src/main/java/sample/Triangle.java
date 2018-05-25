package sample;

/**
 * Created by user on 3/17/17 00:03.
 */
public class Triangle {
    public static String checkTriangle(int a, int b, int c){

        if ((a <= 0) || (b <= 0) || (c <= 0)) {
            return "Invalid";
        }
        if ((a + b < c)){
            return "None Triangle";
        }
        if ((a == b) || (b == c) || (a == c)){
            return "Isosceles Triangle";
        }
        if ((a == b) && (a == c)) {
            return "Equilateral Triangle";
        }
        if ((a * a + b * b == c * c) || (a * a + c * c == b * b) ||  (b * b + c * c == a * a)){
            return "Right Triangle";
        }
        else {
            return "Scalene Triangle";
        }
    }
}
