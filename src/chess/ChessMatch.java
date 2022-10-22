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

	// Esse metodo retorna a matriz de peças da partida de xadrez
	// De que forma? é criada uma matriz auxiliar mat, do tipo ChessPiece, com a
	// quantidade de linhas e colunas do tabuleiro
	// Vamos percorrer a matriz de peças do tabuleiro, e para cada peça do tabuleiro
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

	// Esse método é responsavél por iniciar a partida de xadrez colocando as peças no tabuleiro
	// Esse método será chamado na instanciação da partida, pois está no construtor da classe ChessMatch
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
	}

}
