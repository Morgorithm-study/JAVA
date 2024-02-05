package PARK.Step_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main5 {

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    final int ARARLM = 45;

    int hour = Integer.parseInt(st.nextToken());
    int minute = Integer.parseInt(st.nextToken());

    if (minute - ARARLM >= 0){
      minute -= ARARLM;
    }else {
      minute = (minute - ARARLM) + 60;
      hour = (hour == 0) ? 23 : hour - 1;
    }
    bw.write(Integer.toString(hour)+" "+Integer.toString(minute));
    bw.close();
  }
}
