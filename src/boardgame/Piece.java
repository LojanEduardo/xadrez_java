package boardgame;

public class Piece {
	
	protected Position position;
	private Board board; //um Board para muitas pe�as
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}	
	
	
}
