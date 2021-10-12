package arraylists;

//@author sak5680

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayLists {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Cindy");
        System.out.println(friends.get(0));
        friends.set(0, "Harry");
        System.out.println(friends.get(0));
        System.out.println("Size: " + friends.size());
        friends.remove(0);
        System.out.println("Size: " + friends.size());

        ArrayList<Integer> scores = new ArrayList<>();
        int total = 0;
        for(int i = 0; i < 3; i++){
            System.out.println("Enter next score: ");
            scores.add(sc.nextInt());
        }
        System.out.println(scores);
        for (int s : scores){
            System.out.println(s);
            total += s;
        }
        System.out.println("Total: " + total);
    }

}
