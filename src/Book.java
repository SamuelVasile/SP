import java.util.ArrayList;
import java.util.List;


public class Book extends Element{
	private String title;
	private TableOfContents toc;
	private List <Author> authors;
	private ArrayList <Element> elements;
	
	public Book(String title){
		this.elements = new ArrayList <Element>();
		this.title = title;
	}
	
	public String toString(){
		String str = "";
		String content = "";
		
		for(Author a : this.authors){
			str += a.name + " ";
		}

		for(Element el : this.elements){
			content += el.toString() + "\n";
		}

		return String.format("Title: %s \nAuthor: %s\nContent:\n%s", this.title, str, content);
	}
	
	@Override
	public void addElement(Element e){
		this.elements.add(e);
	}

	@Override
	public void removeElement(Element e) {
		this.elements.remove(e);
	}

	@Override
	public Element getChild(int index) {
		return this.elements.get(index);
	}
	
	@Override
	public List <Element> getChildren() {
		return this.elements;
	}


	@Override
	public void accept(Visitor v) {
		throw new UnsupportedOperationException();
	}
	
	public void addAuthor(ArrayList <Author> authors){
		this.authors = authors;
	}

	public void setToc(TableOfContents tableofcontents){
		this.toc = tableofcontents;
	}
}