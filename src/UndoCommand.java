
public class UndoCommand implements Command{

	@Override
	public void execute() {
		DocumentManager docmanager = DocumentManager.getInstance();
		docmanager.getLastCommand().unexecute();
		docmanager.addCommand(this);
	}

	public void unexecute() {
	}
}