package View;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public int getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

    public char getOpperation(String title){
        System.out.printf("%s", title);
        return in.next().charAt(0);
}

    // print(f'{title} = {data}')
    public void print(int data, String title) {
        System.out.printf("%s %d\n", title, data);
    }
}
