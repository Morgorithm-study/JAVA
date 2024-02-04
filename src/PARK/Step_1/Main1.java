package PARK.Step_1;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main1 {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
    String str = "Hello World!"; // 출력할 문자열
    bw.write(str); // 출력
    bw.flush(); // 남아있는 데이터 모두 출력
    bw.close();
  }
}
