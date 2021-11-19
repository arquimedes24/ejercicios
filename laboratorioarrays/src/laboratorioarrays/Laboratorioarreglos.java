package laboratorioarrays;

public class Laboratorioarreglos {

    public static void main(String[] args) {

        int a[] = new int[5];
        int i;
        for (i = 0; i < a.length; i++) {
            a[i] = 0;
        }
        for (i = 0; i < a.length; i++) {
            System.out.println(" a [ " + i + "] = " + a[i]);
        }
        int[] b = {7, 3, 10, 8, 9, 6};
        for (i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "]= " + b[i]);
        }

    }

}
