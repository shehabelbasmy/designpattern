package momento;

public class Editor {

	private EditorHistory history=new EditorHistory();
	private EditorState currentState;
	
	public void createState(EditorState editorState) {
		currentState=editorState;
		history.push(editorState);
	}
	
	public void undo() {
		currentState= history.pop();
	}

	public EditorState getCurrentState() {
		return currentState;
	}

}
