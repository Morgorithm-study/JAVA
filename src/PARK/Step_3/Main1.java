package PARK.Step_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1 {

  public static void main(String[] args) throws Exception{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    for (int i = 1; i <= 9; i++) {
      bw.write(n+" * " +i+ " = " +(i * n));
      bw.newLine();
    }
    bw.close();
  }

}
