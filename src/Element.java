import java.util.ArrayList;
import java.util.List;

public abstract class Element {
	public abstract void addElement(Element e);
	public abstract void removeElement(Element e);
	public abstract Element getChild(int index);
	public abstract void accept(Visitor v);
	public abstract String toString();
	public abstract List <Element> getChildren();
}