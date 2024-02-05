package PARK.Step_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main4 {

  public static void main(String arg[]) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
    int crdi[] = new int[2];

    for(int i = 0; i < 2; i++){
      crdi[i] = Integer.parseInt(br.readLine());
    }

    if (crdi[0] > 0){
      if (crdi[1] > 0){
          wr.write("1");
      }else {
        wr.write("4");
      }
    }else {
      if (crdi[1] > 0){
        wr.write("2");
      }else {
        wr.write("3");
      }
    }
    wr.close();
  }
}
