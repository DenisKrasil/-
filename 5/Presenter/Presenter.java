package Presenter;

import View.View;
import Model.Model;


public class Presenter {
    View view;
    Model model;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void buttonClick(){
        int a = view.getValue("Введите первое число: ");
        int b = view.getValue("Введите второе число: ");
        model.setX(a);
        model.setY(b);
        char operation = view.getOpperation("Введите операцию (+,-,/,*) :");
        while (true){
            switch (operation){
                case '+':
                    System.out.println("Результат:  " + model.Sum());
                    break;
                case '-':
                    System.out.println("Результат:  " + model.Sub());
                    break;
                case '*':
                    System.out.println("Результат:  " + model.Mult());
                    break;
                case '/':
                    System.out.println("Результат:  " + model.Div());
                    break;
                default:
                    System.out.println("Введен неверный символ");
            }
        return ;
    }
}
}
