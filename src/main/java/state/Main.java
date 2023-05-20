package state;

public class Main {

	public static void main(String[] args) {
		var canvas=new Canvas();
		canvas.setTool(new EraserTool());
		canvas.mouseUp();
		canvas.mouseDown();
	}

}
