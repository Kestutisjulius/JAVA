import java.lang.reflect.Array;

public class Kata{

    public static int grow(int[] x){
        int result = 1;
        for (int i = 0; i < x.length; i++) {
            result *= x[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4};

        System.out.println(grow(arr));

    }

}