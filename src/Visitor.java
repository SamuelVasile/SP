
public abstract class Visitor {
	public abstract void visit(Section s);
	public abstract void visit(Paragraph txt);
	public abstract void visit(Table table);
	public abstract void visit(ProxyImage pimg);
	public abstract void visit(Image img);
	public abstract void visit(Book b);
}
