import Presenter.Presenter;
import View.MyView;
import View.View;
import Model.CalcModel;
import Model.Model;

public class Program {
    public static void main(String[] args) {
        View view = new MyView();
        Model model = new CalcModel();
        Presenter presenter = new Presenter(view, model);

        presenter.buttonClick();
        presenter.buttonClick();
        presenter.buttonClick();
        presenter.buttonClick();
    }
}
