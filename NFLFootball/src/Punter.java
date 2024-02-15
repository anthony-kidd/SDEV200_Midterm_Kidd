
public class Punter extends SpecialTeams{
	private String position = "Punter";
	private String play = "Punt";

	public Punter(String name, int playerId) {
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
