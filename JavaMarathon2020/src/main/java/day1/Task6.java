package day1;

public class Task6 {
    public static void main(String[] args) {
        int k = 5;
        int j = 1;
        for(int i = 1; i<10; i++){
            System.out.printf("%d x %d = %d\n", i, k, i*k);
        }
        while (j<10){
            System.out.printf("%d x %d = %d\n", j, k, j*k);
            j++;
        }

    }
}
