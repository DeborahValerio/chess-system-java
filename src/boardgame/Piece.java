package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	// não é a posição do xadrez, e sim posição de matriz. É inicialmente nula - a peça não foi ainda colocada no tabuleiro
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

}
