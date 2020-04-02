import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class JumpingClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int indice_nubes = c.length - 1;
        int cant_saltos = 0;
        int posicion = 0;

        while (posicion < indice_nubes) {
            if (posicion + 2 == c.length || c[posicion + 2] == 1) {
                posicion++;
            } else {
                posicion += 2;
            }
            cant_saltos++;
        }

        return cant_saltos;
    }
    // 6
    // 0 0 0  1 0 0

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
