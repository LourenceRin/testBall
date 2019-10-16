import java.util.*;

public class Main {
    private final static int N  = 10;
    private final static int NForWhite = (int) (Math.random() * 10);
    public static void main(String[] args) {

        Map<Integer, Ball> box = new HashMap<>();
        Ball white = new Ball("White");
        List<Ball> list = new ArrayList<>();

        box.put(NForWhite, white);

        System.out.println(NForWhite);
        for (int i = 0; i < N; i++){
            if (i == NForWhite){
                box.put(i + 1 ,new Ball("Black"));
            }else {
                box.put(i ,new Ball("Black"));
            }
        }

        for (int i = 0; i < box.size(); i++){
            if (box.get(i).color.equals("White")){
                list.add(box.get(i));
            }
        }

        System.out.println(" ");

       System.out.println(list.get(0).color);
    }
}
