package chess;

import java.util.ArrayList;

class ReturnPiece {
	static enum PieceType {WP, WR, WN, WB, WQ, WK, 
		            BP, BR, BN, BB, BK, BQ};
	static enum PieceFile {a, b, c, d, e, f, g, h};
	
	PieceType pieceType;
	PieceFile pieceFile;
	int pieceRank;  // 1..8
	public String toString() {
		return ""+pieceFile+pieceRank+":"+pieceType;
	}
	public boolean equals(Object other) {
		if (other == null || !(other instanceof ReturnPiece)) {
			return false;
		}
		ReturnPiece otherPiece = (ReturnPiece)other;
		return pieceType == otherPiece.pieceType &&
				pieceFile == otherPiece.pieceFile &&
				pieceRank == otherPiece.pieceRank;
	}
}

class ReturnPlay {
	enum Message {ILLEGAL_MOVE, DRAW, 
				  RESIGN_BLACK_WINS, RESIGN_WHITE_WINS, 
				  CHECK, CHECKMATE_BLACK_WINS,	CHECKMATE_WHITE_WINS, 
				  STALEMATE};
	
	ArrayList<ReturnPiece> piecesOnBoard;
	Message message;
}

public class Chess {
	
	enum Player { white, black }

	static ReturnPlay game = new ReturnPlay();
	
