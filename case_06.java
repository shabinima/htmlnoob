package grammery;

public class case_06 {
    public static void main(String[] args) {
        int S=150;
        int H=210;
        int E=165;
        int A=S>H?S:H;
        int B=A>E?A:E;
        System.out.println("身高最高为:"+B);
    }
}
