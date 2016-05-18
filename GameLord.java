package com.neumont.csc150.Pong;

public class GameLord {
		
		private int scoreP1;
		private int scoreP2;
		private boolean winP1;
		private boolean winP2;
		private int ballX;
		private int ballY;
		private boolean winnerP1;
		private boolean winnerP2;
		private boolean goLeft;
		public static final int MAX_SCORE = 8;
		
	public GameLord() {
		
	}

	public int getScoreP1() {
		return scoreP1;
	}
	
	public int getScoreP2() {
		return scoreP2;
	}

	public void setScores(int score) {
		if(winP1 == true){
			scoreP1++;
		}else if(winP2 == true){
			scoreP2++;
		}
		winP1 = false;
		winP2 = false;
	}
	
	

	public boolean isWinP1() {
		return winP1;
	}

	public void setWinP1(boolean win) {
		if(ballX < leftPaddle.Paddlex){
			winP1 = true;
		}
	}
	
	public boolean isWinP2() {
		return winP2;
	}

	public void setWin(boolean win) {
		if(ballX > rightPaddle.Paddlex){
			winP2 = true;
		}
	}
	
	
	public boolean isWinnerP1() {
		return winnerP1;
	}

	public boolean isWinnerP2() {
		return winnerP2;
	}
	
	public void setWinner(boolean winner) {
		if(scoreP1 == 8){
			winnerP1 = true;
		}else if(scoreP2 == 8){
			winnerP2 = true;
		}
	}

	public static int getMaxScore() {
		return MAX_SCORE;
	}
	
	

	
	
	
	
	
	public int getBallX() {
		return ballX;
	}

	
	public void setBallX(int ballX) {
		while(winnerP1 == false && winnerP2 == false){
			while(ballX < paddle2X){
				ballX++;
				if(ballX == paddle2X && ballY > paddle2Y && ballY < paddle2Y + paddleHeight){
					goLeft = true;
				}
			}while(goLeft){
				ballX--;
				if(ballX == paddleX && ballY > paddleY && ballY < paddleY + paddleHeight){
					goLeft = false;
				}
			}
		}
	}

	public int getBallY() {
		return ballY;
	}

	public void setBallY(int ballY) {
		while(winnerP1 == false && winnerP2 == false){
			while(ballY < ScreenTop){
				ballY++;
			}while(ballY > ScreenBottom){
				ballY--;
			}
		}
	}
	

}
