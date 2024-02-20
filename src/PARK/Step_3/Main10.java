package PARK.Step_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main10 {

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
      // 5면 4(n - i), 1()
    for (int i = 1; i <= n; i++) {
      int j = 1;
      while (j <= n - i) {
        wr.write(" ");
        j++;
      }

      int k = 0;
      while (k <= n - j) {
        wr.write("*");
        j++;
      }
      wr.newLine();
    }
    wr.close();
  }

}

