package MireaLab5;

public class Num5 {
    int rez = 0;
    public void req(int a){
        if (a/10 == 0){
            rez += a;
        } else {
            rez += a % 10;
            a /= 10;
            req(a);
        }
    }
}
