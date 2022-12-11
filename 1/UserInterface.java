import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private String surname;
    private String name;
    private String gender;

    

    public UserInterface() {
        
    }

    public  void start(){
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что хотите сделать:\n"  
        + "1 - добавить человека\n"
        + "2 - добавить человека\n"
        + "3 - показать родственников \n"
        + "4 - выход\n");

        int i = in.nextInt();

        if (i == 1) {
            System.out.println("Введите имя:");
            name = in.next();
            System.out.println("Введите фамилию:");
            surname = in.next();
            System.out.println("Введите пол:");
            gender = in.next();
            addHuman(name, surname, gender);
        }
        

        if(i == 3){
            System.out.println("Введите имя человека у которого хотите посмотреть родственников");

            System.out.println();
        }
        in.close();
    }

    public void addHuman(String name, String surname, String gender){
        Human Human = new Human(name, surname, gender);
        System.out.println("Добавлен человек " + Human.getName() + " " + Human.getSurname());
    }
}
