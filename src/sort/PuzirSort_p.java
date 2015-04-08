package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Stitch on 23.12.2014.
 */
public class PuzirSort_p {
    public static void main(String[] args) throws IOException {
        int[] mas = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = mas.length -1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int tmp;
                if (mas[j] < mas[j + 1]) {
                    tmp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }
}
