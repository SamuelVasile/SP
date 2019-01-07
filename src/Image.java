import java.util.List;
import java.util.concurrent.TimeUnit;


public class Image extends Element{
	private String name;
	
	public Image(String name){
		this.name = name;

		try{
			TimeUnit.SECONDS.sleep(5);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
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
		return this.name;
	}
}
