
public class StatisticsCommand implements Command{

	@Override
	public void execute() {
		BookStatistics stats = new BookStatistics();
		DocumentManager docmanager = DocumentManager.getInstance();
		docmanager.getBook().accept(stats);

		System.out.println(stats);
	}
	
	@Override
	public void unexecute(){
		throw new UnsupportedOperationException();
	}
}