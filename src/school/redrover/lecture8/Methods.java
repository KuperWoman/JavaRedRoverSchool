package school.redrover.lecture8;

public class Methods {

    boolean[]  n13 (int[] arr) {
        boolean[] arr1 = new boolean[arr.length] ;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                arr1[i] = true;
            } else {
                arr1[i] = false;

            }
        }
        return arr1;

    }


    int[] m1(int a, int b, int c, int d, int e) {
        return new int[]{a, b, c, d, e};

        }

    double[] m1(double a, double b, double c, double d, double e) {
        return new double[]{a, b, c, d, e};
    }


}
