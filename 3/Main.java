public class Main {

    public static void main(String[] args) {
        NumbersList NumList = new NumbersList();
        Numbers num1 = new Numbers(123);
        Numbers num2 = new Numbers(324);
        Numbers num3 = new Numbers(49);

        NumList.addNum(num1);
        NumList.addNum(num2);
        NumList.addNum(num3);

        for (Numbers Numbers : NumList) {
            System.out.println(Numbers);
        }

        NumList.sort();

        for (Numbers Numbers : NumList) {
            System.out.println(Numbers);
        }

    }  

}