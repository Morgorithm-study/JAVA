package PARK.Step_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main7 {

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int n = Integer.parseInt(br.readLine());
    int sum = 0;
    int b;

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
      wr.write("Case #" +Integer.toString(i + 1)+ ": " +Integer.toString(sum));
      wr.newLine();
    }
    wr.close();

  }

}
