import java.util.ArrayList;

public class Creation {
    private ArrayList<Figure> list;

    public Creation(){
        list = new ArrayList<Figure>();
    }

    public void addFigure(Figure newFigure){
        list.add(newFigure);
    }

    public ArrayList getFigure(String color, String name){
        ArrayList<Figure> result = new ArrayList<Figure>();
        return result;
    }
}
