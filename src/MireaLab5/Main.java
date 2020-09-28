package MireaLab5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Num3 z = new Num3();
        Num4 d = new Num4();
        Num5 x = new Num5();
        z.req(5, 1);
        d.task(3, 4, 1);
        System.out.println(d.result);
        x.req(3345);
        System.out.println(x.rez);
    }
}
