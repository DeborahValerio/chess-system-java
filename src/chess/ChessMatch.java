package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	// Esse metodo retorna a matriz de pe�as da partida de xadrez
	// De que forma? � criada uma matriz auxiliar mat, do tipo ChessPiece, com a
	// quantidade de linhas e colunas do tabuleiro
	// Vamos percorrer a matriz de pe�as do tabuleiro, e para cada pe�a do tabuleiro
	// vamos fazer o downcasting para ChessPiece
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}

	// Esse m�todo � responsav�l por iniciar a partida de xadrez colocando as pe�as no tabuleiro
	// Esse m�todo ser� chamado na instancia��o da partida, pois est� no construtor aqui da classe ChessMatch
	private void initialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.BLACK));
		placeNewPiece('e', 1, new King(board, Color.WHITE));
	}

}