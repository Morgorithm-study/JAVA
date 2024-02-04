package PARK.Step_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main6 {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    Integer n1 = Integer.parseInt(st.nextToken());
    Integer n2 = Integer.parseInt(st.nextToken());

    System.out.println(n1 + n2);
    System.out.println(n1 - n2);
    System.out.println(n1 * n2);
    System.out.println(n1 / n2);
    System.out.println(n1 % n2);
  }
}
