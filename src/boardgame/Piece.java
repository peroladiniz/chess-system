package boardgame;

public class Piece {
	
	protected Position positon;
	private Board board;
	public Object position;
	
	public Piece(Board board) {
		this.board = board;	
		positon = null;
	}

	protected Board getBoard() {
		return board;
	}
	
}
