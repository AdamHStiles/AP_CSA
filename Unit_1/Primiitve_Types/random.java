package Unit_1.Primiitve_Types;
public class random {
    // Formula: (int)(Math.random() * (max-min + 1)) + min;
    public static void main(String[] args){
        int min = 0;
        int max = 10;
        double randNum1 = (int)(Math.random() * (max - min +1)) + min;
        System.out.println(randNum1);
    }
}