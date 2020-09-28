package MireaLab5;

public class Num3 {
    public void req(int a, int b) {
        if (a == b){
            System.out.println(a);
        }else if (a > b){
            int num = a;
            System.out.println(num);
            req(a-1, b);
        }else {
            int num = b;
            req(a , b - 1);
            System.out.println(num);
        }
    }
}
