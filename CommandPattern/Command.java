// Each command issued will implement the Command interface
public interface Command {
	
	public void execute();
	
	public void undo();

}
