import java.util.ArrayList;
import java.util.Collections;
public class main {
    public static final int DECK = 52;
    public static void main(String args[])
    {
        ArrayList<Integer> deck = new ArrayList<Integer>();
        for (int x = 0; x < DECK; ++x)
        {
            deck.add(x);
        }
        Collections.shuffle(deck);
        System.out.println("Se mezclo el Deck");
        System.out.println(deck);
    }
}