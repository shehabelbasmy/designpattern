package state;

public class EraserTool implements Tool {

	@Override
	public void mouseUp() {
		System.err.println("Eraser Clicked");
	}

	@Override
	public void mouseDown() {
		System.err.println("Use Eraser");
	}

}
