package PARK.Step_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main7 {

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    List<Integer> nums = new ArrayList<>();
    for (int i = 0; i < 3; i++){
        nums.add(Integer.parseInt(st.nextToken()));
    }

    int n1 = nums.get(0);
    int n2 = nums.get(1);
    int n3 = nums.get(2);

    int reward = 0;
    if (n1 == n2) {
      if (n2 == n3) {
        reward = 10000 + n1 * 1000;
      }else {
        reward = 1000 + n1 * 100;
      }
    }else {
      if (n3 == n1 || n3 == n2){
        reward = 1000 + n3 * 100;
      }else {
        int max = Collections.max(nums);
        reward =  max * 100;
      }
    }
    bw.write(Integer.toString(reward));
    bw.close();
  }
}
