package Java;

public class Iterando {
    public static void main(String[] args) {

        int limit = 10;
        int sumWhile = 0;
        int sumDo = 0;
        int sumFor = 0;
        int num = 0;


        while (num <= limit) {
            sumWhile += num;
            num++;
        }
        System.out.println(sumWhile);
        num = 0;

        do {
            sumDo += num;
            num++;
        } while (num <= limit);
        System.out.println(sumDo);

        for (int j = 0; j <= limit; j++) {
            sumFor += j;
        }
        System.out.println(sumFor);
    }
}
