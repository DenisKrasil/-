package View;
import java.util.Scanner;
public class MyView implements View {

    private Scanner scanner;
    

    public MyView() {
        scanner  = new Scanner(System.in);
    }

    public int getValue(String title) {
        System.out.printf("%s", title);
        return scanner.nextInt();
    }

    public char getOpperation(String title){
        System.out.printf("%s", title);
        return scanner.next().charAt(0);
}

    // print(f'{title} = {data}')
    public void print(int data, String title) {
        System.out.printf("%s %d\n", title, data);
    }
}
