package PARK.Step_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main11 {

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int a;
    int b;
    int sum = 0;
    do {
      st = new StringTokenizer(br.readLine());
      a = Integer.parseInt(st.nextToken());
      b = Integer.parseInt(st.nextToken());

      if (a == 0 && b == 0){
        break;
      }

      sum = a + b;
      wr.write(Integer.toString(sum));
      wr.newLine();
    } while (true);

    wr.close();

  }

}
