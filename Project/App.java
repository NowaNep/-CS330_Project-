import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // part one kekw
        Scanner scan = new Scanner(System.in);
        System.out.println("enter id of 5 digits:");
        String id = scan.next();

        // asks for an id
        if(id.length() != 5) {
            System.out.println("enter id that is 5 digits long:");
            id = scan.next();
        }

        

        //asks for input
        System.out.println("enter input:");
        String input = scan.next();
        String ucode = id + "1";
        String lcode = id + "4";

        //close scanner
        scan.close();

        int state = inputreader(id, input, ucode, lcode);

        // if state is 1 then it is locked as final
        // if state is 0 then it is unlocked as final
        if (state == 1) {
            System.out.println("Locked");
        }
        if (state == 0) {
            System.out.println("Unlocked");
        }
    }

    //part 1 code
    public static int inputreader(String id, String input, String ucode, String lcode){
        //checks for if lock is in the string
        int state = 1;
        int i = 0;
        while(i < input.length()) {
            if(input.charAt(i) == id.charAt(0)) {
                int j = i;
                int pt = 0;
                while(j <input.length() && pt < ucode.length() 
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
                    }else{
                        state=1;
                    }
                    
                }
                
            }
            i++;
            
        }
        return state;
    }
}