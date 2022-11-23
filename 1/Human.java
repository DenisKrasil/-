import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }


    @Override
    public String toString() {
        return name + " " + surname;
    }

    private List<FamilyCommunication> listCommunication = new ArrayList<>();

    public void addCommunication(FamilyCommunication communication){
        listCommunication.add(communication);
    }

    public void addCommunication(Human human, TypeCommunication typeCommunication){
        addCommunication(new FamilyCommunication(human, typeCommunication));
    }

    public void showCommunication(TypeCommunication typeCommunication){
        for (FamilyCommunication communication: listCommunication){
            if (communication.getTypeCommunication() == typeCommunication){
                System.out.println(communication.getHuman());
            }
        }
    }

    //Показывает бабушку и дедушку по матери и отцу

    public void findGrandparrents(){
        for (FamilyCommunication communication: listCommunication){
            if (communication.getTypeCommunication() == TypeCommunication.Father){
                communication.getHuman().showCommunication(TypeCommunication.Father);
                communication.getHuman().showCommunication(TypeCommunication.Mother);
            }
            if (communication.getTypeCommunication() == TypeCommunication.Mother){
                communication.getHuman().showCommunication(TypeCommunication.Father);
                communication.getHuman().showCommunication(TypeCommunication.Mother);
            }
        }
    }

    // Показывает братьев и сестер
    
    public void findSibling(){
        for (FamilyCommunication communication: listCommunication){
            if (communication.getTypeCommunication() == TypeCommunication.Father ) {
                communication.getHuman().showCommunication(TypeCommunication.Son);
                communication.getHuman().showCommunication(TypeCommunication.Daughter);
                break;
            }
            else if (communication.getTypeCommunication() == TypeCommunication.Mother) {
                communication.getHuman().showCommunication(TypeCommunication.Son);
                communication.getHuman().showCommunication(TypeCommunication.Daughter);
                break;
            }
        }
    }
}