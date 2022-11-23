import java.util.Scanner;
import java.util.Random;

public class Part2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter id:");
        String id = scan.next();
        if(id.length() != 5) {
            System.out.println("enter id that is 5 digits long:");
            id = scan.next();
        }

        scan.close();

        //System.out.println("enter input:");
        int state = 1;
        //String input = scan.next();
        String ucode = id + "1";
        String lcode = id + "4";
        //System.out.println(ucode);
        //System.out.println(lcode);
        //System.out.println(input);
        long counter = 0;
        while(state == 1) {
            double robl;
            Random rand = new Random();
            robl = rand.nextInt();
            robl = Math.random();
            String robbl = String.valueOf(robl);
            robbl = robbl.substring(2);
            String input = robbl;
            counter = counter + input.length();
        int i = 0;
        while(i<input.length()) {
            if(input.charAt(i) == id.charAt(0)) {
                int j = i;
                int pt = 0;
                while(j<input.length() && pt<ucode.length() 
                        && (ucode.charAt(pt)==input.charAt(j)
                        || lcode.charAt(pt)==input.charAt(j) )) {
                    j++;
                    pt++;
                }

                if(pt == id.length()+1) {
                    String code = input.substring(i,j);
                    //System.out.println("CODE DETECTED : "+ code );
                    if(code.equals(ucode)) {
                        state=0;
                    }else {
                        state=1;
                    }

                }

            }
            i++;
        }
// one is locked 0 is unlocked
//        if (state == 1) {
//            System.out.println("Final State is locked");
//        }
        if (state == 0) {
            System.out.println("counter :" + counter);
            System.out.println("Unlocked");
//        }
        }
        }
    }
}
