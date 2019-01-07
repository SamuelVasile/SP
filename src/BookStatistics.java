
public class BookStatistics extends Visitor{
	private int numberofsections = 0;
	private int numberofimages = 0;
	private int numberofproxyimages = 0;
	private int numberoftexts = 0;
	private int numberoftables = 0;

	@Override
	public void visit(Paragraph txt) {
		this.numberoftexts++;
	}

	@Override
	public void visit(Table table) {
		this.numberoftables++;
	}

	@Override
	public void visit(ProxyImage pimg) {
		this.numberofproxyimages++;
	}

	@Override
	public void visit(Image img) {
		this.numberofimages++;
	}

	@Override
	public void visit(Book b) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void visit(Section s) {
		this.numberofsections++;
	}

	public String toString(){
		return "Sections: " + this.numberofsections + ", Paragraphs: " + this.numberoftexts + ", Tables: " + this.numberoftables + ", Images: " + this.numberofimages + ", ProxyImages: " + this.numberofproxyimages;
	}
}
