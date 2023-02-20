import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("");
        String[] femElement = new String[5];

        femElement[0] = ("A");
        femElement[1] = ("B");
        femElement[2] = ("C");
        femElement[3] = ("E");
        femElement[4] = ("D");
        Arrays.sort(femElement);
        for (int i = 0; i < 5; i++) {
            System.out.println(femElement[i]);
        }
            boolean[] fyraElement1 = {true, false, true, false};

            for (int i = 0; i < fyraElement1.length; i++) {
                if (fyraElement1[i] == true) {
                    fyraElement1[i] = false;
                } else {
                    fyraElement1[i] = true;
                }
                System.out.println(fyraElement1[i]);
            }
                String[] fyraElement = new String[4];

                fyraElement[0] = ("1");
                fyraElement[1] = ("2");
                fyraElement[2] = ("3");
                fyraElement[3] = ("4");

                for (int i = 3; i > -1; i--) {
                    System.out.println(fyraElement[i]);


                }

            }
        }

