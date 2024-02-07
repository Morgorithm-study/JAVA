package LEE.Step_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine()); //한줄 뒤로 입력할때 사용
        int b = Integer.parseInt(br.readLine());

        System.out.println(a * (b % 10));
        System.out.println(a * (b /10 % 10));
        System.out.println(a * (b / 100));
        System.out.println(a * b);
    }
}
