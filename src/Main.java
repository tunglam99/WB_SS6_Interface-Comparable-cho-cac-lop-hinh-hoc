
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.7,"Red",true);

        System.out.println("truoc khi so sanh");
        for (int i=0;i<3;i++) {
            System.out.println(circles[i]);
        }

        Arrays.sort(circles);

        System.out.println("truoc khi so sanh");
        for ( ComparableCircle circle: circles) {
            System.out.println(circle);
        }
    }
}