	/**
	 * Plays the next move for whichever player has the turn.
	 * 
	 * @param move String for next move, e.g. "a2 a3"
	 * 
	 * @return A ReturnPlay instance that contains the result of the move.
	 *         See the section "The Chess class" in the assignment description for details of
	 *         the contents of the returned ReturnPlay instance.
	 */
	public static ReturnPlay play(String move) {

		/* FILL IN THIS METHOD */
		
		/* FOLLOWING LINE IS A PLACEHOLDER TO MAKE COMPILER HAPPY */
		/* WHEN YOU FILL IN THIS METHOD, YOU NEED TO RETURN A ReturnPlay OBJECT */
        ReturnPlay bruh = new ReturnPlay();
		return bruh;
	}
	
	
	/**
	 * This method should reset the game, and start from scratch.
	 */
	public static void start() {

		

		ArrayList<ReturnPiece> pieces = new ArrayList<>();
		
		ReturnPiece wp1 = new ReturnPiece();
		wp1.pieceType = ReturnPiece.PieceType.WP;
		wp1.pieceFile = ReturnPiece.PieceFile.a;
		wp1.pieceRank = 2;
		pieces.add(wp1);

		ReturnPiece wp2 = new ReturnPiece();
		wp2.pieceType = ReturnPiece.PieceType.WP;
		wp2.pieceFile = ReturnPiece.PieceFile.b;
		wp2.pieceRank = 2;
		pieces.add(wp2);

		ReturnPiece wp3 = new ReturnPiece();
		wp3.pieceType = ReturnPiece.PieceType.WP;
		wp3.pieceFile = ReturnPiece.PieceFile.c;
		wp3.pieceRank = 2;
		pieces.add(wp3);

		ReturnPiece wp4 = new ReturnPiece();
		wp4.pieceType = ReturnPiece.PieceType.WP;
		wp4.pieceFile = ReturnPiece.PieceFile.d;
		wp4.pieceRank = 2;
		pieces.add(wp4);

		ReturnPiece wp5 = new ReturnPiece();
		wp5.pieceType = ReturnPiece.PieceType.WP;
		wp5.pieceFile = ReturnPiece.PieceFile.e;
		wp5.pieceRank = 2;
		pieces.add(wp5);

		ReturnPiece wp6 = new ReturnPiece();
		wp6.pieceType = ReturnPiece.PieceType.WP;
		wp6.pieceFile = ReturnPiece.PieceFile.f;
		wp6.pieceRank = 2;
		pieces.add(wp6);

		ReturnPiece wp7 = new ReturnPiece();
		wp7.pieceType = ReturnPiece.PieceType.WP;
		wp7.pieceFile = ReturnPiece.PieceFile.g;
		wp7.pieceRank = 2;
		pieces.add(wp7);

		ReturnPiece wp8 = new ReturnPiece();
		wp8.pieceType = ReturnPiece.PieceType.WP;
		wp8.pieceFile = ReturnPiece.PieceFile.h;
		wp8.pieceRank = 2;
		pieces.add(wp8);

		ReturnPiece wr1 = new ReturnPiece();
		wr1.pieceType = ReturnPiece.PieceType.WR;
		wr1.pieceFile = ReturnPiece.PieceFile.a;
		wr1.pieceRank = 1;
		pieces.add(wr1);

		ReturnPiece wr2 = new ReturnPiece();
		wr2.pieceType = ReturnPiece.PieceType.WR;
		wr2.pieceFile = ReturnPiece.PieceFile.h;
		wr2.pieceRank = 1;
		pieces.add(wr2);

		ReturnPiece wn1 = new ReturnPiece();
		wn1.pieceType = ReturnPiece.PieceType.WN;
		wn1.pieceFile = ReturnPiece.PieceFile.b;
		wn1.pieceRank = 1;
		pieces.add(wn1);

		ReturnPiece wn2 = new ReturnPiece();
		wn2.pieceType = ReturnPiece.PieceType.WN;
		wn2.pieceFile = ReturnPiece.PieceFile.g;
		wn2.pieceRank = 1;
		pieces.add(wn2);

		ReturnPiece wb1 = new ReturnPiece();
		wb1.pieceType = ReturnPiece.PieceType.WB;
		wb1.pieceFile = ReturnPiece.PieceFile.c;
		wb1.pieceRank = 1;
		pieces.add(wb1);

		ReturnPiece wb2 = new ReturnPiece();
		wb2.pieceType = ReturnPiece.PieceType.WB;
		wb2.pieceFile = ReturnPiece.PieceFile.f;
		wb2.pieceRank = 1;
		pieces.add(wb2);

		ReturnPiece wq = new ReturnPiece();
		wq.pieceType = ReturnPiece.PieceType.WQ;
		wq.pieceFile = ReturnPiece.PieceFile.d;
		wq.pieceRank = 1;
		pieces.add(wq);

		ReturnPiece wk = new ReturnPiece();
		wk.pieceType = ReturnPiece.PieceType.WK;
		wk.pieceFile = ReturnPiece.PieceFile.e;
		wk.pieceRank = 1;
		pieces.add(wk);

		ReturnPiece bp1 = new ReturnPiece();
		bp1.pieceType = ReturnPiece.PieceType.BP;
		bp1.pieceFile = ReturnPiece.PieceFile.c;
		bp1.pieceRank = 7;
		pieces.add(bp1);

		ReturnPiece bp2 = new ReturnPiece();
		bp2.pieceType = ReturnPiece.PieceType.BP;
		bp2.pieceFile = ReturnPiece.PieceFile.b;
		bp2.pieceRank = 7;
		pieces.add(bp2);

		ReturnPiece bp3 = new ReturnPiece();
		bp3.pieceType = ReturnPiece.PieceType.BP;
		bp3.pieceFile = ReturnPiece.PieceFile.c;
		bp3.pieceRank = 7;
		pieces.add(bp3);

		ReturnPiece bp4 = new ReturnPiece();
		bp4.pieceType = ReturnPiece.PieceType.BP;
		bp4.pieceFile = ReturnPiece.PieceFile.d;
		bp4.pieceRank = 7;
		pieces.add(bp4);

		ReturnPiece bp5 = new ReturnPiece();
		bp5.pieceType = ReturnPiece.PieceType.BP;
		bp5.pieceFile = ReturnPiece.PieceFile.e;
		bp5.pieceRank = 7;
		pieces.add(bp5);

		ReturnPiece bp6 = new ReturnPiece();
		bp6.pieceType = ReturnPiece.PieceType.BP;
		bp6.pieceFile = ReturnPiece.PieceFile.f;
		bp6.pieceRank = 7;
		pieces.add(bp6);

		ReturnPiece bp7 = new ReturnPiece();
		bp7.pieceType = ReturnPiece.PieceType.BP;
		bp7.pieceFile = ReturnPiece.PieceFile.g;
		bp7.pieceRank = 7;
		pieces.add(bp7);

		ReturnPiece bp8 = new ReturnPiece();
		bp8.pieceType = ReturnPiece.PieceType.BP;
		bp8.pieceFile = ReturnPiece.PieceFile.h;
		bp8.pieceRank = 7;
		pieces.add(bp8);

		ReturnPiece br1 = new ReturnPiece();
		br1.pieceType = ReturnPiece.PieceType.BR;
		br1.pieceFile = ReturnPiece.PieceFile.a;
		br1.pieceRank = 8;
		pieces.add(br1);

		ReturnPiece br2 = new ReturnPiece();
		br2.pieceType = ReturnPiece.PieceType.BR;
		br2.pieceFile = ReturnPiece.PieceFile.h;
		br2.pieceRank = 8;
		pieces.add(br2);

		ReturnPiece bn1 = new ReturnPiece();
		bn1.pieceType = ReturnPiece.PieceType.BN;
		bn1.pieceFile = ReturnPiece.PieceFile.b;
		bn1.pieceRank = 8;
		pieces.add(bn1);

		ReturnPiece bn2 = new ReturnPiece();
		bn2.pieceType = ReturnPiece.PieceType.BN;
		bn2.pieceFile = ReturnPiece.PieceFile.g;
		bn2.pieceRank = 8;
		pieces.add(bn2);

		ReturnPiece bb1 = new ReturnPiece();
		bb1.pieceType = ReturnPiece.PieceType.BB;
		bb1.pieceFile = ReturnPiece.PieceFile.c;
		bb1.pieceRank = 8;
		pieces.add(bb1);

		ReturnPiece bb2 = new ReturnPiece();
		bb2.pieceType = ReturnPiece.PieceType.BB;
		bb2.pieceFile = ReturnPiece.PieceFile.f;
		bb2.pieceRank = 8;
		pieces.add(bb2);

		ReturnPiece bq = new ReturnPiece();
		bq.pieceType = ReturnPiece.PieceType.BQ;
		bq.pieceFile = ReturnPiece.PieceFile.d;
		bq.pieceRank = 8;
		pieces.add(bq);

		ReturnPiece bk = new ReturnPiece();
		bk.pieceType = ReturnPiece.PieceType.BK;
		bk.pieceFile = ReturnPiece.PieceFile.e;
		bk.pieceRank = 8;
		pieces.add(bk);

		game.piecesOnBoard = pieces;
		/* FILL IN THIS METHOD */
	}
}
