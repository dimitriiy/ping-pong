

public class Utils {
    public static boolean isCollision(double[][] obj1, double[][] obj2) {

        return (
                (obj1[0][0] > obj2[0][0] && obj1[0][0] <= obj2[1][0] || obj1[1][0] < obj2[1][0] &&
                obj1[1][0] > obj2[0][0]) && obj1[0][1] > obj2[0][1] && obj1[3][1] <= obj2[3][1]
        );
    };
}
