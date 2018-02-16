package markerexample;

public class TestMarker {
	public static void main(String[] args) {
		
		
		BoardMarker bm = new BoardMarker();
		Raymond r = new Raymond();
		Rate rt = new Rate();
		Hack h = new Hack();
		
		
		Write w = bm.writeOnBoard(h, r, rt);
	}

}
