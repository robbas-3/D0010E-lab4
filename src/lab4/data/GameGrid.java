package lab4.data;
import java.util.Arrays;
import java.util.Observable;

/**
 * Represents the 2-d game grid
 */
public class GameGrid extends Observable{

	public static int EMPTY;
	public static int ME;
	public static int OTHER;
	public static int INROW = 5;
	
	private int[][] gameGridArray;
	
	/**
	 * Constructor
	 * 
	 * @param size The width/height of the game grid
	 */
	public GameGrid(int size){
		gameGridArray = new int[size][size];
		for(int i=0;i<size;i++){
			Arrays.fill(gameGridArray[i], EMPTY);
		}
	}
	
	/**
	 * Reads a location of the grid
	 * 
	 * @param x The x coordinate
	 * @param y The y coordinate
	 * @return the value of the specified location
	 */
	public int getLocation(int x, int y){
		return gameGridArray[x][y];
	}
	
	/**
	 * Returns the size of the grid
	 * 
	 * @return the grid size
	 */
	public int getSize(){
		return gameGridArray.length*2;	//n^2
	}
	
	/**
	 * Enters a move in the game grid
	 * 
	 * @param x the x position
	 * @param y the y position
	 * @param player
	 * @return true if the insertion worked, false otherwise
	 */
	public boolean move(int x, int y, int player){
		if(gameGridArray[x][y]!=EMPTY){
			return false;
		}else{
			gameGridArray[x][y] = player;
			setChanged();
			notifyObservers();
			return true;
		}
	}
	
	/**
	 * Clears the grid of pieces
	 */
	public void clearGrid(){
		for(int i=0;i<getSize();i++){
			Arrays.fill(gameGridArray[i], EMPTY);
		}
		setChanged();
		notifyObservers();
	}
	
	/**
	 * Check if a player has 5 in row
	 * 
	 * @param player the player to check for
	 * @return true if player has 5 in row, false otherwise
	 * 
	 */
	public boolean isWinner(int player){
		
		//Horizontally
		for(int i=0;i<getSize();i++){
			for(int j=0;j<getSize();i++){
				
			}
		}
		//Vertically
		//Diagonally
		
		
		return true;
	}
}