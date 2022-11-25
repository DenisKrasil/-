public class mytree {
    public static void main (String[] args) {

        Man Pavel = new Man("Pavel" , "Ivanov" );
        Woman Helena = new Woman("Helena" , "Ivanova");
        Man Max = new Man("Max" , "Ivanov" );
        Woman Inna = new Woman("Inna", "Ivanova");
        Man Sergey = new Man("Sergey" , "Karpov" );
        Woman Olga = new Woman("Olga", "Frolova");
        Man Denis = new Man("Denis" , "Ivanov" );
        Man Igor = new Man("Igor" , "Ivanov" );
        Man Alex = new Man("Alex" , "Karpov" );
        // System.out.println(Pavel);
        // System.out.println(Helena);
        // System.out.println(Max);
        // System.out.println(Inna);
        Pavel.addCommunication(Max, TypeCommunication.Son);
        Pavel.addCommunication(Inna, TypeCommunication.Daughter);
        Helena.addCommunication(Max, TypeCommunication.Son);
        Helena.addCommunication(Inna, TypeCommunication.Daughter);
        Max.addCommunication(Pavel, TypeCommunication.Father);
        Max.addCommunication(Helena, TypeCommunication.Mother);
        Inna.addCommunication(Pavel, TypeCommunication.Father);
        Inna.addCommunication(Helena, TypeCommunication.Mother);
        Max.addCommunication(Denis, TypeCommunication.Son);
        Max.addCommunication(Igor, TypeCommunication.Son);
        Olga.addCommunication(Denis, TypeCommunication.Son);
        Olga.addCommunication(Igor, TypeCommunication.Son);
        Denis.addCommunication(Max, TypeCommunication.Father);
        Denis.addCommunication(Olga, TypeCommunication.Mother);
        Igor.addCommunication(Max, TypeCommunication.Father);
        Igor.addCommunication(Olga, TypeCommunication.Mother);
        Inna.addCommunication(Alex, TypeCommunication.Son);
        Sergey.addCommunication(Alex, TypeCommunication.Son);
        Alex.addCommunication(Inna, TypeCommunication.Father);
        Alex.addCommunication(Sergey, TypeCommunication.Mother);


        Pavel.showCommunication(TypeCommunication.Son);
        Max.showCommunication(TypeCommunication.Son);

        Alex.findGrandparrents();
        Igor.findGrandparrents();
        Denis.findGrandparrents();
        Max.findSibling();
    }
}