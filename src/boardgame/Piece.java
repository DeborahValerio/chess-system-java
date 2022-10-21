package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	// n�o � a posi��o do xadrez, e sim posi��o de matriz. � inicialmente nula - a pe�a n�o foi ainda colocada no tabuleiro
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

}
