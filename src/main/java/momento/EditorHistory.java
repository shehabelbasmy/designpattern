package momento;

import java.util.ArrayList;
import java.util.List;

public class EditorHistory {

	private List<EditorState> stateList=new ArrayList<EditorState>();

	public void push(EditorState editorState) {
		stateList.add(editorState);
	}
	
	public EditorState pop() {
		int lastelement = stateList.size()-1;
		stateList.remove(lastelement);
		return stateList.get(lastelement-1);
	}
}
