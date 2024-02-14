
public abstract class Player {
	
	String name;
	String playerId;
	
	public Player(String name, String playerId) {
	this.name = name;
	this.playerId = playerId;
	}
	
	public String getName(){
		return name;
	};
	
	public String getPlayerId(){
		return playerId;
	};
	
	public abstract String getPlayerPosition();
	public abstract String play();
	public abstract String toString();
}