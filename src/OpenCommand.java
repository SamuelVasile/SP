
public class OpenCommand implements Command{
	private String path;

	public OpenCommand(String pathtojsonfile){
		this.path = pathtojsonfile;
	}
	
	@Override
	public void execute() {
		DocumentManager docmanager = DocumentManager.getInstance();
		JsonBuilder builder = new JsonBuilder(this.path);
		builder.build();
		docmanager.setBook(builder.getResult());
	}
	
	@Override
	public void unexecute(){
		throw new UnsupportedOperationException();
	}
}