import java.util.Vector;

public class VectorClass {
    Vector<String> vec_tor = new Vector<String>();

    public VectorClass() {

        vec_tor.addElement("1");
        vec_tor.addElement("2");
        vec_tor.addElement("luka");

    }

    public void addString(String text) {
        vec_tor.addElement(text);
    }

    public void deleteLastString() {
        vec_tor.remove(vec_tor.size()-1);
        vec_tor.forEach(System.out::println);
    }
}
