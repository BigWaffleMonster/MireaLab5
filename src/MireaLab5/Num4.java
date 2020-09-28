package MireaLab5;

public class Num4 {
    int result = 0;
    public void task(int kTask, int sTask, int number){
        int raz = 0, sum = 0, a = kTask, b = sTask, c = number, d = 0;
        while(c > 0){
            sum += c % 10;
            c = c / 10;
            raz++;
        }
        if (raz > kTask)
            return;
        if ((raz <= kTask) && (sum == sTask)){
            result++;
        }
        task(a, b, number+1);
    }
}
