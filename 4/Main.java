public class Main {
    public static void main(String[] args) {
        Collection myCollection = new Collection();
        myCollection.addNumber(3);
        myCollection.addNumber(18);
        myCollection.addNumber(57);
        myCollection.addNumber(133);
        myCollection.addNumber(12);
        myCollection.addNumber(9);

        myCollection.getNumber(3);
        
        for (Integer num : myCollection) {
            System.out.println(num);
        }
    }
}