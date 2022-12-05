public class Main {
    public static void main (String[] args) {

        myTree ghj = new myTree();
        Human Pavel = new Human("Pavel" , "Ivanov" , "Муж");
        Human Helena = new Human("Helena" , "Ivanova" , "Жен");
        Human Max = new Human("Max" , "Ivanov" , "Муж");
        Human Inna = new Human("Inna", "Ivanova" , "Жен");
        Human Sergey = new Human("Sergey" , "Karpov" , "Муж");
        Human Olga = new Human("Olga", "Frolova" , "Жен");
        Human Denis = new Human("Denis" , "Ivanov" , "Муж");
        Human Igor = new Human("Igor" , "Ivanov" , "Муж");
        Human Alex = new Human("Alex" , "Karpov" , "Муж");
        System.out.println(Pavel);
        System.out.println(Helena);
        System.out.println(Max);
        System.out.println(Inna);
        // Pavel.addCommunication(Max, TypeCommunication.Son);
        // Pavel.addCommunication(Inna, TypeCommunication.Daughter);
        // Helena.addCommunication(Max, TypeCommunication.Son);
        // Helena.addCommunication(Inna, TypeCommunication.Daughter);
        // Max.addCommunication(Pavel, TypeCommunication.Father);
        // Max.addCommunication(Helena, TypeCommunication.Mother);
        // Inna.addCommunication(Pavel, TypeCommunication.Father);
        // Inna.addCommunication(Helena, TypeCommunication.Mother);
        // Max.addCommunication(Denis, TypeCommunication.Son);
        // Max.addCommunication(Igor, TypeCommunication.Son);
        // Olga.addCommunication(Denis, TypeCommunication.Son);
        // Olga.addCommunication(Igor, TypeCommunication.Son);
        // Denis.addCommunication(Max, TypeCommunication.Father);
        // Denis.addCommunication(Olga, TypeCommunication.Mother);
        // Igor.addCommunication(Max, TypeCommunication.Father);
        // Igor.addCommunication(Olga, TypeCommunication.Mother);
        // Inna.addCommunication(Alex, TypeCommunication.Son);
        // Sergey.addCommunication(Alex, TypeCommunication.Son);
        // Alex.addCommunication(Inna, TypeCommunication.Father);
        // Alex.addCommunication(Sergey, TypeCommunication.Mother);


        // Pavel.showPeopleByConnection(TypeCommunication.Son);
        // Max.showPeopleByConnection(TypeCommunication.Son);

        // Alex.findGrandparrents();
        // Igor.findGrandparrents();
        // Denis.findGrandparrents();
        // Max.findSibling();
        
        ghj.addFamilyMember(Max);
        ghj.addFamilyMember(Helena);
        ghj.addFamilyMember(Pavel);

        ghj.FindFamilyMemberByName("Max");
        UserInterface interface1 = new UserInterface();
        interface1.start();
    }
}
