package PARK.Step_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main11 {

  public static void main(String[] args) throws Exception{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    Long n1 = Long.parseLong(st.nextToken());
    Long n2 = Long.parseLong(st.nextToken());
    Long n3 = Long.parseLong(st.nextToken());
    long result = n1 + n2 + n3;

    wr.write(Long.toString(result));
    wr.close();
  }
}
