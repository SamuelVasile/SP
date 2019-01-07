
public class DeleteCommand implements Command{
	private Memento memento;

	public DeleteCommand(){
		this.memento = new Memento();
	}
	
	@Override
	public void execute() {
		DocumentManager docmanager = DocumentManager.getInstance();
		docmanager.addCommand(this);
		Element book = docmanager.getBook();
		
		Element lastel = book.getChildren().get(book.getChildren().size() - 1);
		this.memento.setState(lastel);

		book.removeElement(lastel);
	}
	
	public void unexecute(){
		DocumentManager docmanager = DocumentManager.getInstance();
		Element book = docmanager.getBook();

		book.addElement(this.memento.getState());
	}
}