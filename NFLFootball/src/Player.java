
public abstract class Player {
	
	String name;
	int playerId;
	
	public Player(String name, int playerId) {
	this.name = name;
	this.playerId = playerId;
	}
	
	public String getName(){
		return name;
	};
	
	public int getPlayerId(){
		return playerId;
	};
	
	public abstract String getPlayerPosition();
	public abstract String play();
	public abstract String toString();
}