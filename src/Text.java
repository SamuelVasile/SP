
public class Text extends Element{
	private String text;
	private AlignStrategy alignstrategy = null;
	
	public Text(String text){
		this.text = text;
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

	public void setAlignStrategy(AlignStrategy a){
		this.alignstrategy = a;
	}
	
	@Override
	public String toString() {
		if(this.alignstrategy == null){
			return this.text;
		}
		else{
			return this.alignstrategy.toString(this.text);
		}
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
