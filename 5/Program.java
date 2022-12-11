import Presenter.Presenter;
import View.View;
import Model.CalcModel;

public class Program {
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new View(), new CalcModel());

        presenter.buttonClick();
        presenter.buttonClick();
        presenter.buttonClick();
        presenter.buttonClick();
    }
}
