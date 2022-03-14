import java.util.*;
public class GitHubRepoFile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int res;
        int inp = 0;
        System.out.println("What is the first Number?");
        int one = s.nextInt();
        System.out.println("What is the second Number?");
        int two = s.nextInt();
        System.out.println("Which would you like to do?\n1. Add\n2. Subtract");
        inp = s.nextInt();
        if (inp == 1){
            res = one+two;
            System.out.println("The Result is: "+res);
        }

    }
}
