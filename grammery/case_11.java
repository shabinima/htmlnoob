package grammery;

public class case_11 {
    public static void main(String[] args) {
        int i=10;
        int j=20;
        //&和&&
        //System.out.println((i++>100)&(j++>100));
        System.out.println((i++>100)&&(i++>100));
        System.out.println("i:"+i);
        System.out.println("j"+j);
    }
}
