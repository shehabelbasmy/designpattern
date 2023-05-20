package momento;

public class Main {

	public static void main(String[] args) {
		Editor editor=new Editor();
		EditorState state1=new EditorState();
		state1.setContent("shehab");
		state1.setTitile("elbasmy");
		editor.createState(state1);
		EditorState state2=new EditorState();
		state2.setContent("mohamed");
		state2.setTitile("yasser");
		editor.createState(state2);
		EditorState state3=new EditorState();
		state3.setContent("ahmed");
		state3.setTitile("rashed");
		editor.createState(state3);
		editor.undo();
		EditorState state4=new EditorState();
		state4.setContent("yasser");
		state4.setTitile("rashed");
		editor.createState(state4);
		editor.undo();
		System.err.println(editor.getCurrentState().getContent());
		
	}

}
