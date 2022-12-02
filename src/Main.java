import java.util.*;

public class Main {
    public static void main(String[] args) throws ClassCastException {

        try {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 50; i++) {
                list.add((int) Math.round(Math.random() * 100));}

            getNum(list);
            
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void getNum(List<Integer>num) {
        ArrayList<List<Integer>> num1 = new ArrayList<>();
        ArrayList<List<Integer>> num2 = new ArrayList<>();
        for (Integer integer : num) {
            if (integer%2==0){
                num1.add(Collections.singletonList(integer));
            }else {
                num2.add(Collections.singletonList(integer));
            }
        }
        System.out.println(num1);
        System.out.println(num2);
    }

}