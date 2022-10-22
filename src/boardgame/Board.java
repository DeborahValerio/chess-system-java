package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	// o tabuleiro possui uma quantidade de linhas rows e colunas columns, e esta associado as pe�as
	// o tabuleiro possui uma matriz de pe�as, chamada pieces
	
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
	
	// Metodo responsavel por colocar a pe�a piece na posi��o position do tabuleiro
	// O metodo vai na matriz de pe�as do tabuleiro, na linha position.getRow e coluna position.getColumn, 
	// e atribuir para essa pe�a a pe�a que veio como argumento
	// Essa pe�a agora n�o est� mais na posi��o nula. Ent�o a pe�a piece recebe a posi��o position que foi
	// informada como argumento do m�todo
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
}
