package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Stitch on 22.12.2014.
 */
public class PuzirSort_n {
    public static void main(String[] args) throws IOException {
        int[] mas = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < mas.length -1; i++) {
            for (int j = mas.length -1; j > i; j--) {
                int tmp;
                if (mas[j] < mas[j - 1]) {
                    tmp = mas[j];
                    mas[j] = mas[j - 1];
                    mas[j - 1] = tmp;
                }
            }
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }
}
