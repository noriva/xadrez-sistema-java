package boardgame;

public class Piece {
	
	protected Position position ;
	private Board board ;
	
	public Piece(Board board) {
		// TODO Auto-generated constructor stub
		this.board = board;
		position   = null ;
	}

	protected Board getBoard() {
		return board;
	}

	
	
	
	
	
}
