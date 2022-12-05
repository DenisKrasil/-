import java.util.ArrayList;
import java.util.List;

public class myTree implements Tree{
    List<Human> myFamily;

    public  myTree() {
        myFamily = new ArrayList<>();
    }

    public List<Human> getMyFamily() {
        return myFamily;
    }

    public void setMyFamily(List<Human> myFamily) {
        this.myFamily = myFamily;
    }

    public void addFamilyMember(Human Human){
        getMyFamily().add(Human);
    }

    public void FindFamilyMemberByName(String name) {
        for (Human Human : myFamily){
            
            if (Human.getName() == name){
                System.out.println("В семье есть человек с таким именем :");
                System.out.println(Human.getName()+" " + Human.getSurname());
                return;
            }
        }
    }
}