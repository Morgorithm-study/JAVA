package PARK.Step_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main3 {

  public static void main(String[] arg) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int total = 0;

    for (int i = 1; i <= n; i++){
      total += i;
    }
    bw.write(Integer.toString(total));
    bw.close();
  }

}
