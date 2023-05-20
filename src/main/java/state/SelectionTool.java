package state;

public class SelectionTool implements Tool {

	@Override
	public void mouseUp() {
		System.err.println("Draw SelectionTool");
	}

	@Override
	public void mouseDown() {
		System.err.println("SelectionTool Clicked ");
	}

}
