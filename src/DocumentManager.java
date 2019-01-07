import java.util.ArrayList;


public class DocumentManager {
	private static DocumentManager instance = null;
	private Element book;
	private ArrayList<Command> undobuffer = new ArrayList();
	
	// private constructor and a getInstance method, we're dealing with a Singleton Pattern here.
	private DocumentManager(){
	}

	public static DocumentManager getInstance(){
		if(instance == null){
			instance = new DocumentManager();
		}
		
		return instance;
	}
	
	public Element getBook(){
		return this.book;
	}
	
	public void setBook(Element newbook){
		this.book = newbook;
	}
	
	public void addCommand(Command c){
		this.undobuffer.add(c);
	}
	
	public Command getLastCommand(){
		return this.undobuffer.get(this.undobuffer.size() - 1);
	}
}