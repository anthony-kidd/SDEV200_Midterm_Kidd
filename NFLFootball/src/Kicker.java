
public class Kicker extends SpecialTeams{
	private String position = "Kicker";
	private String play = "Kick field goals";

	public Kicker(String name, int playerId) {
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
