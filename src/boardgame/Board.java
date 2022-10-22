package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	// o tabuleiro possui uma quantidade de linhas rows e colunas columns, e esta associado as peças
	// o tabuleiro possui uma matriz de peças, chamada pieces
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	// Metodo responsavel por colocar a peça piece na posição position do tabuleiro
	// O metodo vai na matriz de peças do tabuleiro, na linha position.getRow e coluna position.getColumn, 
	// e atribuir para essa peça a peça que veio como argumento
	// Essa peça agora não está mais na posição nula. Então a peça piece recebe a posição position que foi
	// informada como argumento do método
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
}
