package PARK.Step_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main3 {

  public static void main(String[] arg) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());


    int input = Integer.parseInt(st.nextToken());

    if (input % 4 == 0 && input % 100 != 0){
      bw.write("1");
    } else if (input % 4 == 0 && input % 400 == 0){
      bw.write("1");
    } else {
      bw.write("0");
    }

    bw.close();
  }
}
