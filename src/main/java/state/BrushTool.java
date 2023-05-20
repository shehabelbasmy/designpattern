package state;

public class BrushTool implements Tool {

	@Override
	public void mouseUp() {
		System.err.println("Brush Clicked");
	}

	@Override
	public void mouseDown() {
		System.err.println("Draw Brush");

	}

}
