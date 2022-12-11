package Presenter;

import View.View;
import Model.CalcModel;


public class Presenter {
    View View;
    CalcModel Model;

    public Presenter(View view, CalcModel calcModel) {
        View = view;
        Model = calcModel;
    }

    public void buttonClick(){
        int a = View.getValue("Введите первое число:");
        int b = View.getValue("Введите второе число");
        Model.setX(a);
        Model.setY(b);
        char operation = View.getOpperation("Введите операцию (+,-,/,*) :");
        while (true){
            switch (operation){
                case '+':
                    System.out.println("Результат:  " + Model.Sum());
                    break;
                case '-':
                    System.out.println("Результат: " + Model.Sub());
                    break;
                case '*':
                    System.out.println("Результат: " + Model.Mult());
                    break;
                case '/':
                    System.out.println("Результат: " + Model.Div());
                    break;
                default:
                    System.out.println("Введен неверный символ");
            }
        return ;
    }
}
}
