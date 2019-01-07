import java.util.List;


public class ProxyImage extends Element{
	private String name;
	private Image img;

	public ProxyImage(String imagename){
		this.name = imagename;
		this.img = null;
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

	public String toString() {
		if(this.img == null){
			this.img = new Image(this.name);
		}

		return this.img.toString(); 
	}
}
