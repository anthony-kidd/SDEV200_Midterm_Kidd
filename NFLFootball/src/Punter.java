
public class Punter extends SpecialTeams{
	private String position = "Punter";
	private String play = "Punt";

	public Punter(String name, String playerId, String positionType,String position, String play) {
		super(name, playerId, positionType);
		this.position = position;
		this.play = play;
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
		String result = "Name: "+name+
						"\nNumber: "+playerId+
						"\nPosition Type: "+positionType+
						"\nPosition: "+position+
						"\nPlay: "+play;
		return result;
	}

}
