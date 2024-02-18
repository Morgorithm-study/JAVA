package PARK.Step_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main4 {

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int receiptPrice = Integer.parseInt(br.readLine());
    int itemNum = Integer.parseInt(br.readLine());
    int realPrice = 0;

    for (int i = 0; i < itemNum; i++) {
      st = new StringTokenizer(br.readLine());
      int num = Integer.parseInt(st.nextToken());
      int itemPrice = Integer.parseInt(st.nextToken());
      realPrice += num * itemPrice;
    }

    if (realPrice == receiptPrice) {
      bw.write("Yes");
    } else {
      bw.write("No");
    }

    bw.close();

  }

}
