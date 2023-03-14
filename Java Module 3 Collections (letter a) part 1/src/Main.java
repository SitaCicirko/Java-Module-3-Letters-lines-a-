import java.util.*;
import java.lang.*;

    class Letters {

        public static void main(String[] args) throws java.lang.Exception {

            Deque<String> lettersQueue = new ArrayDeque<>();
            Random theGenerator = new Random();
            for (int i = 0; i < 50; i++) {
                int numberOfRepeats = theGenerator.nextInt(50) + 1;
                String a = "";
                for (int j = 0; j < numberOfRepeats; j++) {
                    a += "a";
                }
                lettersQueue.offer(a);
            }
            for (String a : lettersQueue
            ) {
                System.out.println(a);
            }
        }
    }