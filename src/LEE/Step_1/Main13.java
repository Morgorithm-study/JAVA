package LEE.Step_1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main13 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("|\\_/|");   //버퍼에 있는 값 전부 출력
        bw.newLine();
        bw.write("|q p|   /}");
        bw.newLine();
        bw.write("( 0 )\"\"\"\\");
        bw.newLine();
        bw.write("|\"^\"`    |");
        bw.newLine();
        bw.write("||_/=\\\\__|");
        bw.flush();   //남아있는 데이터를 모두 출력시킴
        bw.close();   //스트림을 닫음
    }
}
