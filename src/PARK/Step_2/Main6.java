package PARK.Step_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main6 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int hour = Integer.parseInt(st.nextToken());
    int minute = Integer.parseInt(st.nextToken());
    int addMinute = Integer.parseInt(br.readLine());

    minute += addMinute;
    if (minute >= 60) {
      hour += (minute / 60);
      hour = hour > 23 ? hour - 24 : hour;
      minute %= 60;
    }

    bw.write(Integer.toString(hour)+ " " +Integer.toString(minute));
    bw.close();
  }
}
