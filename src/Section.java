import java.util.ArrayList;
import java.util.List;

public class Section extends Element{
	public List <Element> components = new ArrayList <Element> ();
	private String title;

	public Section(String title){
		this.title = title;
	}

	@Override
	public void addElement(Element el){
		this.components.add(el);
	}

	@Override	
	public void removeElement(Element el){
		this.components.remove(el);
	}
	
	@Override
	public Element getChild(int index) {
		return this.components.get(index);
	} 
	
	@Override
	public List <Element> getChildren() {
		return this.components;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);

		for(Element e: components){
			e.accept(v);
		}
	}
	
	public String getTitle(){
		return this.title;
	}

	public String toString() {
		String comps = "";

		for(Element c : components){
			comps += c.toString() + " \n";
		}
		
		return String.format("%s: \n%s", this.title, comps);
	}
}