public class PresenterOfT<T extends Calculator> {
 

    View view;
    Model model;

    public PresenterOfT(T m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick(){
        int a = view.getValue("Number X: ");
        int b = view.getValue("Number Y: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Sum:");
    }
}