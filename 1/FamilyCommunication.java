public class FamilyCommunication {
    private Human Human;
    private TypeCommunication typeCommunication;

    public FamilyCommunication(Human Human, TypeCommunication typeCommunication) {
        this.Human = Human;
        this.typeCommunication = typeCommunication;
    }

    public Human getHuman() {
        return Human;
    }

    public TypeCommunication getTypeCommunication() {
        return typeCommunication;
    }
}