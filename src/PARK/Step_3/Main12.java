package PARK.Step_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main12 {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int a;
    int b;
    int sum = 0;
    String input;
    do {
      input = br.readLine();

      if (input == null || input.equals("")){
        break;
      }

      st = new StringTokenizer(input);
      a = Integer.parseInt(st.nextToken());
      b = Integer.parseInt(st.nextToken());

      sum = a + b;
      bw.write(Integer.toString(sum));
      bw.newLine();
    } while (true);

    bw.flush();
    bw.close();
    br.close();
  }

}
