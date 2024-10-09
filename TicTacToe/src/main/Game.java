package main;

public class Game {

	public static void main(String[] args) {
		char board[] = {'1', '2', '3',
						'4', '5', '6',
						'7', '8', '9'};
		
		var numOfSquares = 0;
		var whoseTurn = 'x';
		
		while(numOfSquares < 9) {
			printBoard(board);
			System.out.printf("Choose a square player %s:", whoseTurn);

			  var scanner = new java.util.Scanner(System.in);
			  var input = scanner.nextInt();

			  board[input-1] = whoseTurn;
		
				if (  (board[0] + board[1] + board[2] == (whoseTurn * 3)) // first row 
						   || (board[3] + board[4] + board[5] == (whoseTurn * 3)) // second row
						   || (board[6] + board[7] + board[8] == (whoseTurn * 3)) // third row
						   || (board[0] + board[3] + board[6] == (whoseTurn * 3)) // first column
						   || (board[1] + board[4] + board[7] == (whoseTurn * 3)) // second column
						   || (board[2] + board[5] + board[8] == (whoseTurn * 3)) // third column
						   || (board[0] + board[4] + board[8] == (whoseTurn * 3)) // first diagonal
						   || (board[2] + board[4] + board[6] == (whoseTurn * 3)) // second diagonal
						) 
						{
						  printBoard(board);
						  System.out.println("You won!!! Congratulations!");
						  break;
						} else {
						  numOfSquares++;
						  whoseTurn = (whoseTurn == 'x') ? 'o' : 'x';
						}
		}

	}
	
	private static void printBoard(char[] board) 
	{
	  System.out.println( board[0] + " | " +  board[1] + " | " + board[2]);
	  System.out.println( " - + - + - " );
	  System.out.println( board[3] + " | " +  board[4] + " | " + board[5]);
	  System.out.println( " - + - + - " );
	  System.out.println( board[6] + " | " +  board[7] + " | " + board[8]);
	}

}
