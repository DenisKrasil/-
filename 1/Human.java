import java.util.ArrayList;
import java.util.List;

public class Human  {
    private String name;
    private String surname;
    private String gender;
    List<FamilyCommunication> listCommunication;

    public Human(String name, String surname, String gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.listCommunication = new ArrayList<>();
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

    
    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + gender;
    }



    public void addCommunication(FamilyCommunication communication){
        listCommunication.add(communication);
    }

    public void addCommunication(Human human, TypeCommunication typeCommunication){
        addCommunication(new FamilyCommunication(human, typeCommunication));
    }

    public void showPeopleByConnection(TypeCommunication typeCommunication){
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
                communication.getHuman().showPeopleByConnection(TypeCommunication.Father);
                communication.getHuman().showPeopleByConnection(TypeCommunication.Mother);
            }
            if (communication.getTypeCommunication() == TypeCommunication.Mother){
                communication.getHuman().showPeopleByConnection(TypeCommunication.Father);
                communication.getHuman().showPeopleByConnection(TypeCommunication.Mother);
            }
        }
    }

    // Показывает братьев и сестер

    public void findSibling(){
        for (FamilyCommunication communication: listCommunication){
            if (communication.getTypeCommunication() == TypeCommunication.Father ) {
                communication.getHuman().showPeopleByConnection(TypeCommunication.Son);
                communication.getHuman().showPeopleByConnection(TypeCommunication.Daughter);
                break;
            }
            else if (communication.getTypeCommunication() == TypeCommunication.Mother) {
                communication.getHuman().showPeopleByConnection(TypeCommunication.Son);
                communication.getHuman().showPeopleByConnection(TypeCommunication.Daughter);
                break;
            }
        }
    }
}