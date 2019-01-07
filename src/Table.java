import java.util.List;


public class Table extends Element {
	private String name;
	
	public Table(String name){
		this.name = name;
	}

	public String toString() {
		return this.name;
	}

	@Override
	public void addElement(Element e) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeElement(Element e) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Element getChild(int index) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public List <Element> getChildren() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
