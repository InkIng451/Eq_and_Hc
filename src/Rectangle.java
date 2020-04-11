import java.util.Objects;

public class Rectangle {
    public static void main(String [] args){

        Object object = new Object();
        Object object1 = new Object();
        
        int color = object.hashCode();
        int width = object1.hashCode();
        int length = object1.hashCode();

        System.out.println(Objects.equals(color, width));
        System.out.println(Objects.equals(color, length));

        System.out.println(Objects.equals(width, color));
        System.out.println(Objects.equals(width, length));

        System.out.println(Objects.equals(length, color));
        System.out.println(Objects.equals(length, width));
    }
}
