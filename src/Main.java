import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] name = {2,-6,0,26,-7,4,30,-2,12,};

        boolean summa = false;
        int num;
        while(!summa) {
            summa = true;
            for (int i = 0; i < name.length-1; i++) {
                if(name[i] > name[i+1]){
                    summa = false;

                    num = name[i];
                    name[i] = name[i+1];
                    name[i+1] = num;
                }
            }
        }
        System.out.println(Arrays.toString(name));
    }
}