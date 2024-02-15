
public class Quarterback extends Offense {
	private String position = "Quarterback";
	private String play = "throws passes";
	public Quarterback(String name, int playerId){
		super(name,playerId);
		
	}
	@Override
	public String getPlayerPosition() {
		return position;
	}

	@Override
	public String play() {
		
		return play;
	}

	@Override
	public String toString() {
		String result = "Name: "+getName()+
						"\nNumber: "+getPlayerId()+
						"\nPosition: "+getPlayerPosition()+
						"\nPlay: "+play();
		return result;
	}

}
