package PARK.Step_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main2 {

  public static void main(String[] args) throws Exception{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int score = Integer.parseInt(st.nextToken());

    if (score >= 90){
      wr.write("A");
    }else if (score >= 80){
      wr.write("B");
    }else if (score >= 70){
      wr.write("C");
    }else if (score >= 60){
      wr.write("D");
    }else {
      wr.write("F");
    }
    wr.close();
  }
}
