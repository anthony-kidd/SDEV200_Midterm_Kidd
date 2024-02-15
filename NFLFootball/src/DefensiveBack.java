
public class DefensiveBack extends Defense{
	private String position = "Defensive Back";
	private String play = "block";

	public DefensiveBack(String name, int playerId) {
		super(name, playerId);

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
