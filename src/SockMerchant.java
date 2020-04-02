import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        int num_pares = 0;

        if (ar.length == 0) return num_pares;

        Set<Integer> miSet = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            if (!miSet.contains(ar[i])) {
                miSet.add(ar[i]);
            } else {
                num_pares++;
                miSet.remove(ar[i]);
            }
        }
        return num_pares;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("c:file.txt")));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

