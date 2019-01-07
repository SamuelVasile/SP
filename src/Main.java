import java.util.ArrayList;


public class Main {

	/**
	 * @param args
	 */
	/*
	public static void main(String[] args){
		DocumentManager docmanager = DocumentManager.getInstance();

		Command cmd1 = new OpenCommand("/home/alex/workspace/design-patterns/book.json");
	    cmd1.execute();
	    Command cmd2 = new StatisticsCommand();
	    cmd2.execute();
	    System.out.println(docmanager.getBook().toString());
	}*/

	public static void main(String[] args) throws Exception {            
	    Section cap1 = new Section("Capitolul 1");
	    cap1.addElement(new Paragraph("Moto capitol"));
	    cap1.addElement(new Paragraph("Another One"));
	    cap1.addElement(new Paragraph("Another Two"));
	    cap1.addElement(new Paragraph("Another Three"));
	    DocumentManager.getInstance().setBook(cap1);
	    
	    System.out.println("Book Content: ");
	    System.out.println(DocumentManager.getInstance().getBook());
	        
	    Command cmd = new DeleteCommand();
	    cmd.execute();
	    System.out.println("Book Content after the first delete: ");
	    System.out.println(DocumentManager.getInstance().getBook());
	    cmd.execute();
	    System.out.println("Book Content after the second delete: ");
	    System.out.println(DocumentManager.getInstance().getBook());

	    Command undoCommand = new UndoCommand();
	    undoCommand.execute();
	    System.out.println("Book Content after first undo: ");
	    System.out.println(DocumentManager.getInstance().getBook());
	    
	    undoCommand.execute();
	    System.out.println("Book Content after second undo: ");
	    System.out.println(DocumentManager.getInstance().getBook());
	}
}