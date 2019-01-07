
public class Memento {
	private Element state;
	
	public void setState(Element el){
		this.state = el;
	}
	
	public Element getState(){
		return this.state;
	}
}
