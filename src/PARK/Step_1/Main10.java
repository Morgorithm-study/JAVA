package PARK.Step_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main10 {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] nums = new String[2];

    for (int i = 0; i < 2; i++) {
      nums[i] = br.readLine();
    }

    String[] numsStr = nums[1].split("");

    int tens = 1;
    int total = 0;
    for (int i = nums[1].length() - 1; i >= 0; i--){
      int output = Integer.parseInt(numsStr[i]) * Integer.parseInt(nums[0]);
      bw.write(Integer.toString(output));
      total += (output * tens);
      tens *= 10;
      bw.newLine(); // 줄바꿈
    }
    bw.write(Integer.toString(total));
    bw.close();
  }
}
